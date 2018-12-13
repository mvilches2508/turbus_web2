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
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class W2E1_Caso009 {

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
    public void testPrueba() throws Exception {//Script de prueba
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
        driver.findElement(By.xpath("//div/div/div/label/input")).sendKeys("vina del mar");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[2]/ul/li")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("fechaIda")).click();//Ida y vuelta
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
        js.executeScript("window.scrollBy(0,-850)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//app-itinerario/div/div/div[2]/div")).click();//Selecciona itinerario
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[3]/a")).click();
        getFoto(driver);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//app-itinerario/div/div/div[2]/div")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[3]/a")).click();
        getFoto(driver);
        Thread.sleep(8000);
        driver.findElement(By.id("idPersona")).clear();//Datos de pasajeros
        driver.findElement(By.id("idPersona")).sendKeys("184745305");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("nombrePasajero")).clear();
        driver.findElement(By.id("nombrePasajero")).sendKeys("Pedro");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("apellidoPasajero")).clear();
        driver.findElement(By.id("apellidoPasajero")).sendKeys("Gonzalez");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[2]/label/input")).clear();
        driver.findElement(By.xpath("//div[2]/div[2]/label/input")).sendKeys("141590707");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[3]/label/input")).clear();
        driver.findElement(By.xpath("//div[2]/div[3]/label/input")).sendKeys("Claudia");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[2]/div[4]/label/input")).clear();
        driver.findElement(By.xpath("//div[2]/div[4]/label/input")).sendKeys("Colmenarez");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[3]/div[2]/label/input")).clear();
        driver.findElement(By.xpath("//div[3]/div[2]/label/input")).sendKeys("241284506");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[3]/div[3]/label/input")).clear();
        driver.findElement(By.xpath("//div[3]/div[3]/label/input")).sendKeys("Barbara");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[3]/div[4]/label/input")).clear();
        driver.findElement(By.xpath("//div[3]/div[4]/label/input")).sendKeys("Gonzalez");
        getFoto(driver);
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,-850)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button")).click();
        getFoto(driver);
        Thread.sleep(8000);
        int asientoIda = 3;
        WebElement asientosIda = driver.findElement(By.className("bus_seat"));//Selección de asientos ida
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
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,1200)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button")).click();
        getFoto(driver);
        Thread.sleep(10000);
        int asientoVuelta = 3;
        WebElement asientosVuelta = driver.findElement(By.className("bus_seat"));//Selección de asientos ida
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
        js.executeScript("window.scrollBy(0,1800)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button")).click();
        getFoto(driver);
        Thread.sleep(10000);
        driver.findElement(By.id("nombreComprador")).click();//Datos de comprador
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li/button")).click();
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[3]/div/div/label/input")).clear();
        driver.findElement(By.xpath("//div[3]/div/div/label/input")).sendKeys("Acevedo");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys("228227498");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("mvalles@inovabiz.com");
        getFoto(driver);
        Thread.sleep(1000);
        driver.findElement(By.id("pay")).click();
        getFoto(driver);
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[2]/h3")).click();//Ingreso a webpay
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
            File path = new File("src/test/java/evidencia/W2E1_Caso009");
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