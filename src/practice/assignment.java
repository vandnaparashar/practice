package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		
        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\browserdrivers\\chromedriver.exe" );
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//click on sign in
	 driver.findElement(By.linkText("Sign in")).click();
		 
		 //Enter email address
		 driver.findElement(By.cssSelector("[name='email_create']")).sendKeys("vandna@test6.com");

		 //Click on "Create an account"
		 driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();
		 
		//wait for next page to load
		 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		 String pageHeading = driver.findElement(By.className("page-heading")).getText();
		 System.out.println("Page Heading; "+pageHeading);
				 
			
		 //Select Title
		 driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
		 
		//Enter FirstName
		 driver.findElement(By.name("firstname")).sendKeys("aa");
		 
		 //Enter LastName
		 driver.findElement(By.name("lastname")).sendKeys("bb");
		 
		 //Enter Password
		 driver.findElement(By.id("passwd")).sendKeys("123@456");

		//Enter your address
		 driver.findElement(By.id("firstname")).sendKeys("Vandna");
		 driver.findElement(By.id("lastname")).sendKeys("v123");
		 driver.findElement(By.id("company")).sendKeys("Capgemini");
		 driver.findElement(By.id("address1")).sendKeys("xyz");
		 driver.findElement(By.id("city")).sendKeys("New Delhi");
		 
		 //Select State
		 WebElement statedropdown=driver.findElement(By.name("id_state"));
		 Select oSelect=new Select(statedropdown);
		 oSelect.selectByValue("6");
		 
		 //write PostCode
         driver.findElement(By.name("postcode")).sendKeys("51838");
		 
         //Select Country
		 WebElement countrydropDown=driver.findElement(By.name("id_country"));
		 Select oSelectC=new Select(countrydropDown);
		 oSelectC.selectByVisibleText("United States");
		 
		 //Additional Info
		 driver.findElement(By.xpath("//*[@id=\"other\"]")).sendKeys("12345678");
		 
		 //Enter Mobile Number
		 driver.findElement(By.id("phone_mobile")).sendKeys("234567890");
		 driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
		 driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("Office");
		 driver.findElement(By.name("submitAccount")).click();
		 String userText=driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
		 
		 //Click on Women
		 driver.findElement(By.linkText("WOMEN")).click();
		 
		 WebElement SecondImg=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img"));
		  WebElement MoreBtn=driver.findElement(By.xpath("/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]"));
		  Actions actions=new Actions(driver);
		  actions.moveToElement(SecondImg).moveToElement(MoreBtn).click().perform();
		  
		  //Change quantity by 2
		  driver.findElement(By.id("quantity_wanted")).clear();
		  driver.findElement(By.id("quantity_wanted")).sendKeys("2");
		  
		  //Select size as M
		  WebElement Sizedrpdwn=driver.findElement(By.xpath("//*[@id='group_1']"));
		  Select oSelect1=new Select(Sizedrpdwn);
		  oSelect1.selectByVisibleText("M");
		  
		  //Select color
		  driver.findElement(By.id("color_11")).click();
		  
		  //Click on add to cart
		  driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();
		  
		  //Click on proceed
		  driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
		  
		  //Checkout page proceed
		  driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		  driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		  
		  //driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("vandna@test6.com");
		  //driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("123@456");
		  //driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		  
		  //driver.findElement(By.xpath("//*[@id=\"order_step\"]/li[3]/span")).click();
		  //Agree terms & Conditions
		  driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();
		  
		  //Click on check
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
		  
		  //Confirm the order
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
		  

		 

	}

}
