package br.com.projetointerdisciplinar.copadomundo.copadomundo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity.Jogador;
import br.com.projetointerdisciplinar.copadomundo.copadomundo.Repository.JogadorRepository;

@Service
public class JogadorService {
     
    @Autowired
    private JogadorRepository jogadorRepository;

    public List<Jogador> listarTodos() {
        return jogadorRepository.findAll();
    }

    public void salvar(Jogador jogador) {
        jogadorRepository.save(jogador);
    }

    public Jogador buscarPorId(Integer id) {
        return jogadorRepository.findById(id).orElse(null);
    }

    public void atualizar(Jogador jogador) {
        jogadorRepository.save(jogador);
    }
    public void deletar(Integer id) {
        jogadorRepository.deleteById(id);
    }
}
