package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;


public class AlunoForm {

	@NotBlank(message = "Preencha o campo corretamente")
	@Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max}")
	private String nome;

	@NotEmpty(message = "Preencha o campo corretamente")
	@CPF(message = "'${validatedValue}' é invalido!")
	private String cpf;

	@NotBlank(message = "Preencha o campo corretamente")
	@Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max}")
	private String bairro;

	@NotBlank(message = "Preencha o campo corretamente")
	@Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max}")
	private LocalDate dataDeNascimento;
	
	

	public AlunoForm(String nome, String cpf, String bairro, LocalDate dataDeNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.bairro = bairro;
		this.dataDeNascimento = dataDeNascimento;
	}

	public AlunoForm() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	
}

