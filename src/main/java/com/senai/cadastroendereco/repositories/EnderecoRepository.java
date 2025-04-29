package com.senai.cadastroendereco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.cadastroendereco.entities.Endereco;
import com.senai.cadastroendereco.entities.Pessoa;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

	//Busca endereço pelo cep
		Pessoa findByCep(String cep);

}
