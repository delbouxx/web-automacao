package web;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class ClienteSteps {
	
	 @Dado ("que possua acesso ao formulario WPCF7")
	 public void acessoFormulario() throws InterruptedException {
		 ClientePage clientePage = new ClientePage();
		 clientePage.acessoFormulario();
		 
	 }
	 @Quando ("cadstro uma mensagem de contato")
	 public void enviarMensagem() {
		 ClientePage clientePage = new ClientePage();
		 clientePage.enviarMensagem();
	 }
	 @Entao ("as informacoes sao registradas nas entradas WPCF7")
	 public void registrarMensagem() {
		 ClientePage clientePage = new ClientePage();
		 clientePage.registrarMensagem();
	 }

}
