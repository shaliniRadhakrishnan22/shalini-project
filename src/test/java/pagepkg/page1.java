package pagepkg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page1 {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"inputValEnter\"]") ////*[@id="inputValEnter"]
	WebElement search;
	@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button/span") ////*[@id="sdHeader"]/div[4]/div[2]/div/div[2]/button/span
	WebElement searchButton;
	@FindBy(xpath="//*[@id=\"js-4583-nav\"]/li[1]/a/div[1]")
	WebElement footwear;
	@FindBy(xpath="//*[@id=\"js-46105685-nav\"]/li[2]/a/div[1]")
	WebElement womenfootwear;
	@FindBy(xpath="//*[@id=\"js-4583-nav\"]/li[3]/a/div[1]")
	WebElement kidsfootwear;
	@FindBy(xpath="//*[@id=\"627189973073\"]/div[2]/a/picture/img")
	WebElement shoes;
	//@FindBy(xpath="//*[@id=\"attribute-select-1\"]/div[2]/div/div/div[2]/div[1]/div")
	//WebElement shoessize;
	@FindBy(xpath="//*[@id=\"add-cart-button-id\"]/span")
	WebElement cart;
	

	
	@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[1]/a[1]/img")
	
	WebElement snapdeal;
@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/ul[2]/li[6]/div/a")
	
	WebElement saree;
@FindBy(xpath="//*[@id=\"661317273764\"]/div[2]/a/picture/img")////*[@id=\"661317273764\"]/div[2]/a/picture/img

WebElement setsaree;
@FindBy(xpath="//*[@id=\"buy-button-id\"]")

WebElement sareeview;
@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/div[4]/div/div/ul[2]/li[3]/div/a")

WebElement kurthiset;
@FindBy(xpath="//*[@id=\"645865047559\"]/div[2]/a/picture/img")

WebElement kurthi;
@FindBy(xpath="//*[@id=\"add-cart-button-id\"]/span")

WebElement cartkurthi;
@FindBy(xpath="//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[1]/a[1]/img")

WebElement snapdeal2;

 
 
 

	
	
	
	
	 
	
	
	                  
	                                                                   
	
	
public page1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void searchClick(String productname) {
		search.click();
		search.sendKeys(productname);
	}
	public void searchIcon ( ) {
		searchButton.click();
		
	}
	public void  wearfoot() {
		footwear.click();
		
	}
	public void wearfootwomen() {
		womenfootwear.click();
	}
	public void wearfootkids() {
		kidsfootwear.click();
	}
	
	public void mensshoes() {
		shoes.click();
	}
	
	//public void  sizeshoes() throws Exception{
		//Thread.sleep(2000);
		//shoessize.click();
	//}
	public void  addToCart() throws Exception	{
		Thread.sleep(2000);
		cart.click();
	}
	public void dealsnap()  {
		
		snapdeal.click();
	}
	
	//}
	//public void  outcheck() throws Exception	{
		//Thread.sleep(3000);
		//checkout.click();
		//public void dealsnap() throws Exception {
			//Thread.sleep(3000);
		//	snapdeal.click();
	
	public void searchClick2() {
		search.click();
	}
		
			 
				 public void  sareee() {
						saree.click();	
			}
				
				public void searchIcon2 ( ) {
					searchButton.click();
					
					
							}  
				public void sareeset() {
					setsaree.click();				}
				public void  addToviewsaree() throws Exception	{
					Thread.sleep(3000);
					sareeview.click();
				}
				public void dealsnap1()  {
					
					
					snapdeal.click();
}
				public void searchClick3() {
					search.click();
				}
				    public void setkurthi() {
				    	kurthiset.click();
				    }
				    public void searchIcon3 ( ) {
						searchButton.click();
				    }
				    public void kurthi1() {
				    	kurthi.click();
				    }
				    public void  addTokurthicart() throws Exception	{
						Thread.sleep(3000);
						cartkurthi.click();
				    }
				    public void dealsnap2()  {
						
						snapdeal2.click();
				  
}}