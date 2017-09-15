package Categories;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L1L2L3140917 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\test\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
	String URL="https://www-staging.siroop.work";
	driver.get(URL);
	
		WebDriverWait wait=new WebDriverWait(driver,30);
	 //Thread.sleep(3000);
	 WebElement bady=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/header/div[3]/div/nav/div[1]/ul/li[1]/button")));
	 																				  									   
	 bady.sendKeys(Keys.UP);
	 bady.click();
	 
	 Actions ACT=new Actions(driver);
		 
	 int i;
     int rc=driver.findElements(By.xpath("/html/body/header/div[4]/div/div/div[1]/ul/li/a")).size();
     									   					   
      System.out.println(rc);
      
            
      for(i=1;i<=rc;i++)
	     {
    	  
    	  WebElement li=driver.findElement(By.xpath("/html/body/header/div[4]/div/div/div[1]/ul/li["+i+"]/a"));
    	  											 
	    	 ACT.moveToElement(li).click().perform();
	    	 
	    	 String t1=driver.getTitle();
             System.out.println(t1);
             
             System.out.println("********** L1 **********");
    	         	  
		// SUB LIST	 
	    	 //Thread.sleep(5000);
	    	 int rc1=driver.findElements(By.xpath("/html/body/div[3]/div[1]/main/section/div[2]/div/div[2]/div/aside/nav/ul/li/a")).size();
	    	 										
	         System.out.println(rc1);
    	          	  
    	  for (int j = 1; j <=rc1; j++) {
    		  
    		  String t2=driver.getTitle();
              System.out.println(t2);
              
              System.out.println("********** L2 **********");
              //Thread.sleep(3000);
              
              WebElement li1=driver.findElement(By.xpath("/html/body/div[3]/div[1]/main/section/div[2]/div/div[2]/div/aside/nav/ul/li["+j+"]/a"));
              ACT.moveToElement(li1).click().perform();
             // li1.click();
                                		  
    		  int rc2=driver.findElements(By.xpath("/html/body/div[3]/div[1]/main/section/div[2]/div/div[2]/div/aside/nav/ul/li/a")).size();
    		   
    	      System.out.println(rc2);
    	          	       	  
    		  for (int j2 = 1; j2 <=rc2; j2++) 
    		  {
    			// Thread.sleep(2000);
    	    	 WebElement li2=driver.findElement(By.xpath("/html/body/div[3]/div[1]/main/section/div[2]/div/div[2]/div/aside/nav/ul/li["+j2+"]/a"));
    	    	 ACT.moveToElement(li2).click().perform();
    	    	     
    	    	//Thread.sleep(2000);
    	    	 
    	    	 String t=driver.getTitle();
    	    	 
                 System.out.println(t);
                 System.out.println("********** L3 **********");
                 
                 driver.navigate().back();
                  			      		                      
    		  }
    		  //Thread.sleep(2000);
    		  driver.navigate().back();
    		     		  
    		    	  }
    	//  driver.navigate().back();
          //Thread.sleep(2000);
          driver.findElement(By.xpath("/html/body/header/div[3]/div/nav/div[1]/ul/li[1]/button")).click();
          							    
          //Thread.sleep(2000);
          WebElement li4=driver.findElement(By.xpath("/html/body/header/div[4]/div/div/div[1]/ul/li[\"+i+\"]/a"));
          											  
          ACT.moveToElement(li4).perform();
    	  
    	  
	     }
      	}
}

