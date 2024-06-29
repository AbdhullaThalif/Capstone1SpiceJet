package SpiceJet;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Base1;

public class SignupPage extends Base1{

	// Constructor Method
			public SignupPage(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}

			// Defined  the web element using the @FindBy
			@FindBy(xpath="//div[contains(text(),'Signup')]")
			WebElement Signup;
			@FindBy(xpath="\r\n"
					+ "//div[@class='col-sm-4 mt-2 px-sm-4']//select[contains(@class,'form-control form-select')]")
			WebElement element;
			@FindBy(xpath="//select[@class='form-control form-select']")
			WebElement element1;
			@FindBy(xpath="//input[@id='first_name']")
			WebElement Firstname;
			@FindBy(xpath="//input[@id='last_name']")
			WebElement Lastname;
			@FindBy(xpath="//img[@alt='date']")
			WebElement Date;
			@FindBy(xpath="//select[@class='react-datepicker__month-select']")
			WebElement element2;
			@FindBy(xpath="//select[@class='react-datepicker__year-select']")
			WebElement element3;
			@FindBy(xpath="//div[@aria-label='Choose Saturday, March 10th, 1990']")
			WebElement DOB;
			@FindBy(xpath="//input[@placeholder='+91 01234 56789']")
			WebElement MN;
			@FindBy(xpath="//input[@id='email_id']")
			WebElement EM;
			@FindBy(xpath="//input[@id='new-password']")
			WebElement PW;
			@FindBy(xpath="//input[@id='c-password']")
			WebElement RPW;
			@FindBy(xpath="//input[@id='defaultCheck1']")
			WebElement TRM;
			@FindBy(xpath="//button[normalize-space()='Submit']")
			WebElement Submit;
			
			public void Signup() {
				// Click on the Signup button
				Signup.click();
				
			}
			
			public void Switch() {
				
				String mainWindowHandle = driver.getWindowHandle();
				Set<String> windowHandles = driver.getWindowHandles();
				for (String handle : windowHandles) {
					if (!handle.equals(mainWindowHandle)) {
						driver.switchTo().window(handle); // Switch to the pop-up window
						break;
					}
					}
			}
			
			public void Title() {
				// Click and select the MR value
				Select Obj = new Select(element);
			    Obj.selectByValue("MR");
			}
			
			public void EnterData(String fname, String lname)
			{
				// Input the First Name value in the First Name field
				Firstname.sendKeys(fname);
				// Input the Last Name value in the Last Name field
				Lastname.sendKeys(lname);
			}
			
			public void Country() {
				// Click and select the India value
				Select Obj1 = new Select(element1);
				Obj1.selectByValue("IN");
			}
			
			public void Date() {
				// Click on the Date button
				Date.click();
			}
			
			
			public void DateOfBirth() {
				// Click and select the Date
				Select Obj2 = new Select(element2);
				Obj2.selectByIndex(2);
				Select Obj3 = new Select(element3);
				Obj3.selectByValue("1990");
				DOB.click();
			}
			
			public void MobileNumber(String nm)
			{
				// Input the Mobile Number value in the Mobile Number field
				MN.sendKeys(nm);
			}
			
			public void Email(String em)
			{
				// Input the Email ID value in the Email ID field
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				EM.sendKeys(em);
			}
			
			public void Password(String pw)
			{
				// Input the Password value in the Password fields
				PW.sendKeys(pw);
				RPW.sendKeys(pw);
			}
			
			public void Term() {
				// Click on the Term & Condition
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", TRM);
			}
			
			public void Sumbit() {
				// Click on the Submit
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", Submit);
			}
}
