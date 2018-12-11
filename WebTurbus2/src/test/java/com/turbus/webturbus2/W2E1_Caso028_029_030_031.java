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
import org.openqa.selenium.support.ui.Select;

public class W2E1_Caso028_029_030_031 {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "http://172.20.4.233:8080/turbuscl/inicio-compra";
        driver.manage().window().maximize();
    }

    @Test
    public void testW2E1_Caso028_029_030_031() throws Exception {
        driver.get(baseUrl);
        Thread.sleep(3000);
        getFoto(driver);
        driver.findElement(By.id("origen")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ingrese ciudad de origen'])[2]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ingrese ciudad de origen'])[2]/following::input[1]")).sendKeys("santiago");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ciudad de origen'])[1]/following::li[1]")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("destino")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ingrese ciudad de destino'])[2]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ingrese ciudad de destino'])[2]/following::input[1]")).sendKeys("Valparaiso");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ciudad de destino'])[1]/following::li[1]")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='TRAMOS'])[1]/following::span[1]")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("fechaIda")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='do'])[1]/following::div[36]")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='-'])[1]/following::button[1]")).click();
        getFoto(driver);
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='-'])[1]/following::strong[1]")).getText(), "2");
            System.out.println(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='-'])[1]/following::strong[1]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("buscarPasaje")).click();
        getFoto(driver);
        Thread.sleep(10000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Santiago - Stgo.T.Alameda TB'])[1]/following::div[1]")).click();
        getFoto(driver);
        Thread.sleep(2000);
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ver detalle de ruta en mapa'])[2]/following::a[1]")).getText(), "SELECCIONAR PASAJE");
            System.out.println(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ver detalle de ruta en mapa'])[2]/following::a[1]")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ver detalle de ruta en mapa'])[2]/following::a[1]")).click();
        getFoto(driver);
        Thread.sleep(3000);
        driver.findElement(By.id("idPersona")).clear();
        driver.findElement(By.id("idPersona")).sendKeys("16759150-7");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("nombrePasajero")).clear();
        driver.findElement(By.id("nombrePasajero")).sendKeys("Alejandra");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("apellidoPasajero")).clear();
        driver.findElement(By.id("apellidoPasajero")).sendKeys("gonzalez");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='RUT'])[4]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='RUT'])[4]/following::input[1]")).sendKeys("14159070-7");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NOMBRE'])[2]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='NOMBRE'])[2]/following::input[1]")).sendKeys("Daniel");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='APELLIDO'])[2]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='APELLIDO'])[2]/following::input[1]")).sendKeys("Marquez");
        getFoto(driver);
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CONTINUAR'])[1]/following::h2[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/app-ingresa-pasajero/main/div/div/div[1]/div/div/div/div[2]/button")).click();
        getFoto(driver);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[2]/div[3]/div/div/div")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li/button")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[3]/div[2]/div/div")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li/button")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/app-seleccion-asiento/main/div/div/div[1]/div/div/div[2]/div/button")).click();
        getFoto(driver);
        Thread.sleep(8000);
        if (driver.findElement(By.id("pay")).isEnabled()) {
            System.out.println("Error, permite continuar sin agregar datos del comprador");
            element = null;
            element = driver.findElement(By.id("pay"));
            js.executeScript("arguments[0].scrollIntoView();", element);
            getFoto(driver);
        } else {
            System.out.println("Verificación exitosa, no permite continuar la compra sin agregar datos del comprador");
            element = null;
            element = driver.findElement(By.id("pay"));
            js.executeScript("arguments[0].scrollIntoView();", element);
            getFoto(driver);
        }
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
            File path = new File("D:\\Git\\turbus_web2\\Evidencia\\W2E1_Caso028_029_030_031");
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