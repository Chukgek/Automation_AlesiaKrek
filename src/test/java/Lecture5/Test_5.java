package Lecture5;



import driver.SimpleDriver;
        import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class Test_5 {
    @BeforeTest
    public void preconditions() {
        SimpleDriver simpleDriver = new SimpleDriver();
        getWebDriver().get("https://masterskayapola.ru/kalkulyator/laminata.html");
    }


    @Test
    public void test1() {
        getWebDriver().findElement(By.name("q")).sendKeys("Привет мир", Keys.ENTER);
        List<WebElement> results = getWebDriver().findElements(By.cssSelector("[lang='ru'] h3"));
        for (WebElement element : results) {
            Assert.assertTrue(element.getText().contains("Мир"));
        }
    }


    @AfterTest
    public void postconditions() {
        getWebDriver().close();
    }

    private void enter(String id, String value) {
        getWebDriver().findElement(By.id(id)).clear();
        getWebDriver().findElement(By.id(id)).sendKeys(value);
    }

    private void select(String value) {
        Select selectGender = new Select(getWebDriver().findElement(By.id("oSex")));
        selectGender.selectByVisibleText(value);
    }

    private List<String> getActualData() {
        List<String> actualData = new ArrayList<>();
        List<WebElement> result = getWebDriver().findElements(By.cssSelector("li div[id]"));
        result.forEach(webElement -> {
            actualData.add(webElement.getText());
        });
        return actualData;
    }

    private void submit() {
        getWebDriver().findElement(By.cssSelector("[value='Рассчитать']")).click();
    }
}