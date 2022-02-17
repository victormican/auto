package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {
    private static ChromeDriver driver;
    private static int numberofcase=0;


    @Before
    public void setUP(){
        numberofcase++;
        System.out.println("Se esta ejecutando el escenario numero: "+ numberofcase );
        System.setProperty("webdriver.chrome.driver","./src/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://imalittletester.com");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("El escenario numero: "+ numberofcase + " se ejecuto correctamente.");
        driver.quit();
    }
    public static ChromeDriver getDriver(){
        return driver;
    }

}
