package br.edu.unipe.tcc.dev.web.service.dto;

import br.edu.unipe.tcc.dev.web.domain.Quarentena;

public class QuarentenaNomeCidadeDTO {
	
	private String nome;
	private String cidade;
	
	public QuarentenaNomeCidadeDTO(Quarentena quarentena) {
		setNome(quarentena.getNomePessoa());
		setCidade(quarentena.getCidade());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	

}
