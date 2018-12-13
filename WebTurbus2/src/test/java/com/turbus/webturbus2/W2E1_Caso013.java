package com.turbus.webturbus2; /*@author Invabiz*/

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class W2E1_Caso013 {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {//En este método se indica la url y el browser a utilizar
        System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "src/test/java/driver/geckodriver.exe");
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        baseUrl = "http://172.20.4.233:8080/turbuscl/inicio-compra";
        driver.manage().window().maximize();
    }

    @Test
    public void testW2E1_Caso013() throws Exception {//Srcipt de prueba, valida error cuando solamente se ingresa ciudad destino
        driver.get(baseUrl);
        Thread.sleep(3000);
        getFoto(driver);
        Thread.sleep(2000);
        driver.findElement(By.id("destino")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ingrese ciudad de destino'])[2]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ingrese ciudad de destino'])[2]/following::input[1]")).sendKeys("Temuco");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ciudad de destino'])[1]/following::p[1]")).click();
        Thread.sleep(2000);
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ciudad de destino'])[1]/following::p[1]")).getText(), "Ciudades sugeridas");
            getFoto(driver);
            System.out.println("No muestra opciones de ciudades, solo muestra el siguiente texto: " + driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ciudad de destino'])[1]/following::p[1]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        getFoto(driver);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        getFoto(driver);
        Thread.sleep(1000);
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    private void getFoto(WebDriver webDriver) {
        try {
            File path = new File("src/test/java/evidencia/W2E1_Caso013");
            path.mkdir();
            Date d = new Date();
            SimpleDateFormat sd = new SimpleDateFormat("dd_MM_yy_HH_mm_ss_a");
            String timestamp = sd.format(d);
            String imgname = path + "\\" + timestamp + ".png";
            File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(imgname));
        } catch (IOException ex) {
            System.out.println("Error al capturar secuencia: " + ex);
        }
    }
}
