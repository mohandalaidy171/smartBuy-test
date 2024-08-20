package smartBuy_test;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LOGIN1 {
	WebDriver  mohannad=new ChromeDriver();
	SoftAssert mohannadAssert=new SoftAssert();

	

@BeforeTest
	public void beforeTest() {
	    mohannad.get("saucelabs.com");
		mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

//		mohannad.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("amazon"+Keys.ENTER);
//		mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

		
	}

//@Test(priority = 1,invocationCount = 1)
//public void sign() {
//	
//	mohannad.findElement(By.xpath("//*[@id=\"tads\"]/div[3]/div/div/div/div[1]/a/div[1]/span/span")).click();
//	mohannad.manage().window().maximize();
//
//	mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//	mohannad.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
//
//	mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//  mohannad.findElement(By.xpath("//*[@id=\"auth-create-account-link\"]")).click();
//	mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//  mohannad.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("mohannad mohammad");
//	mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//	  
//	  mohannad.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("mohannadtest1234@gmail.com");
//		mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//	  mohannad.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("00998877mmM@");
//		mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//	  mohannad.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("00998877mmM@");
//		mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//  mohannad.findElement(By.xpath("//*[@id=\"continue\"]")).click();
//	mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//  mohannad.findElement(By.xpath("//*[@id=\"register-mase-inlineerror\"]/div/div/a[1]")).click();
//
//
//}
@Test()
public void signIn() {
//	mohannad.findElement(By.xpath("//*[@id=\"tads\"]/div[3]/div/div/div/div[1]/a/div[1]/span/span")).click();
//	mohannad.manage().window().maximize();
//
//	mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//	mohannad.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
//	mohannad.manage().window().maximize();
//	mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//	mohannad.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("mohannadtest1234@gmail.com");
//	mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//
//	mohannad.findElement(By.xpath("//*[@id=\"continue\"]")).click();
//	mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//
//mohannad.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("00998877mmM@");
//mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
//mohannad.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
//mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

mohannad.findElement(By.xpath("//*[@id=\"CardInstanceW-lq5DKKRK0VmuAboWxGHA\"]/div[2]/div[1]/div[2]/a")).click();
mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

mohannad.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div[1]/span/a/div/img")).click();
mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

mohannad.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
mohannad.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

mohannad.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")).click();
WebElement priceElement = mohannad.findElement(By.id("priceId")); 

String priceText = priceElement.getText();

if(priceText.equals("$36.99")) {
    System.out.println("السعر صحيح.");
} else {
    System.out.println("السعر غير صحيح. السعر الموجود هو: " + priceText);
}
}

@AfterTest
public void afterTest() {
	
	
}

}
