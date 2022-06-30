package TestCase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class Login {
    @Test
    public void FirstTest() throws InterruptedException {
        // Set WebDriver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tokopedia.com/");

        WebDriverWait wait = new WebDriverWait(driver, 5);

        // Ensure State
        WebElement button_masuk = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header-main-wrapper\"]/div[2]/div[5]/button[1]")));
        driver.findElement(By.xpath("//*[@id=\"header-main-wrapper\"]/div[2]/div[5]/button[1]")).click();

        WebElement email_phone = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"email-phone\"]")));
        driver.findElement(By.xpath("//*[@id=\"email-phone\"]")).sendKeys("abct329@gmail.com");

        driver.findElement(By.xpath("//*[@id=\"email-phone-submit\"]/span")).click();

        WebElement password_input = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"password-input\"]")));
        driver.findElement(By.xpath("//*[@id=\"password-input\"]")).sendKeys("Manisbanget1");

        Thread.sleep(10000);

        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/form/button/span/span")).click();

        Thread.sleep(10000);
   }
}
