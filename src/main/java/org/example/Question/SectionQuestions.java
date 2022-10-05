package org.example.Question;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SectionQuestions {

 // раздел на сайте "Вопросы о важном"
 private WebDriver driver;

 //Верхняя кнопка "Заказать"
 private By upperOrderButton = By.cssSelector("div.Header_Nav__AGCXC > button.Button_Button__ra12g");
 //Нижняя кнопка "Заказать"
 private By lowerOrderButton = By.cssSelector("div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button");

 private final static String URL = "https://qa-scooter.praktikum-services.ru/";

 //Локатор секции
 private By sectionQuestions = By.linkText("Вопросы о важном"); // изменила поиск по xpath на текст, так как он уникальный на страницу

 // локаторы по вопросам
 // заменила все локаторы для поиска ответа с By.xpath на By.id

 //Сколько это стоит? И как оплатить?
 private By howMuchDoesItCost = By.id("accordion__heading-0");
 private By howMuchDoesItCostAnswer = By.id("accordion__panel-0");
 //Хочу сразу несколько самокатов! Так можно?
 private By wantSeveralScootersAtOnce = By.id("accordion__heading-1");
 private By wantSeveralScootersAtOnceAnswer = By.id("accordion__panel-1");
 //Как рассчитывается время аренды?
 private By howRentalTimeCalculated = By.id("accordion__heading-2");
 private By howRentalTimeCalculatedAnswer = By.id("accordion__panel-2");
 //Можно ли заказать самокат прямо на сегодня?
 private By possibleToOrderScooterToday = By.id("accordion__heading-3");
 private By possibleToOrderScooterTodayAnswer = By.id("accordion__panel-3");
 //Можно ли продлить заказ или вернуть самокат раньше?
 private By possibleToExtendOrderOrReturnEarlier = By.id("accordion__heading-4");
 private By possibleToExtendOrderOrReturnEarlierAnswer = By.id("accordion__panel-4");
 //Вы привозите зарядку вместе с самокатом?
 private By chargingAlongWithScooter = By.id("accordion__heading-5");
 private By chargingAlongWithScooterAnswer = By.id("accordion__panel-5");
 //Можно ли отменить заказ?
 private By possibleToCancelOrder = By.id("accordion__heading-6");
 private By possibleToCancelOrderAnswer = By.id("accordion__panel-6");
 //Я живу за МКАДом, привезёте?
 private By bringScooterBeyondMKAD = By.id("accordion__heading-7");
 private By bringScooterBeyondMKADAnswer = By.id("accordion__panel-7");

 //Конструкторы
 public SectionQuestions(WebDriver driver) {
  this.driver = driver;
 }
 public void Scrollig_to_Qiestion () {
  WebElement element = driver.findElement(howMuchDoesItCost);
  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
  new WebDriverWait(driver, 3)
          .until(ExpectedConditions.elementToBeClickable(element));
 }

 // открыть страницу приложения
 public void Open() {
  driver.get(URL);
 }
 public String getHowMuchDoesItCostAnswer() {
  driver.findElement(howMuchDoesItCost).click();
  return driver.findElement(howMuchDoesItCostAnswer).getText();
 }
 public String getWantSeveralScootersAtOnceAnswer() {
  driver.findElement(wantSeveralScootersAtOnce).click();
  return driver.findElement(wantSeveralScootersAtOnceAnswer).getText();
 }
 public String getHowRentalTimeCalculatedAnswer() {
  driver.findElement(howRentalTimeCalculated).click();
  return driver.findElement(howRentalTimeCalculatedAnswer).getText();
 }
 public String getPossibleToOrderScooterToday() {
  driver.findElement(possibleToOrderScooterToday).click();
  return driver.findElement(possibleToOrderScooterTodayAnswer).getText();
 }
 public String getPossibleToExtendOrderOrReturnEarlier() {
  driver.findElement(possibleToExtendOrderOrReturnEarlier).click();
  return driver.findElement(possibleToExtendOrderOrReturnEarlierAnswer).getText();
 }
 public String getChargingAlongWithScooter() {
  driver.findElement(chargingAlongWithScooter).click();
  return driver.findElement(chargingAlongWithScooterAnswer).getText();
 }
 public String getPossibleToCancelOrder() {
  driver.findElement(possibleToCancelOrder).click();
  return driver.findElement(possibleToCancelOrderAnswer).getText();
 }
 public String getBringScooterBeyondMKAD() {
  driver.findElement(bringScooterBeyondMKAD).click();
  return driver.findElement(bringScooterBeyondMKADAnswer).getText();
 }
 public void clickUpperOrderButton() {
  driver.findElement(upperOrderButton).click();
 }
 public void clickLowerOrderButton() {
  WebElement element = driver.findElement(lowerOrderButton);
  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
  driver.findElement(lowerOrderButton).click();
 }

}

