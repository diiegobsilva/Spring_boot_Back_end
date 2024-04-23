package desafio.trabalho.crud.desafio.controller;


import desafio.trabalho.crud.desafio.entity.Trabalho;
import desafio.trabalho.crud.desafio.service.TrabalhoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping ("/trabalho")
public class TrabalhoController {

    private TrabalhoService trabalhoService;

    public TrabalhoController(TrabalhoService trabalhoService) {
        this.trabalhoService = trabalhoService;
    }


    @PostMapping
    public ResponseEntity<Trabalho> createTrabalho(@RequestBody CreateTrabalhoDto createTrabalhoDto) {
        var tra_id = trabalhoService.createTrabalho(createTrabalhoDto);
        return ResponseEntity.created(URI.create(tra_id.toString())).build();
    }

    @GetMapping("/{trabalhoId}")
    public ResponseEntity<Trabalho> getUserById(@PathVariable("trabalhoId") String trabalhoId) {
        var trabalho = trabalhoService.getTrabalhoById(trabalhoId);
        if (trabalho.isPresent()) {
            return ResponseEntity.ok(trabalho.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Trabalho>> listTrabalhos() {
        var trabalhos = trabalhoService.listTrabalhos();

        return ResponseEntity.ok(trabalhos);
    }

    @GetMapping(value = "/filtro/{tra_titulo}/{tra_nota}")
    public List<Trabalho> filtroTrabalho(@PathVariable("tra_titulo") String tra_titulo, @PathVariable("tra_nota") Integer tra_nota) {
        return trabalhoService.filtroTrabalho(tra_titulo, tra_nota);
    }
}