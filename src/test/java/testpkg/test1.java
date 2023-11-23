package testpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import basepkg.base1;
import pagepkg.page1;


public class test1 extends base1 {
	@Test
	public void test() throws Exception
	{
		page1 pg=new page1(driver);
		pg.searchClick("shoes");
		pg.searchIcon();
		pg.wearfoot();
		pg.wearfootwomen();
		pg.wearfootkids();
		
		pg.mensshoes();
		String parentWindow=driver.getWindowHandle();
		
		 Set<String> allWindowHandles=driver.getWindowHandles();
			for(String handle:allWindowHandles)
			{
				if(!handle.equalsIgnoreCase(parentWindow))
				{
					driver.switchTo().window(handle);
					  JavascriptExecutor js=(JavascriptExecutor)driver;
					    js.executeScript("window.scrollBy(0,document.body.scrollDown)");
					   // driver.findElement(By.xpath("//*[@id=\"add-cart-button-id\"]")).click();
					  //  pg.sizeshoes();
					   pg.addToCart();
					  
				 driver.close();
					   
				}
				driver.switchTo().window(parentWindow);
				driver.navigate().refresh();
			}
					    
					   pg.dealsnap();
					   pg.searchClick2();
					   pg.sareee();
					   pg.searchIcon2();
					   pg.sareeset();
						String parentWindow1=driver.getWindowHandle();
						
						 Set<String> allWindowHandles1=driver.getWindowHandles();
							for(String handle:allWindowHandles1)
							{
								if(!handle.equalsIgnoreCase(parentWindow1))
								{
									driver.switchTo().window(handle);
									  JavascriptExecutor js=(JavascriptExecutor)driver;
									    js.executeScript("window.scrollBy(0,document.body.scrollDown)");
					   
					 // String parentWindow1=driver.getWindowHandle();
						
						//Set<String> allWindowHandles1=driver.getWindowHandles();
						
									    pg.addToviewsaree();
									    driver.close();
										   
								}
								driver.switchTo().window(parentWindow);
								driver.navigate().refresh();
							}
									  pg.dealsnap1();
									  pg.searchClick3();
									  pg.setkurthi();
									  pg.searchIcon3();
									  pg.kurthi1();
									  String parentWindow11=driver.getWindowHandle();
										
										 Set<String> allWindowHandles11=driver.getWindowHandles();
											for(String handle:allWindowHandles11)
											{
												if(!handle.equalsIgnoreCase(parentWindow11))
												{
													driver.switchTo().window(handle);
													  JavascriptExecutor js=(JavascriptExecutor)driver;
													    js.executeScript("window.scrollBy(0,document.body.scrollDown)");
	
									  
									  pg.addTokurthicart();
									  driver.close();
									   
												}
												driver.switchTo().window(parentWindow);
												driver.navigate().refresh();
												pg.dealsnap2();
					   
					   
					    
					   
						
				}
				
			
						
											}}
	
			
	
	
