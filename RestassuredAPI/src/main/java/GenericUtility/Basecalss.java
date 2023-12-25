package GenericUtility;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Basecalss 
{
	public DatabaseUtility dlib= new DatabaseUtility();
	public Javautility jlib = new Javautility();
	public RestAssuredUtility rlib = new RestAssuredUtility();
	public RequestSpecification reqst;
	public ResponseSpecification resp;
	
	@BeforeSuite
	public void bsconfig() throws SQLException
	{
		dlib.connectToDB();
		reqst= new RequestSpecBuilder().setBaseUri("http://rmgtestingserver:8084")
				.setContentType(ContentType.JSON).build();
		resp= new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();	
		
	}
	@AfterSuite
	public void asConfig() throws SQLException
	{
		dlib.closeDB();
	}
	/*   @BeforeClass
    public void launchBrowser() throws IOException
    {
    	String value=flib.get_Property_Value("Browser");
    	if(value.contains("Chrome"))
    	{
    		driver=new ChromeDriver();
    	}
    	else
    	{
    		driver=new FirefoxDriver();
    	}
    		
    }
    @BeforeMethod
    public void launchApplication() throws IOException
    {
    	wlib.wait_Till_Page_Gets_Loaded(driver);
    	driver.get(flib.get_Property_Value("Url"));
    	wlib.maximize_Window(driver);
    }
    @AfterMethod
    public void closeApplication() throws IOException
    {
//    	driver.close();
    }
    @AfterClass
    public void closeBrowser() throws IOException
    {
    	driver.quit();	
    }     */
	

}
