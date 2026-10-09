package br.com.projetointerdisciplinar.copadomundo.copadomundo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Integer> {
    
}
