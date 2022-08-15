package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactSelnium {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[@style='color: black;']")).click();
		driver.findElement(By.xpath("(//ul[@class='sectionTabBar']//a)[3]")).click();
		driver.findElement(By.xpath("(//div[@id='left-content-column']//a)[2]")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("kannan");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("vrk");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("muvi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("sister");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Electronics And Communication Engineering");
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[3]")).sendKeys("Nobody");
		driver.findElement(By.xpath("//input[contains(@id,'_primaryEmail')]")).sendKeys("kannanvrk15@gamil.com");
		WebElement dd1 = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select drop1=new Select(dd1);     
		drop1.selectByIndex(20);
		WebElement dd2 = driver.findElement(By.xpath("//select[contains(@id,'_generalCountryGeoId')]"));
		Select drop2=new Select(dd2);
		drop2.selectByVisibleText("United States Minor Outlying Islands");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Nothing");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());

	}


}
