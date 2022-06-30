package TestCase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Order {
    @Test
    public void OrderTest() throws InterruptedException {
        // Set WebDriver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tokopedia.com/");

        WebDriverWait wait = new WebDriverWait(driver, 5);

        // Ensure State
        WebElement cari_input = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div/div/div/div/input")));
        cari_input.sendKeys("kemeja pria");

        driver.findElement(By.xpath("//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div/div/div/div/button")).click();

        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"1624334615\"]/div/div/div/div/div[2]/a/div[1]")).click();

        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"pdpVariantContainer\"]/div/div[2]/button[1]/div[1]/img")).click();

        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"pdpFloatingActions\"]/div[3]/div[1]/button[2]/span")).click();

        Thread.sleep(10000);

        WebElement email_phone = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email-phone")));
        email_phone.sendKeys("abct329@gmail.com");

        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"email-phone-submit\"]/span")).click();

        Thread.sleep(10000);

        WebElement password_input = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password-input")));
        password_input.sendKeys("Manisbanget1");

        Thread.sleep(10000);

        driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[2]/form/button/span/span")).click();

        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"pdpFloatingActions\"]/div[3]/div[1]/button[2]/span")).click();

        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"pdpFloatingActions\"]/div[1]/div/div[1]/img")).click();

        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"pdpFloatingActions\"]/div[3]/div[1]/button[2]/span")).click();

        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"coachmark4\"]/button/span/div")).click();

        Thread.sleep(1000);

    }
}
