import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Question.OrderInformationPage;
import org.example.Question.SectionQuestions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.hamcrest.CoreMatchers.startsWith;

public class TestMakingTheOrder {
    private WebDriver driver;
    @Before
    public void setPropAndStartBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void TestWithUpperOrderButton() {
        OrderInformationPage orderInformationPage = new OrderInformationPage(driver);
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        sectionQuestions.Open();
        sectionQuestions.clickUpperOrderButton();
        orderInformationPage.creatingAnOrder(
                "Анастасия",  "Метелкина",  "Москва",  "Лубянка",
                "+79993332211",  "01.01.2001", "сутки",  "чёрный жемчуг",
                "Тест");
    }
    @Test
    public void TestWithLowerOrderButton() {
        OrderInformationPage orderInformationPage = new OrderInformationPage(driver);
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        sectionQuestions.Open();
        sectionQuestions.clickLowerOrderButton();
        orderInformationPage.creatingAnOrder(
                "Елена",  "Преснакова",  "Ленинград", "Тверская",
                "+79991112233", "12.12.2022", "двое суток",  "серая безысходность",
                "Второй тест");
    }
    @After
    public void teardown(){
        OrderInformationPage orderInformationPage = new OrderInformationPage(driver);
        String expected = "Заказ оформлен";
        String actual = orderInformationPage.getNotificationOfOrderCreation();
        Assert.assertThat("The order creation notification has not appeared or the order has not been created", actual, startsWith(expected));
        driver.quit();
    }
}
