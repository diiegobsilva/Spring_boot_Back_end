package desafio.trabalho.crud.desafio.service;

import desafio.trabalho.crud.desafio.controller.CreateTrabalhoDto;
import desafio.trabalho.crud.desafio.entity.Trabalho;
import desafio.trabalho.crud.desafio.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TrabalhoService {

    @Autowired
    private TrabalhoRepository trabalhoRepository;

    public TrabalhoService(TrabalhoRepository trabalhoRepository) {
        this.trabalhoRepository = trabalhoRepository;
    }

    public UUID createTrabalho(CreateTrabalhoDto createTrabalhoDto){

        //DT0 -> ENTITY
        var entity =  new Trabalho(
                UUID.randomUUID(),
                createTrabalhoDto.tra_titulo(),
                createTrabalhoDto.tra_descricao(),
                createTrabalhoDto.tra_nota(),
                createTrabalhoDto.tra_grupo(),
                createTrabalhoDto.tra_justificativa(),
                createTrabalhoDto.tra_data_hora_entrega()
        );
        var trabalhoSaved = trabalhoRepository.save(entity);
        return trabalhoSaved.getTra_id();
    }

    public Optional<Trabalho> getTrabalhoById(String trabalhoId){
        return trabalhoRepository.findById(UUID.fromString(trabalhoId));
    }

    public List<Trabalho> listTrabalhos(){
        return trabalhoRepository.findAll();
    }

    public List<Trabalho> filtroTrabalho(String tra_titulo, Integer tra_nota){
        return trabalhoRepository.getByTitulo(tra_titulo, tra_nota);
    }


}
