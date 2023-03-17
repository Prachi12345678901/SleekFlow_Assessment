package TestCases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.TestBase;
import Utils.TestUtil;

public class Sleek_Ques2 extends TestBase{
	public static void main(String[] args) {
	      WebDriver driver = new ChromeDriver();
	      // browser type and chromedrover.exe path as parameters
	      System.setProperty("webdriver.chrome.driver",
	      "C:\\Users\\practripathi\\Downloads\\CP-SAT Project\\SleekFlow_Assessment\\chromedriver.exe");
	  	//Operations for first E-Commerce site//---------------------------------------   
	      String url1 = " https://www.amazon.in";//E-Commerce site 1
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
          driver.get(url1);
	      String site1Title=driver.getTitle();
	      WebElement searchSite1 = driver.findElement(By.xpath("//input[@type='text']"));
	      searchSite1.sendKeys("iPhone13");
	      WebElement hitSearch = driver.findElement(By.xpath("//input[@type='submit']"));
	      hitSearch.click();
		  WebElement searchItemTitle1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		  String searchItem1=searchItemTitle1.getText(); 
			String compareValue1url=driver.getCurrentUrl();
		  WebElement searchItemPrice1 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		  String value1=searchItemPrice1.getText();
		  value1=value1.replaceAll(",","");
		  int compareValue1= Integer.parseInt(value1);

		  
		 
		 

		


	  
 //Operations for second E-Commerce site//---------------------------------------
	  String url2= " https://www.flipkart.com"; //E-Commerce site 2
	  driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
      // Opens a new window and switches to new window
      driver.switchTo().newWindow(WindowType.WINDOW);
     // Opens second e-commerce website  in the newly opened window
      driver.navigate().to(url2);
      String site2Title=driver.getTitle();
    WebElement cancelPopup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
   cancelPopup.click();
      WebElement searchSite2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
      searchSite2.sendKeys("iPhone13");
      WebElement hitSearch2 = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
      hitSearch2.click();
      WebElement searchItemTitle2 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
	  String searchItem2=searchItemTitle2.getText(); 
	String compareValue2url=driver.getCurrentUrl();
	  WebElement searchItemPrice2 = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[1]"));
	  String value2=searchItemPrice2.getText();
	  value2=value2.replaceAll("[^a-zA-Z0-9]","");
	//value2=value2.replaceAll(",","");
	 //System.out.println(value2); 
	 int compareValue2= Integer.parseInt(value2);
	 
	  
	  
		//ComparePrice and display results------------------------------
	  if(compareValue2>compareValue1)
	  {
		  System.out.format("Best Deal find in: Amazon"+"\n"+"Product Name :"+searchItem1+" \n"+"Product Price: Rs."+compareValue1+"\n"+"Link of the product :"+compareValue1url+"\n");
    	  System.out.println();
          System.out.format("Another Deal find in: Flipkart"+"\n"+"Product Name :"+searchItem2+"\n"+"Product Price: Rs."+compareValue2+"\n"+"Link of the product :"+compareValue2url+"\n");

	}

      else if(compareValue1>compareValue2)
	  {
      System.out.format("Best Deal find in: Flipkart"+"\n"+"Product Name :"+searchItem2+"\n"+"Product Price: Rs."+compareValue2+"\n"+"Link of the product :"+compareValue2url+"\n");
	  System.out.println();
      System.out.format("Another Deal find in: Amazon"+"\n"+"Product Name :"+searchItem1+"\n"+"Product Price: Rs."+compareValue1+"\n"+"Link of the product :"+compareValue1url+"\n");
}
      else if(compareValue2==compareValue1)
	  {
    	  
//    	  System.out.format("Best Deal find in: Amazon"+"\n"+"Product Name: "+searchItem1+" \n"+"Product Price: Rs."+compareValue1+"\n"+"Link of the product :"+compareValue1url+"\n");
    	  System.out.println("#####################################################################################################");
    	  System.out.format("Best Deal find in:     |\t%-10s|\t%-10s|\tRs.%-10s|\t%-10s|\n\n","Amazon", searchItem1, compareValue1, compareValue1url);
//          System.out.format("Another Deal find in: Flipkart"+"\n"+"Product Name: "+searchItem2+"\n"+"Product Price: Rs."+compareValue2+"\n"+"Link of the product :"+compareValue2url+"\n");
    	  System.out.println("#####################################################################################################");
          System.out.format("Another Deal find in:  |\t%-10s|\t%-10s|\tRs.%-10s|\t%-10s|\n","Flipkart", searchItem2, compareValue2, compareValue2url);
          System.out.println("#####################################################################################################");
	  }
	  driver.quit();
}
}
