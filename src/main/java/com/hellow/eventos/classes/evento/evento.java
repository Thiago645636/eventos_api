package com.hellow.eventos.classes.evento;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name="evento")
@Entity(name="evento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private Date data;
    private String descricao;
    private int lotacao;
    @ManyToOne
    @JoinColumn(name="id_endereco")
    private Endereco endereco_id;
    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo_id;

}
