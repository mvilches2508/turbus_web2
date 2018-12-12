package com.turbus.webturbus2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class W2E1_Caso011 {

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
    public void testW2E1_Caso011() throws Exception {
        Robot robot = new Robot();
        driver.get(baseUrl);
        Thread.sleep(3000);
        getFoto(driver);
        driver.findElement(By.id("origen")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/div/div/label/input")).clear();
        driver.findElement(By.xpath("//div/div/div/label/input")).sendKeys("santiago");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[2]/ul/li")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("destino")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div/div/div/label/input")).clear();
        driver.findElement(By.xpath("//div/div/div/label/input")).sendKeys("temuco");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[2]/ul/li")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("fechaIda")).click();//Id y vuelta
        getFoto(driver);
        Thread.sleep(1000);
        int dia = 0;
        WebElement baseTable = driver.findElement(By.xpath("//*[@id=\"calendar\"]/div/div[1]/table"));
        List<WebElement> tableRows = baseTable.findElements(By.className("valid"));
        tableRows.get(dia);
        WebElement element = tableRows.get(dia);
        element.click();
        getFoto(driver);
        Thread.sleep(1000);
        element = null;
        element = tableRows.get(2);
        element.click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//tr[5]/td[5]/div")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[3]/button")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[3]/button")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[3]/button")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[3]/button")).click();
        getFoto(driver);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("buscarPasaje")).click();
        getFoto(driver);
        Thread.sleep(20000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-820)");
        getFoto(driver);
        driver.findElement(By.xpath("//app-itinerario/div/div/div[2]/div/div/div[2]")).click();
        getFoto(driver);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[2]/div[3]/a")).click();
        getFoto(driver);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//app-itinerario/div/div/div[2]/div/div/div[2]")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[3]/a")).click();
        getFoto(driver);
        Thread.sleep(5000);
        driver.findElement(By.id("idPersona")).clear();
        driver.findElement(By.id("idPersona")).sendKeys("256785315");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("nombrePasajero")).clear();
        driver.findElement(By.id("nombrePasajero")).sendKeys("Pedro");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("apellidoPasajero")).clear();
        driver.findElement(By.id("apellidoPasajero")).sendKeys("Perez");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[2]/label/input")).clear();
        driver.findElement(By.xpath("//div[2]/div[2]/label/input")).sendKeys("167591507");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[3]/label/input")).clear();
        driver.findElement(By.xpath("//div[2]/div[3]/label/input")).sendKeys("Carla");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[4]/label/input")).clear();
        driver.findElement(By.xpath("//div[2]/div[4]/label/input")).sendKeys("Gonzalez");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[3]/div[2]/label/input")).clear();
        driver.findElement(By.xpath("//div[3]/div[2]/label/input")).sendKeys("184745305");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[3]/div[3]/label/input")).clear();
        driver.findElement(By.xpath("//div[3]/div[3]/label/input")).sendKeys("Maria");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[3]/div[4]/label/input")).clear();
        driver.findElement(By.xpath("//div[3]/div[4]/label/input")).sendKeys("Perez");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[4]/div[2]/label/input")).clear();
        driver.findElement(By.xpath("//div[4]/div[2]/label/input")).sendKeys("184745305");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[4]/div[3]/label/input")).clear();
        driver.findElement(By.xpath("//div[4]/div[3]/label/input")).sendKeys("Daniela");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[4]/div[4]/label/input")).clear();
        driver.findElement(By.xpath("//div[4]/div[4]/label/input")).sendKeys("Gonzalez");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[5]/div[2]/label/input")).clear();
        driver.findElement(By.xpath("//div[5]/div[2]/label/input")).sendKeys("141590707");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[5]/div[3]/label/input")).clear();
        driver.findElement(By.xpath("//div[5]/div[3]/label/input")).sendKeys("Claudia");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[5]/div[4]/label/input")).clear();
        driver.findElement(By.xpath("//div[5]/div[4]/label/input")).sendKeys("Perez");
        getFoto(driver);
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,-1250)");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button")).click();
        getFoto(driver);
        Thread.sleep(8000);
        js.executeScript("window.scrollBy(0,-800)");
        Thread.sleep(1000);
        int asientoIda = 5;
        WebElement asientosIda = driver.findElement(By.className("bus_seat"));
        List<WebElement> tableAsientos = asientosIda.findElements(By.className("seat-undefined"));
        for (int i = 1; i <= asientoIda; i++) {
            element=null;
            element = tableAsientos.get(i);
            element.click();
            getFoto(driver);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li/button")).click();
            getFoto(driver);
            Thread.sleep(1000);
        }
        js.executeScript("window.scrollBy(0,1200)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button")).click();
        getFoto(driver);
        Thread.sleep(15000);
        int asientoVuelta = 5;
        WebElement asientosVuelta = driver.findElement(By.className("bus_seat"));
        List<WebElement> tableAsientosVuelta = asientosVuelta.findElements(By.className("seat-undefined"));
        for (int i = 1; i <= asientoVuelta; i++) {
            element=null;
            element = tableAsientosVuelta.get(i);
            element.click();
            getFoto(driver);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//li/button")).click();
            getFoto(driver);
            Thread.sleep(1000);
        }
        js.executeScript("window.scrollBy(0,1100)");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button")).click();
        getFoto(driver);
        Thread.sleep(8000);
        driver.findElement(By.id("nombreComprador")).clear();
        driver.findElement(By.id("nombreComprador")).sendKeys("Carlos");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("segura");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[3]/div/div/label/input")).clear();
        driver.findElement(By.xpath("//div[3]/div/div/label/input")).sendKeys("marquez");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("rut")).clear();
        driver.findElement(By.id("rut")).sendKeys("10073319-6");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys("2233445566");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("mvalles@inovabiz.com");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("pay")).click();
        getFoto(driver);
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[2]/h3")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[2]/a")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.name("pan")).clear();
        driver.findElement(By.name("pan")).sendKeys("4051885600446623");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//form/button")).click();
        getFoto(driver);
        Thread.sleep(20000);
        driver.switchTo().frame("transicion");
        driver.findElement(By.id("rutClient")).clear();
        driver.findElement(By.id("rutClient")).sendKeys("11.111.111-1");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("passwordClient")).clear();
        driver.findElement(By.id("passwordClient")).sendKeys("123");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//tr[9]/td/input")).click();
        getFoto(driver);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td/input")).click();
        getFoto(driver);
        driver.switchTo().defaultContent();
        Thread.sleep(58000);
        try {
            assertEquals(driver.findElement(By.xpath("//h2")).getText(), "TU COMPRA HA SIDO REALIZADA CON ÉXITO");
            System.out.println(driver.findElement(By.xpath("//h2")).getText());
            getFoto(driver);
            Thread.sleep(1000);
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//div[3]/a")).click();
        getFoto(driver);
        Thread.sleep(1000);
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
            File path = new File("src/test/java/evidencia/W2E1_Caso011");
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