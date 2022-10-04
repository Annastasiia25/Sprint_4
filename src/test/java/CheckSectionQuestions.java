import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Question.Questions;
import org.example.Question.SectionQuestions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



//Проверка секции "Вопросы о важном"
public class CheckSectionQuestions {
    private WebDriver driver;

    //настройка драйвера
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        WebElement element = driver.findElement(By.id("accordion__heading-0"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(element));
        // перенесла в бефор первые шаги, так как у меня выходила ошибка и не удавалось внести все это по тестам
        // плюс, как оказалось если проскролить до 1 вопроса, дальше поиск идет спокойно.
    }

    @Test
    public void expectedFirstImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        Questions questions = new Questions(driver);
        String actual = sectionQuestions.getHowMuchDoesItCostAnswer();
        String expected = questions.FIRST_EXPECTATION;
        Assert.assertEquals("Text is not equal.", expected,actual);

    }

    @Test
    public void expectedSecondImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        Questions questions = new Questions(driver);
        String actual = sectionQuestions.getWantSeveralScootersAtOnceAnswer();
        String expected = questions.SECOND_EXPECTATION;
        Assert.assertEquals("Text is not equal.",expected,actual);

    }

    @Test
    public void expectedThirdImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        Questions questions = new Questions(driver);
        String actual = sectionQuestions.getHowRentalTimeCalculatedAnswer();
        String expected = questions.THIRD_EXPECTATION;
        Assert.assertEquals("Text is not equal.", expected,actual);

    }

    @Test
    public void expectedFourthImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        Questions questions = new Questions(driver);
        String actual = sectionQuestions.getPossibleToOrderScooterToday();
        String expected = questions.FOURTH_EXPECTATION;
        Assert.assertEquals("Text is not equal.", expected,actual);

    }

    @Test
    public void expectedFifthImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        Questions questions = new Questions(driver);
        String actual = sectionQuestions.getPossibleToExtendOrderOrReturnEarlier();
        String expected = questions.FIFTH_EXPECTATION;
        Assert.assertEquals("Text is not equal.", expected,actual);

    }
    @Test
    public void expectedSixthImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        Questions questions = new Questions(driver);
        String actual = sectionQuestions.getChargingAlongWithScooter();
        String expected = questions.SIXTH_EXPECTATION;
        Assert.assertEquals("Text is not equal.", expected,actual);

    }
    @Test
    public void expectedSeventhImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        Questions questions = new Questions(driver);
        String actual = sectionQuestions.getPossibleToCancelOrder();
        String expected =questions.SEVENTH_EXPECTATION;
        Assert.assertEquals("Text is not equal.", expected,actual);

    }
    @Test
    public void expectedEightImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        Questions questions = new Questions(driver);
        String actual = sectionQuestions.getBringScooterBeyondMKAD();
        String expected = questions.EIGHTH_EXPECTATION;
        Assert.assertEquals("Text is not equal.", expected,actual);
    }

    //закрытие браузера
    @After
    public void cleanUp(){
        driver.quit();
    }

}