package org.ridwan.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartPage {

    By titlePageCart = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    By buttonCheckout = By.id("checkout");

    private WebDriver driver;
    private WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void validateOnCartPage() {
        // **PERBAIKAN DI SINI:**

        // 1. Tunggu sampai elemen memiliki teks "Your Cart".
        //    wait.until() di sini mengembalikan Boolean.
        wait.until(ExpectedConditions.textToBePresentInElementLocated(titlePageCart, "Your Cart"));

        // 2. Setelah yakin teksnya ada (wait.until tidak melempar exception),
        //    baru temukan elemennya lagi untuk validasi lebih lanjut.
        WebElement textCart = driver.findElement(titlePageCart);

//        WebElement textCart = wait.until(ExpectedConditions.visibilityOfElementLocated(titlePageCart));
//        WebElement textCart = driver.findElement(titlePageCart);
        assertTrue(textCart.isDisplayed());
        assertEquals("Your Cart", textCart.getText());
    }

    public void clickCheckoutButton() {
        WebElement checkoutButton = driver.findElement(buttonCheckout);
        assertTrue(checkoutButton.isDisplayed());
        checkoutButton.click();
    }


}
