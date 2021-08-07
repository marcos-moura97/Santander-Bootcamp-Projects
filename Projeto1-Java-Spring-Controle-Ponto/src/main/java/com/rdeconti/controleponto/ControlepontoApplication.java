/*
	Curso: Santander Bootcamp | Fullstack Developer

	Aluno (dev): Marcos Moura (https://github.com/marcos-moura97)

	Projeto: Construindo um sistema de controle de ponto e acesso com Spring Boot

	Descrição: Neste projeto você terá o desafio de desenvolver uma API Rest para controle de ponto e 
acesso dos usuários de uma empresa. Utilizaremos Java, Spring Boot, Hibernate Envers e lombok além de 
documentar toda a API com Swagger.

*/

package com.rdeconti.controleponto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControlepontoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlepontoApplication.class, args);
	}

}
