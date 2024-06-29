package base;



import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base1 {
	
	public WebDriver driver;
	public ExtentReports extentReports;
	public ExtentTest extentTest;
	
	
	@Parameters("choosebrowser")
	@BeforeMethod
	public void LanchBrowser(ITestContext context, @Optional("chrome") String choosebrowser) {
		// Launch the browser// Launch the browser
		switch (choosebrowser.toLowerCase()){
		case "chrome":

		driver = new ChromeDriver();
		break;
		
		case "edge":
		driver = new EdgeDriver();
		break;
		
		default:
		System.out.println("Invalid Browser");
		break;
		}
		  driver.manage().window().maximize();
		  driver.get("https://www.spicejet.com/");
	      
	}
	
	@AfterMethod
	
	public void createText(ITestContext context) {
		
		extentTest = extentReports.createTest(context.getName());
		
	}
	
	public void checkStatus(Method m, ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			String ScreenshotPath = null;
			ScreenshotPath = CaptureScreenshots(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName()+".jpg");
			extentTest.addScreenCaptureFromPath(ScreenshotPath);
			extentTest.fail(result.getThrowable());
		} else if(result.getStatus() == ITestResult.SUCCESS) {
			extentTest.pass(m.getName() + " is passed");
		}
		
	}
	
	public String CaptureScreenshots(String fileName) {
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File sourceFile = takescreenshot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./screenshots/"+ fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
		return destFile.getAbsolutePath();
	}
	
	@AfterTest
     public void CloseBrowser() {
    	 
    	 // Close the browser
    	 driver.quit();     }
	
	@BeforeSuite
	public void ExtentReports() {
		
		ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter("AllTest.html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter_all);
		
	}
	
	@AfterSuite
	public void GenerateExtentReports() throws Exception {
		
	    extentReports.flush();
	}

}
