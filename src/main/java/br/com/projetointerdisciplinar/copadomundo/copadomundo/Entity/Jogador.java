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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idJogador;

    @Column(nullable=false, length=50)
    private String nomeJogador;

    @Column(nullable=false, length=30)
    private String posicaoJogador;

    @Column(nullable=false)
    private LocalDate dataNascimentoJogador;

    @Column(nullable=false, length=30)
    private String alturaJogador;

    @ManyToOne
    @JoinColumn(name="idSelecao_fk")
    private Selecao selecao;

    @ManyToOne
    @JoinColumn(name="idPais_fk")
    private Pais pais;
    

    


}   