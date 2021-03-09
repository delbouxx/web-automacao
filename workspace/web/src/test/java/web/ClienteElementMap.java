package web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClienteElementMap {
	
	@FindBy(name = "inputName")
	protected WebElement inputName;
	
	@FindBy(name = "inputEmail")	
	protected WebElement inputEmail; 		// email
	
	@FindBy(name = "inputSubject")
	protected WebElement inputSubject; 		// assunto
	
	@FindBy(name = "inputOption")
	protected WebElement inputOption; 		// option
	
	@FindBy(name = "inputMessage")
	protected WebElement inputMessage;		// mensagem
	
	@FindBy(name = "inputCaptcha")
	protected WebElement inputCaptcha;		// captch
	
	@FindBy(xpath = "//input[contains(@class,'wpcf7') and contains(@value,'Enviar')]")
	protected WebElement enviar;     
	
	
	

}
