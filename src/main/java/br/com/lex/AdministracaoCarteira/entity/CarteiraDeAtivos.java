package br.com.lex.AdministracaoCarteira.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tCarteiraDeAtivos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CarteiraDeAtivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCarteiraDeAtivos;
    private String nome;
    @OneToMany(mappedBy = "carteiraDeAtivos", cascade = CascadeType.REMOVE , fetch = FetchType.LAZY)
    @JsonIgnore
    private List<MovimentoDaCarteira> movimentoDaCarteira;


}
