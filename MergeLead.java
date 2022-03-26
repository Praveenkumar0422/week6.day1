package TestNgSampke;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class MergeLead extends BaseClass {
	@Test
	public void mergeLead() throws InterruptedException {

		
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
        driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
      
        driver.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String>window=new LinkedList<String>(windowHandles);
        driver.switchTo().window(window.get(1));
        String title = driver.getTitle();
        System.out.println(title);
       
        
        List<WebElement>lst= driver.findElements(By.xpath("//a[contains(@class,'linktext')]"));
        int size = lst.size();
        System.out.println(size);
        lst.get(0).click();
        driver.switchTo().window(window.get(0));
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
        Set<String> windowHandles1 = driver.getWindowHandles();
        List<String>windows=new LinkedList<String>(windowHandles1);
        
        driver.switchTo().window(windows.get(1));
        
     
        driver.findElement(By.xpath("(//a[contains(@class,'linktext')])[8]")).click();
        driver.switchTo().window(window.get(0));
        
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        String title2 = driver.getTitle();
        System.out.println(title2);
        
        
			
		
        
        
        
        
      
        
        
       
      
       
      
		
        
      
        
        
        
        
        
			
		
  	 
        
       
        
        			 
        	
        	 
        	
			
		
       
				
		
	}

}
