package Lecture7.pageObjects.saucedemo;

import Lecture7.pageObjects.baseObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Lecture7.pageObjects.driver.SimpleDriver.getWebDriver;

public class BasketPage extends BasePage {

    private WebElement getElementCartItem(String productName) {
        return getWebDriver().findElement(By.xpath("//*[@class = 'inventory_item_name' and text() = '" + productName + "']//ancestor::div[@class='cart_item']"));
    }

    private WebElement getElementProductCost(String productName) {
        return getElementCartItem(productName).findElement(By.className("inventory_item_price"));
    }

    private WebElement getElementCartQuantity(String productName){
        return getElementCartItem(productName).findElement(By.className("cart_quantity"));
    }

    public String getProductCost(String productName) {
        return getText(getElementProductCost(productName));
    }

    public String enterCartQuantity(String productName) {
        return getText(getElementCartQuantity(productName));
    }
}
