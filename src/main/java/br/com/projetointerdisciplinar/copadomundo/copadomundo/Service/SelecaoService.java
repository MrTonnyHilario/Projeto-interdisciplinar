package br.com.projetointerdisciplinar.copadomundo.copadomundo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity.Selecao;
import br.com.projetointerdisciplinar.copadomundo.copadomundo.Repository.SelecaoRepository;

@Service
public class SelecaoService {

    @Autowired
    private SelecaoRepository selecaoRepository;

    public List<Selecao> listarTodos() {
        return selecaoRepository.findAll();
    }

    public void salvar(Selecao selecao) {
        selecaoRepository.save(selecao);
    }

    public Selecao buscarPorId(Integer id) {
        return selecaoRepository.findById(id).orElse(null);
    }

    public void atualizar(Selecao selecao) {
        selecaoRepository.save(selecao);
    }

    public void deletar(Integer id) {
        selecaoRepository.deleteById(id);
    }
}
