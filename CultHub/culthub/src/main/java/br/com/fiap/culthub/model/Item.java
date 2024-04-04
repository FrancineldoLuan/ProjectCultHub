package br.com.fiap.culthub.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.fiap.culthub.validation.TipoItem;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;


@Entity
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "{item.descricao.notblank}")
    
    private String descricao;

    @Positive
    private String nome;


    @TipoItem
    private String tipo; 
    
}
