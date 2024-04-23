package desafio.trabalho.crud.desafio.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "trabalho_spring")
public class Trabalho {

        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        private UUID tra_id;

        @Column(name = "tra_titulo")
        private String tra_titulo;

        @Column(name = "tra_descricao")
        private String tra_descricao;

        @Column(name = "tra_grupo")
        private String tra_grupo;

        @Column(name = "tra_nota")
        private int tra_nota;

        @Column(name = "tra_justificativa")
        private String tra_justificativa;

        @Column(name = "tra_data_hora_entrega")
        private LocalDateTime tra_data_hora_entrega;

    public Trabalho(UUID tra_id, String tra_titulo, String tra_descricao, int tra_nota, String tra_grupo, String tra_justificativa, LocalDateTime tra_data_hora_entrega) {
        this.tra_id = tra_id;
        this.tra_titulo = tra_titulo;
        this.tra_descricao = tra_descricao;
        this.tra_nota = tra_nota;
        this.tra_grupo = tra_grupo;
        this.tra_justificativa = tra_justificativa;
        this.tra_data_hora_entrega = tra_data_hora_entrega;
    }

    public Trabalho() {
    }

    public UUID getTra_id() {
        return tra_id;
    }

    public void setTra_id(UUID tra_id) {
        this.tra_id = tra_id;
    }

    public String getTra_titulo() {
        return tra_titulo;
    }

    public void setTra_titulo(String tra_titulo) {
        this.tra_titulo = tra_titulo;
    }

    public String getTra_grupo() {
        return tra_grupo;
    }

    public void setTra_grupo(String tra_grupo) {
        this.tra_grupo = tra_grupo;
    }

    public String getTra_descricao() {
        return tra_descricao;
    }

    public void setTra_descricao(String tra_descricao) {
        this.tra_descricao = tra_descricao;
    }

    public int getTra_nota() {
        return tra_nota;
    }

    public void setTra_nota(int tra_nota) {
        this.tra_nota = tra_nota;
    }

    public String getTra_justificativa() {
        return tra_justificativa;
    }

    public void setTra_justificativa(String tra_justificativa) {
        this.tra_justificativa = tra_justificativa;
    }

    public LocalDateTime getTra_data_hora_entrega() {
        return tra_data_hora_entrega;
    }

    public void setTra_data_hora_entrega(LocalDateTime tra_data_hora_entrega) {
        this.tra_data_hora_entrega = tra_data_hora_entrega;
    }
}


