/*
	Curso: Santander Bootcamp | Fullstack Developer

	Aluno (dev): Marcos Moura (https://github.com/marcos-moura97)

	Projeto: Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot

	Descrição: Aprenda a construir do zero uma API REST com Spring Boot para cadastro e gerenciamento de pessoas 
	de uma organização, até o Deploy na nuvem (Heroku). Pratique e veja os principais conceitos do estilo arquitetural 
	REST envolvidos durante o desenvolvimento do projeto.
*/

package one.digitalinnovation.personapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonapiApplication.class, args);
	}

}
