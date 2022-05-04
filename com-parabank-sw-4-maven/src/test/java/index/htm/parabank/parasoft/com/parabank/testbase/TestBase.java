package index.htm.parabank.parasoft.com.parabank.testbase;


import index.htm.parabank.parasoft.com.parabank.propertyreader.PropertyReader;
import index.htm.parabank.parasoft.com.parabank.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void SetUp(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void teardown(){
        closeBrowser();
    }


}
