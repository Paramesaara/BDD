package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith (Cucumber.class) //run with cucumber way
@CucumberOptions(tags="@Homepage",format= {"pretty","html:report"},features="C:\\Users\\Admin\\eclipse-workspace\\BDDTest\\src\\test\\resources\\feautre\\home.feature",glue="testcase",monochrome=true,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}) 
//to mention feature to run //tags to mention wat case to run homepage on top runs all case if particuar mention on top of case 
public class Runner {
	@AfterClass
    public static void teardown() {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
	

}
