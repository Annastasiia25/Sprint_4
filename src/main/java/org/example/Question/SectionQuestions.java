package org.example.Question;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SectionQuestions {
 // раздел на сайте "Вопросы о важном"
 private static WebDriver driver;

 //Верхняя кнопка "Заказать"
 private By upperOrderButton = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button[1]");
 //Нижняя кнопка "Заказать"
 private By lowerOrderButton = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button");

 // Локаторы по первому(0) вопросу /ответу
 public final static By FIRST_QUESTION = By.id("accordion__heading-0");
 public final static By FIRST_ANSWER = By.xpath("//*[@id='accordion__panel-0']/p");
 public static final String FIRST_EXPECTATION = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

 // Локаторы по второму(1) вопросу/ответу
 public final static By SECOND_QUESTION = By.id("accordion__heading-1");
 public final static By SECOND_ANSWER = By.xpath("//*[@id='accordion__panel-1']/p");
 public static final String SECOND_EXPECTATION = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

 // Локаторы по третьему(2)  вопросу/ответу
 public final static By THIRD_QUESTION = By.id("accordion__heading-2");
 public final static By THIRD_ANSWER = By.xpath("//*[@id='accordion__panel-2']/p");
 public final static String THIRD_EXPECTATION = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

 // Локаторы по четвертому(3) вопросу/ответу
 public final static By FOURTH_QUESTION = By.id("accordion__heading-3");
 public final static By FOURTH_ANSWER = By.xpath("//*[@id='accordion__panel-3']/p");
 public final static String FOURTH_EXPECTATION = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

 // Локаторы по пятому(4)  вопросу/ответу
 public final static By FIFTH_QUESTION = By.id("accordion__heading-4");
 public final static By FIFTH_ANSWER = By.xpath("//*[@id='accordion__panel-4']/p");
 public final static String FIFTH_EXPECTATION = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";


 // Локаторы по шестому(5) вопросу/ответу
 public final static By SIXTH_QUESTION = By.id("accordion__heading-5");
 public final static By SIXTH_ANSWER = By.xpath("//*[@id='accordion__panel-5']/p");
 public final static String SIXTH_EXPECTATION = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";


 // Локаторы по седьмому(6) вопросу/ответу
 public final static By SEVENTH_QUESTION = By.id("accordion__heading-6");
 public final static By SEVENTH_ANSWER = By.xpath("//*[@id='accordion__panel-6']/p");
 public final static String SEVENTH_EXPECTATION = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";


 // Локаторы по восьмому(7) вопросу /ответу
 public final static By EIGHTH_QUESTION = By.id("accordion__heading-7");
 public final static By EIGHTH_ANSWER = By.xpath("//*[@id='accordion__panel-7']/p");
 public final static String EIGHTH_EXPECTATION = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

 //Локатор секции
 private final static By SECTION_QUESTIONS = By.xpath("//*[@id=\"root\"]/div/div[1]/div[5]/div[1]");

 private final static String URL = "https://qa-scooter.praktikum-services.ru/";


 //Конструктор
 public SectionQuestions(WebDriver driver) {
  this.driver = driver;
 }

 // открыть страницу приложения
 public void Open() {
  driver.get(URL);
 }

 //Скролл страницы до сеции "Вопросы о важном"
 public void scrollToSectionQuestions() {
  Object element = driver.findElement(SECTION_QUESTIONS);
  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
 }

 //Клик по вопросу для раскрытия
 public void expandQuestion(By question) {
  driver.findElement(question).click();
 }

 //Получение текста ответа
 public String showAnswer(By answer) {
  new WebDriverWait(driver, 3)
          .until(ExpectedConditions.visibilityOf(driver.findElement(answer)));
  return driver.findElement(answer).getText();
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

