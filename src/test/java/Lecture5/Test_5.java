//package Lecture5;

import driver.SimpleDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import static driver.SimpleDriver.getWebDriver;

//public class Test_5 {
   // @BeforeMethod
  //  public void preconditions(){
  //      SimpleDriver simpleDriver = new SimpleDriver();
  //      getWebDriver().get("https://masterskayapola.ru/kalkulyator/laminata.html");
 //   }
 //   @Test
  //  public void test() {
  //      getWebDriver().findElement(By.xpath("//*[@name='calc_roomwidth']")).sendKeys("//*[value='5']", Keys.ENTER);
  //      getWebDriver().findElement(By.xpath("//*[@name='calc_height']")).sendKeys("2",Keys.ENTER);
  //      getWebDriver().findElement(By.xpath("//*[@name='calc_lamwidth']")).sendKeys("1500",Keys.ENTER);
  //      getWebDriver().findElement(By.xpath("//*[@name='calc_lamheight']")).sendKeys("183",Keys.ENTER);
  //      getWebDriver().findElement(By.xpath("//*[@name='calc_inpack']")).sendKeys("11",Keys.ENTER);
  //      getWebDriver().findElement(By.xpath("//*[@name='calc_price']")).sendKeys("600",Keys.ENTER);
 //       getWebDriver().findElement(By.xpath("//*[@name='calc_direct']")).sendKeys("//*[@value='toh']");
 //       getWebDriver().findElement(By.xpath("//*[@name='calc_bias']")).sendKeys("200",Keys.ENTER);
 //       getWebDriver().findElement(By.xpath("//*[@name='calc_walldist']")).sendKeys("9",Keys.ENTER);
  //      getWebDriver().findElement(By.xpath("//*[@value='Рассчитать']")).click();
  //  }


  //  @AfterTest
  //  public void postconditions() {
 //       getWebDriver().close();
 //   }

  //  private void enter(String id, String value) {
  //      getWebDriver().findElement(By.xpath(id)).clear();
  //      getWebDriver().findElement(By.xpath(id)).sendKeys(value);
//    }

 //   private void select(String value) {
 //       Select selectNapravlenieUkladki = new Select(getWebDriver().findElement(By.xpath("//*[@value='toh']")));
//        selectNapravlenieUkladki.selectByVisibleText(value);
   // }

  //  private List<String> getActualData() {
  //      List<String> actualData = new ArrayList<>();
  //      List<WebElement> result = getWebDriver().findElements(By.xpath("//*[contains(text(),'Результат расчета')]"));
  //      result.forEach(webElement -> {
  //          actualData.add(webElement.getText());
  //      });
  //      return actualData;
 //   }

 //   private void submit() {
//        getWebDriver().findElement(By.xpath("//*[@value='Рассчитать']")).click();
//    }
//}
