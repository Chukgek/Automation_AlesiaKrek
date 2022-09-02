package Lecture5;

import driver.SimpleDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static driver.SimpleDriver.getWebDriver;

public class Test5 {


    @BeforeTest
    public void preconditions() {
        SimpleDriver simpleDriver = new SimpleDriver();
        getWebDriver().get("https://masterskayapola.ru/kalkulyator/laminata.html");
    }

    @BeforeMethod
    public void reload() {
        getWebDriver().navigate().refresh();
    }


    @Test
    public void test() {

        enter("//*[@name='calc_roomwidth']", "5");
        enter("//*[@name='calc_roomheight']", "2");
        enter("//*[@name='calc_lamwidth']", "1200");
        enter("//*[@name='calc_lamheight']", "190");
        enter("//*[@name='calc_inpack']", "11");
        enter("//*[@name='calc_price']", "400");
        select("toh");
        enter("//*[@name='calc_bias']", "200");
        enter("//*[@name='calc_walldist']", "20");
        submit();
        List<String> actualData = getActualData();
        List<String> expectedData = Arrays.asList(
                "Площадь укладки: 9.72 м2.",
                        " Кол-во панелей: 46 шт.",
                        " Кол-во упаковок: 5 шт.",
                        " Стоимость: 5016 руб.",
                        " Остатки: 9 шт.",
                        " Отрезки: 9 шт."        );
        Assert.assertEquals(actualData, expectedData);
    }
    @Test
    public void test1() {

        enter("//*[@name='calc_roomwidth']", "3");
        enter("//*[@name='calc_roomheight']", "1");
        enter("//*[@name='calc_lamwidth']", "1000");
        enter("//*[@name='calc_lamheight']", "100");
        enter("//*[@name='calc_inpack']", "10");
        enter("//*[@name='calc_price']", "200");
        select("toh");
        enter("//*[@name='calc_bias']", "100");
        enter("//*[@name='calc_walldist']", "10");
        submit();
        List<String> actualData = getActualData();
        List<String> expectedData = Arrays.asList(
                "Площадь укладки: 2.92 м2.",
                "Кол-во панелей: 34 шт.",
                "Кол-во упаковок: 4 шт.",
                "Стоимость: 800 руб.:",
                "Остатки: 6 шт.",
                "Отрезки: 8 шт."      );
        Assert.assertEquals(actualData, expectedData);
    }

    @AfterTest
    public void postconditions() {
        getWebDriver().close();
    }

    private void enter(String id, String value) {
        getWebDriver().findElement(By.xpath(id)).clear();
        getWebDriver().findElement(By.xpath(id)).sendKeys(value);
    }

    private void select(String value) {
        Select selectNapravlenieUkladki = new Select(getWebDriver().findElement(By.xpath("//*[@name='calc_direct']")));
        selectNapravlenieUkladki.selectByValue(value);
    }

    private List<String> getActualData() {
        List<String> actualData = new ArrayList<>();
        List<WebElement> result = getWebDriver().findElements(By.cssSelector("div span[id]"));
        result.forEach(webElement -> {
            actualData.add(webElement.getText());
        });
        return actualData;
    }

    private void submit() {
        getWebDriver().findElement(By.xpath("//*[@value='Рассчитать']")).click();
    }
}