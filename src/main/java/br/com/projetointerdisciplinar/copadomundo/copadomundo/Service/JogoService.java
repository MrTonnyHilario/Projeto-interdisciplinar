package br.com.projetointerdisciplinar.copadomundo.copadomundo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity.Jogo;
import br.com.projetointerdisciplinar.copadomundo.copadomundo.Repository.JogoRepository;

public class JogoService {
    
    @Autowired
    private JogoRepository jogoRepository;

    public List<Jogo> listarTodos() {
        return jogoRepository.findAll();
    }

    public void salvar(Jogo jogo) {
        jogoRepository.save(jogo);
    }

    public Jogo buscarPorId(Integer id) {
        return jogoRepository.findById(id).orElse(null);
    }

    public void atualizar(Jogo jogo) {
        jogoRepository.save(jogo);
    }

    public void deletar(Integer id) {
        jogoRepository.deleteById(id);
    }
}
