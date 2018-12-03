package com.turbus.webturbus2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class W2E1_Caso013 {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        /*DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
                "src/test/java/driver/phantomjs.exe");
        driver = new PhantomJSDriver(capabilities);*/
        System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "http://172.20.4.233:8080/turbuscl/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testW2E1_Caso013() throws Exception {
        driver.get(baseUrl);
        getFoto(driver);
        Thread.sleep(8000);
        driver.findElement(By.id("destino")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ingrese ciudad de destino'])[2]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ingrese ciudad de destino'])[2]/following::input[1]")).sendKeys("Temuco");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ciudad de destino'])[1]/following::p[1]")).click();
        getFoto(driver);
        Thread.sleep(8000);
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ciudad de destino'])[1]/following::p[1]")).getText(), "Ciudades sugeridas");
            System.out.println("No muestra opciones de ciudades, solo muestra el siguiente texto: " + driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ciudad de destino'])[1]/following::p[1]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        getFoto(driver);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
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
            File path = new File("D:\\Git\\turbus_web2\\Evidencia\\W2E1_Caso013");
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
