package br.com.itau.techinsiders.ibank.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.techinsiders.ibank.models.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

    // find = SELECT *
    // PESSOA = FROM PESSOA
    // WHERE telefone = ????
    public Optional<Pessoa> findPessoaByTelefone(String telefone);
}