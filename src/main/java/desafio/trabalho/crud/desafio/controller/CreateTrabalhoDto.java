package desafio.trabalho.crud.desafio.controller;


import java.time.LocalDateTime;

public record CreateTrabalhoDto(String tra_titulo, String tra_descricao, String tra_grupo, int tra_nota, String tra_justificativa, LocalDateTime tra_data_hora_entrega) {
}




