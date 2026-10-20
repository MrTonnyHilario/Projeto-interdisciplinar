package br.com.projetointerdisciplinar.copadomundo.copadomundo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity.Pais;

public interface PaisRepository extends JpaRepository<Pais, Integer> {
    
}
