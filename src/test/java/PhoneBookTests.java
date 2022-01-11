import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;

public class PhoneBookTests {
    WebDriver wd;

    @BeforeMethod
    public void openSite(){
        wd = new ChromeDriver();
        wd.navigate().to( "https://contacts-app.tobbymarshall815.vercel.app/login");
    }

    @Test
    public void phoneBookStart(){
        WebElement element = wd.findElement(By.tagName("a"));
        element.click();
        element.clear();
    }

    @AfterMethod
    public void closeSite(){
        wd.quit();
    }
}
