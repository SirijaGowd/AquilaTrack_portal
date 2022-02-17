package com.Aquiltrack.qa.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Excel.Utility.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fip = new FileInputStream(
					"D:\\Eclipse WorkSpace\\AquilaTrack_portal\\src\\main\\java\\com\\Aquiltrack\\qa\\Configuration\\config.properties");
			prop.load(fip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void Intialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			// System.setProperty("webdriver.chrome.driver",
			// "/home/swati/Desktop/chromedriver");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browsername.equals("firefox")) {
			// System.setProperty("webdriver.gecko.driver",
			// "/home/swati/Desktop/geckodriver");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(1, TimeUnit.MINUTES);

		Instant strattime = Instant.now();
		System.out.println(strattime.toString());

		driver.get(prop.getProperty("url"));

		Instant endtime = Instant.now();
		System.out.println(endtime.toString());
		Duration duration = Duration.between(strattime, endtime);
		System.out.println("Page Load Time" + duration.toMillis() + "milli seconds");
	}

	public static int generateRandomDigits(int n) {
		int m = (int) Math.pow(10, n - 1);
		return m + new Random().nextInt(9 * m);
	}

	public static void takeScreenshotAtEndOfTest(String testcaseName, WebDriver driver) throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
		Date date = new Date();
		String actualdate = format.format(date);

		String currentDir = System.getProperty("user.dir") + "/screenshots/" + testcaseName + actualdate + ".png";
		// FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" +
		// testcaseName + ".png"));
		File dest = new File(currentDir);
		FileUtils.copyFile(scrFile, dest);

	}

}
