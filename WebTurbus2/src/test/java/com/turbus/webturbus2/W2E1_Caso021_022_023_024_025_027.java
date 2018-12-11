package com.turbus.webturbus2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class W2E1_Caso021_022_023_024_025_027 {

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
    public void testW2E1_Caso021_022_023_024_025_027() throws Exception {
        driver.get(baseUrl);
        Thread.sleep(3000);
        getFoto(driver);
        driver.findElement(By.id("origen")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ingrese ciudad de origen'])[2]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ingrese ciudad de origen'])[2]/following::input[1]")).sendKeys("Santiago");
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
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='do'])[1]/following::div[35]")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("buscarPasaje")).click();
        getFoto(driver);
        Thread.sleep(20000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='jornada mañana'])[1]/following::div[5]")).click();
        getFoto(driver);
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ver detalle de ruta en mapa'])[2]/following::a[1]")).getText(), "SELECCIONAR PASAJE");
            System.out.println(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ver detalle de ruta en mapa'])[2]/following::a[1]")).getText());
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ver detalle de ruta en mapa'])[2]/following::a[1]")).click();
        getFoto(driver);
        Thread.sleep(5000);
        driver.findElement(By.id("idPersona")).sendKeys("11");
        getFoto(driver);
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//form/div/div[2]/div/div/p")).getText(), "Debe ingresar un RUT");
            System.out.println("Mensaje encontrado: " + driver.findElement(By.xpath("//form/div/div[2]/div/div/p")).getText());
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("nombrePasajero")).sendKeys("Da");
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//div[3]/div/div/p")).getText(), "Debe ingresar un nombre");
            System.out.println("Mensaje encontrado: " + driver.findElement(By.xpath("//div[3]/div/div/p")).getText());
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("apellidoPasajero")).sendKeys("Pe");
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("//div[4]/div/div/p")).getText(), "Debe ingresar un apellido");
            getFoto(driver);
            System.out.println("Mensaje encontrado: " + driver.findElement(By.xpath("//div[4]/div/div/p")).getText());
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//div[2]/label/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("idPersona")).clear();
        driver.findElement(By.id("idPersona")).sendKeys("117822789");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("nombrePasajero")).clear();
        driver.findElement(By.id("nombrePasajero")).sendKeys("Daniela");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("apellidoPasajero")).clear();
        driver.findElement(By.id("apellidoPasajero")).sendKeys("Perez");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button")).click();
        getFoto(driver);
        Thread.sleep(8000);
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CONTINUAR'])[1]/following::h2[1]")).getText(), "ESCOGE TU ASIENTO DE IDA");
            System.out.println(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='CONTINUAR'])[1]/following::h2[1]")).getText());
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clasico C.'])[1]/following::button[1]")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ERROR'])[1]/following::p[1]")).click();
        getFoto(driver);
        Thread.sleep(1000);
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ERROR'])[1]/following::p[1]")).getText(), "Debe seleccionar sus asientos antes de continuar.");
            System.out.println("Mensaje: " + driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ERROR'])[1]/following::p[1]")).getText());
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("/html/body/app-root/app-seleccion-asiento/app-popup-error/div/div/div/div[2]/a")).click();
        getFoto(driver);
        Thread.sleep(1000);
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
            File path = new File("src/test/java/evidencia/W2E1_Caso020_021_022_023_024_025_027");
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
