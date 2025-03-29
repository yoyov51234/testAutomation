package testplay;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class TestLogin {

    @Test
    public void testLogin() throws MalformedURLException {
        String os = System.getProperty("os.name").toLowerCase();
        WebDriver wb=null;
        if (os.contains("linux")) {
            // 容器或 Linux 本地

            ChromeOptions options = new ChromeOptions();

            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--user-data-dir=/tmp/unique-profile-" + java.util.UUID.randomUUID());


             wb = new RemoteWebDriver(new URL("http://selenium-hub:4444/wd/hub"), options);
        } else {
             wb = new ChromeDriver();
        }


        wb.get("https://www.baidu.com/");
        WebElement element = wb.findElement(By.xpath("//*[@id=\"kw\"]"));
//        element.sendKeys("hello");
//        element.submit();
        System.out.println("Page title is: " + wb.getTitle());
        wb.quit();
    }
}
