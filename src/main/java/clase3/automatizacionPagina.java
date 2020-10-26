package clase3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automatizacionPagina {
	
	public void interactuarConGmail() {
		String ubicacionDriver = "C:\\Users\\alexa\\eclipse-workspace\\Nivel2\\capacitacion2\\src\\main\\java\\resources\\drivers\\chromedriver.exe";
		String urlInicioGmail = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		System.setProperty("webdriver.chrome.driver", ubicacionDriver);	
		WebDriver driver = new ChromeDriver();
				driver.get(urlInicioGmail);
				WebElement cajaTextoemail = driver.findElement(By.id("identifierId"));
				cajaTextoemail.sendKeys("heidi.linares40@gmail.com");
				try {
					Thread.sleep (5000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				driver.close();
	}

}
