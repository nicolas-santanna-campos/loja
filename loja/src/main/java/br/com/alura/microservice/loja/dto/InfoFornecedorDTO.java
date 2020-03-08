package br.com.alura.microservice.loja.dto;

import java.util.Optional;

public class InfoFornecedorDTO {

	private Optional<String> endereco;

	public Optional<String> getEndereco() {
		return endereco;
	}

	public void setEndereco(Optional<String> endereco) {
		this.endereco = endereco;
	}
}
