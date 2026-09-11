package br.com.projetointerdisciplinar.copadomundo.copadomundo.entity;

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

public class Selecao{
    //id, nome, brasao, estadio, tecnico, classificação, serie
    //fk pais, idPais
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idSelecao;

    @Column(nullable=false, length=50)
    private String nomeSelecao;

    //brasao da seleção//

    @Column(nullable=false, length=40)
    private String estadioSelecao;

    @Column(nullable=false, length=50)
    private String tecnicoSelecao;

    @Column(nullable=false, length=30)
    private String divisaoSelecao;

    @Column(nullable=false, length=30)
    private String classificacaoSelecao;

    @JoinColumn(name="idPais_fk")
    private Pais pais;
}