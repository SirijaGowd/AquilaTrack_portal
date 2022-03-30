package com.Excel.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util_WAITS {

    public static WebElement waitForElementToBeVisible(WebDriver driver, WebElement webelement, int seconds) {

	WebDriverWait wait = new WebDriverWait(driver, 10);

	WebElement element = wait.until(ExpectedConditions.visibilityOf(webelement));

	return element;

    }

    public static WebElement waitForElementToBEClickable(WebDriver driver, WebElement webelement, int seconds) {

	WebDriverWait wait = new WebDriverWait(driver, 10);

	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webelement));

	return element;

    }

}
