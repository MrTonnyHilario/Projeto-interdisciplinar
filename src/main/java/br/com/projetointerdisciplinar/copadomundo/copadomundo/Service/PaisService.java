package br.com.projetointerdisciplinar.copadomundo.copadomundo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity.Pais;
import br.com.projetointerdisciplinar.copadomundo.copadomundo.Repository.PaisRepository;

@Service
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> listarTodos() {
        return paisRepository.findAll();
    }

    public void salvar(Pais pais) {
        paisRepository.save(pais);
    }

    public Pais buscarPorId(Integer id) {
        return paisRepository.findById(id).orElse(null);
    }

    public void atualizar(Pais pais) {
        paisRepository.save(pais);
    }

    public void deletar(Integer id) {
        paisRepository.deleteById(id);
    }
}
