package br.com.allthings.allthings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.allthings.allthings.entity.Cliente;
import br.com.allthings.allthings.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //Método para salvar um cliente
    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }
    
    //Método para listar todos os clientes
    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    //Método para excluir um cliente pelo id
    public void deleteById(Integer id){
        clienteRepository.deleteById(id);
    }

    //Método para buscar o cliente pelo id
    public Cliente findById(Integer id){
        return clienteRepository.findById(id).orElse(null);
    }
    
}
