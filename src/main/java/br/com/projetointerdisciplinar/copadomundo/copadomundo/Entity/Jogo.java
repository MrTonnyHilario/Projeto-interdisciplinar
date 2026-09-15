package br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity;
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
 
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idJogo;

    @Column(nullable=false)
    private LocalDateTime dataJogo;

    @Column(nullable=false, length= 50)
    private String localJogo;

    @JoinColumn(name="idSelecao_fk")
    private Selecao selecao1;

    @JoinColumn(name= "idSelecao_fk")
    private Selecao selecao2;


    
    
}