import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Question.SectionQuestions;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



//Проверка секции "Вопросы о важном"
public class CheckSectionQuestions {
    private WebDriver driver;

    //настройка драйвера
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void expectedFirstImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        sectionQuestions.Open();
        sectionQuestions.scrollToSectionQuestions();
        sectionQuestions.expandQuestion(SectionQuestions.FIRST_QUESTION);
        String actual = sectionQuestions.showAnswer(SectionQuestions.FIRST_ANSWER);
        String expected = sectionQuestions.FIRST_EXPECTATION;
        Assert.assertEquals("Text is not equal.", expected,actual);

    }

    @Test
    public void expectedSecondImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        sectionQuestions.Open();
        sectionQuestions.scrollToSectionQuestions();
        sectionQuestions.expandQuestion(SectionQuestions.SECOND_QUESTION);
        String actual = sectionQuestions.showAnswer(SectionQuestions.SECOND_ANSWER);
        String expected = sectionQuestions.SECOND_EXPECTATION;
        Assert.assertEquals("Text is not equal.",expected,actual);

    }

    @Test
    public void expectedThirdImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        sectionQuestions.Open();
        sectionQuestions.scrollToSectionQuestions();
        sectionQuestions.expandQuestion(SectionQuestions.THIRD_QUESTION);
        String actual = sectionQuestions.showAnswer(SectionQuestions.THIRD_ANSWER);
        String expected = sectionQuestions.THIRD_EXPECTATION;
        Assert.assertEquals("Text is not equal.", expected,actual);

    }

    @Test
    public void expectedFourthImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        sectionQuestions.Open();
        sectionQuestions.scrollToSectionQuestions();
        sectionQuestions.expandQuestion(SectionQuestions.FOURTH_QUESTION);
        String actual = sectionQuestions.showAnswer(SectionQuestions.FOURTH_ANSWER);
        String expected = sectionQuestions.FOURTH_EXPECTATION;
        Assert.assertEquals("Text is not equal.", expected,actual);

    }

    @Test
    public void expectedFifthImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        sectionQuestions.Open();
        sectionQuestions.scrollToSectionQuestions();
        sectionQuestions.expandQuestion(SectionQuestions.FIFTH_QUESTION);
        String actual = sectionQuestions.showAnswer(SectionQuestions.FIFTH_ANSWER);
        String expected = sectionQuestions.FIFTH_EXPECTATION;
        Assert.assertEquals("Text is not equal.", expected,actual);

    }
    @Test
    public void expectedSixthImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        sectionQuestions.Open();
        sectionQuestions.scrollToSectionQuestions();
        sectionQuestions.expandQuestion(SectionQuestions.SIXTH_QUESTION);
        String actual = sectionQuestions.showAnswer(SectionQuestions.SIXTH_ANSWER);
        String expected = sectionQuestions.SIXTH_EXPECTATION;
        Assert.assertEquals("Text is not equal.", expected,actual);

    }
    @Test
    public void expectedSeventhImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        sectionQuestions.Open();
        sectionQuestions.scrollToSectionQuestions();
        sectionQuestions.expandQuestion(SectionQuestions.SEVENTH_QUESTION);
        String actual = sectionQuestions.showAnswer(SectionQuestions.SEVENTH_ANSWER);
        String expected =sectionQuestions.SEVENTH_EXPECTATION;
        Assert.assertEquals("Text is not equal.", expected,actual);

    }
    @Test
    public void expectedEightImportantQuestion(){
        SectionQuestions sectionQuestions = new SectionQuestions(driver);
        sectionQuestions.Open();
        sectionQuestions.scrollToSectionQuestions();
        sectionQuestions.expandQuestion(SectionQuestions.EIGHTH_QUESTION);
        String actual = sectionQuestions.showAnswer(SectionQuestions.EIGHTH_ANSWER);
        String expected = sectionQuestions.EIGHTH_EXPECTATION;
        Assert.assertEquals("Text is not equal.", expected,actual);
    }

    //закрытие браузера
    @After
    public void cleanUp(){
        driver.quit();
    }

}