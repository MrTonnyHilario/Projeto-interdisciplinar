package br.com.projetointerdisciplinar.copadomundo.copadomundo.Repository;


    import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    Optional<Usuario> findByLoginUsuario(String loginUsuario);

}

