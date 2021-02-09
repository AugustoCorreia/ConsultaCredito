package com.consultaCredito.Api_Consulta_Credito.model;

public class Cliente {

	private Long id;
	private String nome;
	private Integer idade;
	private String cpf;
	private Integer dependentes;
	private Double renda;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Integer getDependentes() {
		return dependentes;
	}
	public void setDependentes(Integer dependentes) {
		this.dependentes = dependentes;
	}
	public Double getRenda() {
		return renda;
	}
	public void setRenda(Double renda) {
		this.renda = renda;
	}


}
