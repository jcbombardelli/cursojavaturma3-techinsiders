package br.com.itau.techinsiders.ibank.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.techinsiders.ibank.models.Pessoa;
import br.com.itau.techinsiders.ibank.repository.PessoaRepository;

@RestController
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping(path = "/pessoas", consumes = "application/json", produces = "application/json")
    public Pessoa addNovaUsuario(@RequestBody Pessoa novoUsuario) {
        Pessoa pessoaInserida = pessoaRepository.save(novoUsuario); // INSERT
        return pessoaInserida;
    }

    @GetMapping(path = "/pessoas/{id}")
    public Pessoa buscarPessoa(@PathVariable("id") Long idPessoa) {
        Optional<Pessoa> optionalPessoa = pessoaRepository.findById(idPessoa);
        return optionalPessoa.get();
    }

    @GetMapping(path = "/pessoas")
    public Iterable<Pessoa> listarPessoas() {
        Iterable<Pessoa> listaPessoas = pessoaRepository.findAll();
        return listaPessoas;
    }

    @GetMapping(path = "/pessoas/telefone")
    public Optional<Pessoa> buscarPorTelefone(@RequestParam("numero") String telefone) {
        Optional<Pessoa> pessoa = pessoaRepository.findPessoaByTelefone(telefone);
        return pessoa;
    }

    @DeleteMapping(path = "/pessoas/{id}")
    public String removerPessoa(@PathVariable("id") Long idPessoa) {
        pessoaRepository.deleteById(idPessoa);
        return "{\"deleted\": \"true\"}";
    }

    @PutMapping(path = "/pessoas/{id}")
    public Pessoa atualizarPessoa(@PathVariable Long id, @RequestBody Pessoa pessoaAtualizacao) {
        Optional<Pessoa> optionalPessoa = pessoaRepository.findById(id);

        if (optionalPessoa.isPresent()) {
            // pessoa.get() = pessoaAtualizacao;
            Pessoa pessoa = optionalPessoa.get();
            // pessoa = pessoaAtualizacao;

            pessoa.setNome(pessoaAtualizacao.getNome());
            pessoa.setTelefone(pessoaAtualizacao.getTelefone());

            Pessoa pessoaSalva = pessoaRepository.save(pessoa);
            return pessoaSalva;

        } else {
            System.out.println("REGISTRO NAO ENCONTRADO!!!!!!!!");
            return null;
        }

    }

}