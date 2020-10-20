package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCar {
	WebDriver driver;
	@FindBy(xpath = "//input[@id='fromCityList']")
	private WebElement fromCity;
	@FindBy(xpath = "((//*[@type='text'])[2])")  
	private WebElement toCity;
	@FindBy(xpath="//input[@class='ng-tns-c11-1 form-control ui-inputtext ui-widget ui-state-default ui-corner-all']")
	private WebElement calendar;
	@FindBy(xpath="//*[@class='ui-datepicker-calendar ng-tns-c11-1']/tbody[@class='ng-tns-c11-1']/tr[4]/td[5]")
	private WebElement date;
	@FindBy(xpath="//select[@id='pickUpTime']")
	private WebElement timer;
	@FindBy(xpath="//option[contains(text(),'12:30 AM')]")
	private WebElement time;
	@FindBy(xpath="//button[contains(text(),'Select Car')]")
	private WebElement select;
	@FindBy(xpath="//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-select-car/div[2]/div/div/div[3]/div[1]/div[2]/div[1]/span")
	private WebElement carName;
	
	public SearchCar(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String searchCar(String source,String dest) throws InterruptedException {
		fromCity.sendKeys(source);
		Thread.sleep(1000);
		//fromCity.sendKeys(Keys.ARROW_DOWN);
		fromCity.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		toCity.sendKeys(dest);
		//toCity.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		toCity.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		calendar.click();
		date.click();
		timer.click();
		time.click();
		select.click();
		String name=carName.getText();
		return name;	
	}
}
