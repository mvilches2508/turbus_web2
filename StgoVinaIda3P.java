package ida;

import org.testng.annotations.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StgoVinaIda3P {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	WebDriverWait wait = new WebDriverWait(driver, 10);


	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
				"src/ida/driver/phantomjs.exe");
		capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS,
				new String[] { "--ignore-ssl-errors=true", "--ssl-protocol=tlsv1", "--web-security=false" });
		driver = new PhantomJSDriver(capabilities);
		// System.setProperty("webdriver.chrome.driver",
		// "src/ida/driver/chromedriver.exe");
		// driver = new ChromeDriver();
		baseUrl = "http://172.20.5.56:8090/turbuscl";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testStgoVinaIda3P() throws Exception{
		driver.get(baseUrl);
		driver.findElement(By.id("origen")).click();
		driver.findElement(By.xpath("//div/div/div/label/input")).clear();
		driver.findElement(By.xpath("//div/div/div/label/input")).sendKeys("santiago");
		driver.findElement(By.xpath("//div[2]/div[2]/ul/li")).click();
		driver.findElement(By.id("destino")).click();
		driver.findElement(By.xpath("//div/div/div/label/input")).clear();
		driver.findElement(By.xpath("//div/div/div/label/input")).sendKeys("vina del mar");
		driver.findElement(By.xpath("//div[2]/div[2]/ul/li")).click();
		driver.findElement(By.id("checkRadioIda")).click();
		driver.findElement(By.xpath("//div[2]/div/label/span")).click();
		driver.findElement(By.id("fechaIda")).click();
		driver.findElement(By.xpath("//div/div/div/label/input")).click();
		driver.findElement(By.xpath("//tr[5]/td/div")).click();
		driver.findElement(By.xpath("//span[3]/button")).click();
		driver.findElement(By.id("buscarPasaje")).click();
		try {
			assertEquals(driver.findElement(By.xpath("//h2")).getText(), "SELECCIONA TU PASAJE DE IDA");
			System.out.println(driver.findElement(By.xpath("//h2")).getText());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.xpath("//div[4]/app-itinerario/div/div/div/div/div/div[2]")).click();
		boolean btnSeleccionarPasaje = isElementPresent(By.xpath("//div[4]/app-itinerario/div/div[2]/div[3]/a"));
		driver.findElement(By.xpath("//div[4]/app-itinerario/div/div[2]/div[3]/a")).click();
		driver.findElement(By.id("idPersona")).clear();
		driver.findElement(By.id("idPersona")).sendKeys("25678524-2");
		driver.findElement(By.id("nombrePasajero")).clear();
		driver.findElement(By.id("nombrePasajero")).sendKeys("Pedro");
		driver.findElement(By.id("apellidoPasajero")).clear();
		driver.findElement(By.id("apellidoPasajero")).sendKeys("Perez");
		driver.findElement(By.xpath("//div[2]/div[2]/label/input")).clear();
		driver.findElement(By.xpath("//div[2]/div[2]/label/input")).sendKeys("25678525-0");
		driver.findElement(By.xpath("//div[2]/div[3]/label/input")).clear();
		driver.findElement(By.xpath("//div[2]/div[3]/label/input")).sendKeys("Luciana");
		driver.findElement(By.xpath("//div[2]/div[4]/label/input")).clear();
		driver.findElement(By.xpath("//div[2]/div[4]/label/input")).sendKeys("Ortega");
		driver.findElement(By.xpath("//div[3]/div[2]/label/input")).clear();
		driver.findElement(By.xpath("//div[3]/div[2]/label/input")).sendKeys("25678526-9");
		driver.findElement(By.xpath("//div[3]/div[3]/label/input")).clear();
		driver.findElement(By.xpath("//div[3]/div[3]/label/input")).sendKeys("Luis");
		driver.findElement(By.xpath("//div[3]/div[4]/label/input")).clear();
		driver.findElement(By.xpath("//div[3]/div[4]/label/input")).sendKeys("Perez");
		boolean btnContinuar = isElementPresent(By.xpath("//button"));
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("//div[5]/div/div/div")).click();
		driver.findElement(By.xpath("//li/button")).click();
		driver.findElement(By.xpath("//div[5]/div[2]/div/div")).click();
		driver.findElement(By.xpath("//li/button")).click();
		driver.findElement(By.xpath("//div[6]/div[2]/div/div")).click();
		driver.findElement(By.xpath("//li/button")).click();
		boolean btn = isElementPresent(By.xpath("//button"));
		try {
			assertEquals(driver.findElement(By.xpath("//h2")).getText(), "ESCOGE TU ASIENTO DE IDA");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		String montoPasaje = driver.findElement(By.xpath("//tfoot/tr/td[2]/strong")).getText();
		driver.findElement(By.xpath("//button")).click();
		try {
			assertEquals(driver.findElement(By.xpath("//h2")).getText(), "DATOS COMPRADOR");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.id("nombreComprador")).click();
		driver.findElement(By.id("nombreComprador")).clear();
		driver.findElement(By.id("nombreComprador")).sendKeys("Pedro");
		driver.findElement(By.xpath("//li/button")).click();
		driver.findElement(By.xpath("//div[3]/div/div/label/input")).clear();
		driver.findElement(By.xpath("//div[3]/div/div/label/input")).sendKeys("Gonzalez");
		driver.findElement(By.id("phone")).clear();
		driver.findElement(By.id("phone")).sendKeys("948457115");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("pedro@perez.cl");
		driver.findElement(By.id("pay")).click();
		driver.findElement(By.xpath("//a[2]/h3")).click();
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.xpath("//li[2]/a")).click();
		driver.findElement(By.name("pan")).clear();
		driver.findElement(By.name("pan")).sendKeys("4051 8856 0044 6623");
		try {
			assertEquals(driver.findElement(By.xpath("//app-resume/div/div/div/h1")).getText(),
					"Estás pagando en WP NORMAL CREDITO");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.xpath("//form/button")).click();
		driver.findElement(By.xpath("//app-debit/form/button")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | transicion
		// | ]]
		driver.findElement(By.id("rutClient")).clear();
		driver.findElement(By.id("rutClient")).sendKeys("11.111.111-1");
		driver.findElement(By.id("passwordClient")).clear();
		driver.findElement(By.id("passwordClient")).sendKeys("123");
		driver.findElement(By.xpath("//tr[9]/td/input")).click();
		try {
			assertEquals(driver.findElement(By.xpath("//h3")).getText(), "Elija una opcion");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.xpath("//td/input")).click();
		// ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
		try {
			assertEquals(driver.findElement(By.xpath("//h1")).getText(), "Su transacción fue realizada con éxito.");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		try {
			assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Tu compra ha sido realizada con éxito");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.xpath("//div[3]/a")).click();
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
}