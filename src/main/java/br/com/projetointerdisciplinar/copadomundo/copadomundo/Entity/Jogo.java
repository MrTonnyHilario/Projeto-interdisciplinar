package br.com.projetointerdisciplinar.copadomundo.copadomundo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
 
@entity
@noArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idJogo;

    @Column(nullable=false)
    private LocalDateTime dataJogo;

    @collum(nullable=false, lengh= 50)
    private String localJogo;

    @JoinColumn(name="idSelecao_fk")
    private Selecao selecao1;

    @JoinColumn(name= "idSelecao_fk")
    private Selecao selecao2;


    
    
}