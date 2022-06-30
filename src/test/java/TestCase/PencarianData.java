package TestCase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;

public class PencarianData {
    @Test
    public void OrderTest() throws InterruptedException {
        // Set WebDriver
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tokopedia.com/");

        WebDriverWait wait = new WebDriverWait(driver, 5);

        // Ensure State
        WebElement cari_input = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div/div/div/div/input")));
        cari_input.sendKeys("sepatu pria");

        driver.findElement(By.xpath("//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div/div/div/div/button")).click();

        Thread.sleep(10000);

        driver.findElement(By.xpath("//*[@id=\"3865143104\"]/div/div/div/div/div[1]/a/div/img")).click();

        Thread.sleep(10000);

        WebElement product_content = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"pdp_comp-product_content\"]/div/h1")));
        assertTrue(product_content.isDisplayed());

        Thread.sleep(10000);
    }

}
