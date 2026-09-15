package br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPais;

    @Column(nullable=false, length=50)
    private String nomePais;

    @Column(nullable=false, length=50)
    private String continentePais;

    @Column(nullable=false, length=2)
    private String siglaPais;

    //bandeira pais
}