package br.com.projetointerdisciplinar.copadomundo.copadomundo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn(name = "idSelecao1_fk")
    private Selecao selecao1;

    @ManyToOne
    @JoinColumn(name = "idSelecao2_fk")
    private Selecao selecao2;


    
    
}