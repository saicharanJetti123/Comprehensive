package DefinationsStep;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.PageObjects.Bounce;
import com.PageObjects.Clothes;
import com.PageObjects.Commit;
import com.PageObjects.Contact;
import com.PageObjects.Coupons;
import com.PageObjects.New;
import com.PageObjects.PG;
import com.PageObjects.Products;
import com.PageObjects.Search;
import com.PageObjects.Search2;
import Utilities.ExcelData;

//import Utility.ReadConfiguration;
import Utilities.*;
import Utilities.snaps;
import io.cucumber.java.en.And;
//import Utility.snaps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCases {

	WebDriver driver;
	Coupons c;
	Clothes c1;
	Commit co;
	Contact con;
	New ne;
	Products pro;
	PG pg;
	Bounce bo;
	Search sc;
	Search2 sct;
	
	public static ExcelData excel;
	
	
	ReadConfiguration rc=new ReadConfiguration();
	Logger log=Logger.getLogger("Cucumber Framework");
	

	
	
	@Given("user launch Browser")
	public void user_launch_Browser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saich\\eclipse-workspace\\TideBDD\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		log.info("Chrome started succesfully");
		
	}
	
	@When("user open url")
	public void user_open_url() throws IOException {
		
		c=new Coupons(driver);
		
		driver.get("https://tide.com/en-us");
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"global-sticker\"]/button/svg")).click();
		log.info("Opens url");
		
		System.out.println(driver.getTitle());
		snaps.getScreenshot(driver, "Website");
			
	}
	//Coupons
	
	@And("click on Coupons")
	public void click_on_Coupons() throws IOException {
		
		//driver.findElement(By.xpath("//*[@id=\"global-sticker\"]/button/svg")).click();
		c.Reward1();
		//driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		
		System.out.println(driver.getTitle());
		snaps.getScreenshot(driver, "Coupons");
		
	}
	
	@Then("close Browser")
	public void close_Browser() {
		
		driver.quit();
		log.info("Browser is closed");
	}
	
	//Wash Clothes
	
	@When("click on Wash Clothes")
	public void click_on_Wash_Clothes() throws IOException {
		
		 c1=new Clothes(driver);
		
		/*WebElement e1=driver.findElement(By.xpath("//a[@data-action-detail='How to Wash Clothes']"));
		Actions action =new Actions(driver);
		action.moveToElement(e1).perform();*/
		 
		 c1.Wash();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		
		snaps.getScreenshot(driver, "Wash Clothes");
		
		log.info("clicked on How to wash my clothes");
		System.out.println(driver.getTitle());
		
	}
	
	@And("click on Remove stains")
	public void click_on_Remove_stains() throws IOException {
		
		c1.Stain();
		
		snaps.getScreenshot(driver, "Remove Stains");
		System.out.println(driver.getTitle());
	}
	
	//Commitment
	
	@When("click on commitment")
	public void click_on_commitment() throws IOException {
		
		co=new Commit(driver);
		
		co.Comm();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
		snaps.getScreenshot(driver, "Commitment");
	}
	
	
	@And("click on Turn to Tide")
	public void click_on_Turn_to_Tide() throws IOException {
		co.Tide();
		snaps.getScreenshot(driver, "Tide cold");
		
		System.out.println(driver.getTitle());
	}
		
	//Contact us
	
	@When("click on Contact")
	public void click_on_Contact() throws IOException {
		
		con=new Contact(driver);
		
		con.con();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		snaps.getScreenshot(driver, "contact us");
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//con.call();
		//snaps.getScreenshot(driver, "contact number");
	System.out.println(driver.getTitle());	
		
		
		
	}
	
	//What new
	
	@When("click on what new")
	public void click_on_what_new() throws IOException {
		
		ne=new New(driver);
		ne.NewItem();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
		snaps.getScreenshot(driver, "Whats new");
	}
	@And("click on more")	
	public void click_on_more() throws IOException {
		
		
	
		ne.More();
		snaps.getScreenshot(driver, "More");
		System.out.println(driver.getTitle());
		
	}
	
	//Shop By Product
	
	@When("click on product")
	public void click_on_product() throws IOException {
		
		pro= new Products(driver);
		
		pro.Shop();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
		snaps.getScreenshot(driver, "Product");
		
		
	}
	@And("click on cleaner")
	public void click_on_cleaner() throws IOException {
		
		pro.Cleaner();
		snaps.getScreenshot(driver, "product of Tide");
		System.out.println(driver.getTitle());
		
	}
	
	//PG icon
	
	@When("click on PG")
	public void click_on_PG() throws IOException {
		pg=new PG(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
		pg.icon();
		
		snaps.getScreenshot(driver, "TG");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
	}
	
	//Bounce
	
	@When("click on Bounce")
	public void click_on_Bounce() throws IOException {
		bo=new Bounce(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
		bo.Bicon();
		
		snaps.getScreenshot(driver, "Bounce");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		
		
	}
	
	//Search bar
	
	@When("click on Search")
	public void click_on_Search() throws IOException
	{
		 //excel=new ExcelData();
		 
		//driver.findElement(By.xpath("//button[@class='sticker_close']")).click();
		 sc=new Search(driver);
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
		 
		 sc.scrh();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		snaps.getScreenshot(driver, "Search");
		System.out.println(driver.getTitle());
		
	}
	
	/*@When("Scroll down")
	public void Scroll_down() throws IOException {
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 jse.executeScript("arguments[3].scrollIntoView();");
		 jse.executeScript("arguements[]".null)
		 WebElement e=driver.findElement(By.xpath("//button[@class='sticker_close']"));
		
		//jse.executeScript("arguments[3].scrollIntoView();");
		e.click();
	
		snaps.getScreenshot(driver, "Search");
		System.out.println(driver.getTitle());
	}*/
	
	@And("click on item 1")
	public void click_on_item_1() throws IOException {
		
		
		sc.item();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		snaps.getScreenshot(driver, "product item");
		System.out.println(driver.getTitle());
		
	}
	
	// Search- 2 
	
	
	@When("click on Search Two")
	public void click_on_Search_Two() throws IOException {
		sct=new Search2(driver);
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
		
		sct.scrhing();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		snaps.getScreenshot(driver, "Search 2 Item");
		System.out.println(driver.getTitle());
		
	}
	
	@And("click on item Two")
	public void click_on_item_Two() throws IOException {
		
		sct.items();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		snaps.getScreenshot(driver, "product item");
		System.out.println(driver.getTitle());
		
	}
	
	
	
	
	
	
	
		
	}
	

