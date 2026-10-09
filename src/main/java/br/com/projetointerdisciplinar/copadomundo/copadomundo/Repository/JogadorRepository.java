package br.com.projetointerdisciplinar.copadomundo.copadomundo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Integer> {
    
}
