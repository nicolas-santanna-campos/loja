package br.com.alura.microservice.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.alura.microservice.loja.dto.CompraDTO;
import br.com.alura.microservice.loja.dto.InfoFornecedorDTO;

@Service
public class CompraService {

	public void realizaCompra(CompraDTO compra) {
		RestTemplate clientRestTemplate = new RestTemplate();
		ResponseEntity<InfoFornecedorDTO> exchange =  clientRestTemplate.exchange("http://localhost:8180/info/" +
																						  null != compra.getEndereco().getEstado() ? compra.getEndereco().getEstado() : "",
																						  HttpMethod.GET,
																						  null,
																						  InfoFornecedorDTO.class);
		
		System.out.println(exchange.getBody());
	}

}
