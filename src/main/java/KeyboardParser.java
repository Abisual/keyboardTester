import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class KeyboardParser extends Keyboard {

    static WebDriver driver = null;
    String element;
    int elementNumber = 2;
    private static final String DOMAIN = "https://www.ratatype.ru/typing-test/test/";

    LinkedList<String> text = new LinkedList<>();

    public KeyboardParser() {
        element = "";
    }

    @Before
    public void registerSetup() {
        System.setProperty("webdriver.chrome.driver", "D:\\example\\final\\src\\test\\resources\\com\\nc\\edu\\ta\\utkin\\lab\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    private void openLink() {
        registerSetup();
        try {
            driver.get(DOMAIN);
        } catch (Exception e) {
            System.out.println("ERROR 404");
        }
    }
    public void buttonClick() {
        openLink();
        try {
            driver.findElement(By.id("startButton")).click();
            textParser();
        } catch (ElementNotFoundException e) {
            System.out.println("Button not found!" + e);
        }
    }

    private String elementFinderByClass (String element) {
        try {
            this.element = driver.findElement(By.className(element)).getText();
        } catch (ElementNotFoundException e) {
            System.out.println("Element Not Found!");
        }
        finally {
            return this.element;
        }
    }
    private String findByXpath(String xpath) {
        try {
            WebElement elementWeb = driver.findElement(By.xpath(xpath));
            element = elementWeb.getText();
        } catch (Exception e) {
            element = null;
            System.out.println("Out of Array!");
            sendKeys();
            return null;
        }
        return element;
    }
    private void buttonPusher (String key) {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.delay(10);
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(KeyEvent.VK_SHIFT);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void textParser() {
        int i = 0;
        elementFinderByClass("wgreen");
        text.add(0, element);
        i++;
        while (element != null) {
            findByXpath("/html/body/section/div/div/div[2]/div[2]/div/div[1]/span[" + elementNumber + "]");
            text.add(i, element);
            i++;
            ++elementNumber;
        }
    }
    private void sendKeys() {
        for (int i = 0; i < text.size(); i++) {
            buttonSwitcher(text.get(i));
            System.out.println("Pressed " + text.get(i));
        }
    }
}
