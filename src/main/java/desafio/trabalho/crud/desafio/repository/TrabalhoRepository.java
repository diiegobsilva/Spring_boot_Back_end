package desafio.trabalho.crud.desafio.repository;


import desafio.trabalho.crud.desafio.entity.Trabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface TrabalhoRepository extends JpaRepository<Trabalho, UUID> {

    @Query("select u from Trabalho u where u.tra_titulo like %?1% and u.tra_nota >= ?2")
    public List<Trabalho> getByTitulo(String tra_titulo, Integer tra_nota);
}


