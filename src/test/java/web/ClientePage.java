package web;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientePage extends ClienteElementMap {
	/*
	 * WebElement numerosCaptch; private static WebDriver driver;
	 */
	public ClientePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}	
	
	public void acessoFormulario() throws InterruptedException {
		Thread.sleep(10000);
		
		inputName.sendKeys("Carlos delboux");					//nome ok
		
		inputEmail.sendKeys("carlosdelboux@gmail.com");			//email ok
		
		inputSubject.sendKeys("assunto teste");					//assunto ok
		
		Select cmbOption = new Select(inputOption);				//option ok
		
		cmbOption.selectByVisibleText("Option 7");
		
		inputMessage.sendKeys("esta eh uma mensagem de teste"); //mensagem ok
		
		inputCaptcha.sendKeys("8");								//teste com numero qlqer
		
		enviar.click();											//enviar
		
	}

	public void enviarMensagem() {
		
		
		//numerosCaptch = driver.findElement(By.xpath("span[contains(@class,'inputCaptcha')]//span "));
		//$x("//span[contains(@class,'inputCaptcha')]//span/text()").forEach(el => console.log(el))
		//numerosCaptch.getText();
		//System.out.println(numerosCaptch);
		//System.out.println(numerosCaptch.getText());
		
		//d.findElement(By.xpath("/select[@id=category]/option[@id=cat2]")).click();	
		// //span[contains(@class,"inputCaptcha")]//span    pega somatoria captcha
		//span[contains(@class,"inputCaptcha")]//span
		
	}

	public void registrarMensagem() {
//		@FindBy(xpath = "//input[contains(@class,'wpcf7') and contains(@value,'Enviar')]")
//		protected WebElement clicarAvancar();
		// //input[contains(@class,'wpcf7') and contains(@value,'Enviar')]  botao enviar
		
	}	

	
}
