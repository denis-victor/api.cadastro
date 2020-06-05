package com.qintess.evento.api.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qintess.evento.api.cadastro.models.CadastroCliente;

public interface CadastroRepository extends JpaRepository<CadastroCliente, Long>  {
	

}
