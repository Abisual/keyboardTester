import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class KeyboardParser {

    static WebDriver driver = null;
    String element;
    int elementNumber = 2;
    private static final String DOMAIN = "https://www.ratatype.ru/typing-test/test/en/";
    private String textXpath = "/html/body/section/div/div/div[2]/div[2]/div/div[1]/span[" + elementNumber + "]";
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
        driver.quit();
    }
    private void capsLockPress() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CAPS_LOCK);
    }
    private void capsLockRelease() throws AWTException {
        Robot robot = new Robot();
        robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
    }
    private void buttonSwitcher(String button) {
        try {
            Robot robot = new Robot();
            switch (button) {
                case "А":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_F);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_F);
                    capsLockRelease();
                    break;
                case "Б":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_COMMA);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_COMMA);
                    capsLockRelease();
                    break;
                case "В":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_D);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_D);
                    capsLockRelease();
                    break;
                case "Г":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_U);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_U);
                    capsLockRelease();
                    break;
                case "Д":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_L);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_L);
                    capsLockRelease();
                    break;
                case "Е":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_T);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_T);
                    capsLockRelease();
                    break;
                case "Ё":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
                    capsLockRelease();
                    break;
                case "Ж":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_SEMICOLON);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_SEMICOLON);
                    capsLockRelease();
                    break;
                case "З":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_P);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_P);
                    capsLockRelease();
                    break;
                case "И":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_B);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_B);
                    capsLockRelease();
                    break;
                case "Й":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_Q);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Q);
                    capsLockRelease();
                    break;
                case "К":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_R);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_R);
                    capsLockRelease();
                    break;
                case "Л":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_K);
                    capsLockRelease();
                    break;
                case "М":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_V);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_V);
                    capsLockRelease();
                    break;
                case "Н":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_Y);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Y);
                    capsLockRelease();
                    break;
                case "О":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_J);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_J);
                    capsLockRelease();
                    break;
                case "П":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_G);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_G);
                    capsLockRelease();
                    break;
                case "Р":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_H);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_H);
                    capsLockRelease();
                    break;
                case "С":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_C);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_C);
                    capsLockRelease();
                    break;
                case "Т":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_N);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_N);
                    capsLockRelease();
                    break;
                case "У":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_E);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_E);
                    capsLockRelease();
                    break;
                case "Ф":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_A);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_A);
                    capsLockRelease();
                    break;
                case "Х":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                    capsLockRelease();
                    break;
                case "Ц":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_W);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_W);
                    capsLockRelease();
                    break;
                case "Ч":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_X);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_X);
                    capsLockRelease();
                    break;
                case "Ш":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_I);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_I);
                    capsLockRelease();
                    break;
                case "Щ":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_O);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_O);
                    capsLockRelease();
                    break;
                case "ъ":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                    capsLockRelease();
                    break;
                case "ы":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_S);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_S);
                    capsLockRelease();
                    break;
                case "ь":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_M);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_M);
                    capsLockRelease();
                    break;
                case "Э":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                    capsLockRelease();
                    break;
                case "Ю":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_PERIOD);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_PERIOD);
                    capsLockRelease();
                    break;
                case "Я":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Z);
                    capsLockRelease();
                    break;

                    //Small Symbols


                case "а":
                    robot.keyPress(KeyEvent.VK_F);
                    robot.delay(10);
<<<<<<< HEAD
                    robot.keyRelease(KeyEvent.VK_F);
                    break;
                case "б":
                    robot.keyPress(KeyEvent.VK_COMMA);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_COMMA);
                    break;
                case "в":
                    robot.keyPress(KeyEvent.VK_D);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_D);
                    break;
                case "г":
                    robot.keyPress(KeyEvent.VK_U);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_U);
                    break;
                case "д":
                    robot.keyPress(KeyEvent.VK_L);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_L);
                    break;
                case "е":
                    robot.keyPress(KeyEvent.VK_T);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_T);
                    break;
                case "ё":
                    robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
                    break;
                case "ж":
                    robot.keyPress(KeyEvent.VK_SEMICOLON);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_SEMICOLON);
                    break;
                case "з":
                    robot.keyPress(KeyEvent.VK_P);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_P);
                    break;
                case "и":
                    robot.keyPress(KeyEvent.VK_B);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_B);
                    break;
                case "й":
                    robot.keyPress(KeyEvent.VK_Q);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Q);
                    break;
                case "к":
                    robot.keyPress(KeyEvent.VK_R);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_R);
                    break;
                case "л":
                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_K);
                    break;
                case "м":
                    robot.keyPress(KeyEvent.VK_V);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_V);
                    break;
                case "н":
                    robot.keyPress(KeyEvent.VK_Y);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Y);
                    break;
                case "о":
                    robot.keyPress(KeyEvent.VK_J);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_J);
                    break;
                case "п":
                    robot.keyPress(KeyEvent.VK_G);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_G);
                    break;
                case "р":
                    robot.keyPress(KeyEvent.VK_H);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_H);
                    break;
                case "с":
                    robot.keyPress(KeyEvent.VK_C);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_C);
                    break;
                case "т":
                    robot.keyPress(KeyEvent.VK_N);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_N);
                    break;
                case "у":
                    robot.keyPress(KeyEvent.VK_E);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_E);
                    break;
                case "ф":
                    robot.keyPress(KeyEvent.VK_A);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_A);
                    break;
                case "х":
                    robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                    break;
                case "ц":
                    robot.keyPress(KeyEvent.VK_W);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_W);
                    break;
                case "ч":
                    robot.keyPress(KeyEvent.VK_X);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_X);
                    break;
                case "ш":
                    robot.keyPress(KeyEvent.VK_I);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_I);
                    break;
                case "щ":
                    robot.keyPress(KeyEvent.VK_O);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_O);
                    break;
                case "э":
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                    break;
                case "ю":
                    robot.keyPress(KeyEvent.VK_PERIOD);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_PERIOD);
                    break;
                case "я":
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Z);
                    break;

                    //Other
                case "":
                    robot.keyPress(KeyEvent.VK_SPACE);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_SPACE);
                    break;
                case ",":
                    robot.keyPress(KeyEvent.VK_SLASH);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_SLASH);
                    break;
                case "-":
                    robot.keyPress(KeyEvent.VK_MINUS);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_MINUS);
                    break;
                case ".":
                    robot.keyPress(KeyEvent.VK_PERIOD);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_PERIOD);
                    break;
                case "'":
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                    break;
                case "(":
                    robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                    break;
                case ")":
                    robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                    break;
                case "\"":
                    robot.keyPress(KeyEvent.VK_QUOTEDBL);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_QUOTEDBL);
                    break;

                //ENGLISH

                case "A":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_A);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_A);
                    capsLockRelease();
                    break;
                case "B":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_B);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_B);
                    capsLockRelease();
                    break;
                case "C":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_C);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_C);
                    capsLockRelease();
                    break;
                case "D":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_D);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_D);
                    capsLockRelease();
                    break;
                case "E":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_E);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_E);
                    capsLockRelease();
                    break;
                case "F":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_F);
                    robot.delay(10);
=======
>>>>>>> a35e92ef2c8fe395976a38fc4683052638d2ea33
                    robot.keyRelease(KeyEvent.VK_F);
                    capsLockRelease();
                    break;
                case "G":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_G);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_G);
                    capsLockRelease();
                    break;
                case "H":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_H);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_H);
                    capsLockRelease();
                    break;
                case "I":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_I);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_I);
                    capsLockRelease();
                    break;
<<<<<<< HEAD
=======
                case "б":
                    robot.keyPress(KeyEvent.VK_COMMA);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_COMMA);
                    break;
                case "в":
                    robot.keyPress(KeyEvent.VK_D);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_D);
                    break;
                case "г":
                    robot.keyPress(KeyEvent.VK_U);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_U);
                    break;
                case "д":
                    robot.keyPress(KeyEvent.VK_L);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_L);
                    break;
                case "е":
                    robot.keyPress(KeyEvent.VK_T);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_T);
                    break;
                case "ё":
                    robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
                    break;
                case "ж":
                    robot.keyPress(KeyEvent.VK_SEMICOLON);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_SEMICOLON);
                    break;
                case "з":
                    robot.keyPress(KeyEvent.VK_P);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_P);
                    break;
                case "и":
                    robot.keyPress(KeyEvent.VK_B);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_B);
                    break;
                case "й":
                    robot.keyPress(KeyEvent.VK_Q);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Q);
                    break;
                case "к":
                    robot.keyPress(KeyEvent.VK_R);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_R);
                    break;
                case "л":
                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_K);
                    break;
                case "м":
                    robot.keyPress(KeyEvent.VK_V);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_V);
                    break;
                case "н":
                    robot.keyPress(KeyEvent.VK_Y);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Y);
                    break;
                case "о":
                    robot.keyPress(KeyEvent.VK_J);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_J);
                    break;
                case "п":
                    robot.keyPress(KeyEvent.VK_G);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_G);
                    break;
                case "р":
                    robot.keyPress(KeyEvent.VK_H);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_H);
                    break;
                case "с":
                    robot.keyPress(KeyEvent.VK_C);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_C);
                    break;
                case "т":
                    robot.keyPress(KeyEvent.VK_N);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_N);
                    break;
                case "у":
                    robot.keyPress(KeyEvent.VK_E);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_E);
                    break;
                case "ф":
                    robot.keyPress(KeyEvent.VK_A);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_A);
                    break;
                case "х":
                    robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                    break;
                case "ц":
                    robot.keyPress(KeyEvent.VK_W);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_W);
                    break;
                case "ч":
                    robot.keyPress(KeyEvent.VK_X);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_X);
                    break;
                case "ш":
                    robot.keyPress(KeyEvent.VK_I);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_I);
                    break;
                case "щ":
                    robot.keyPress(KeyEvent.VK_O);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_O);
                    break;
                case "э":
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                    break;
                case "ю":
                    robot.keyPress(KeyEvent.VK_PERIOD);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_PERIOD);
                    break;
                case "я":
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Z);
                    break;

                    //Other
                case "":
                    robot.keyPress(KeyEvent.VK_SPACE);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_SPACE);
                    break;
                case ",":
                    robot.keyPress(KeyEvent.VK_SLASH);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_SLASH);
                    break;
                case "-":
                    robot.keyPress(KeyEvent.VK_MINUS);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_MINUS);
                    break;
                case ".":
                    robot.keyPress(KeyEvent.VK_PERIOD);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_PERIOD);
                    break;
                case "'":
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                    break;
                case "(":
                    robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                    break;
                case ")":
                    robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                    break;
                case "\"":
                    robot.keyPress(KeyEvent.VK_QUOTEDBL);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_QUOTEDBL);
                    break;

                //ENGLISH

                case "A":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_A);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_A);
                    capsLockRelease();
                    break;
                case "B":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_B);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_B);
                    capsLockRelease();
                    break;
                case "C":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_C);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_C);
                    capsLockRelease();
                    break;
                case "D":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_D);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_D);
                    capsLockRelease();
                    break;
                case "E":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_E);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_E);
                    capsLockRelease();
                    break;
                case "F":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_F);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_F);
                    capsLockRelease();
                    break;
                case "G":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_G);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_G);
                    capsLockRelease();
                    break;
                case "H":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_H);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_H);
                    capsLockRelease();
                    break;
                case "I":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_I);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_I);
                    capsLockRelease();
                    break;
>>>>>>> a35e92ef2c8fe395976a38fc4683052638d2ea33
                case "J":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_J);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_J);
                    capsLockRelease();
<<<<<<< HEAD
                    break;
                case "K":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_K);
                    capsLockRelease();
                    break;
=======
                    break;
                case "K":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_K);
                    capsLockRelease();
                    break;
>>>>>>> a35e92ef2c8fe395976a38fc4683052638d2ea33
                case "L":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_L);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_L);
                    capsLockRelease();
                    break;
                case "M":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_M);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_M);
                    capsLockRelease();
                    break;
                case "N":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_N);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_N);
                    capsLockRelease();
                    break;
                case "O":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_O);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_O);
                    capsLockRelease();
                    break;
                case "P":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_P);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_P);
                    capsLockRelease();
                    break;
                case "Q":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_Q);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Q);
                    capsLockRelease();
                    break;
                case "R":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_R);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_R);
                    capsLockRelease();
                    break;
                case "S":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_S);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_S);
                    capsLockRelease();
                    break;
                case "T":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_T);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_T);
                    capsLockRelease();
                    break;
                case "U":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_U);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_U);
                    capsLockRelease();
                    break;
                case "V":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_V);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_V);
                    capsLockRelease();
                    break;
                case "W":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_W);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_W);
                    capsLockRelease();
                    break;
                case "X":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_X);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_X);
                    capsLockRelease();
                    break;
                case "Y":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_Y);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Y);
                    capsLockRelease();
                    break;
                case "Z":
                    capsLockPress();
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Z);
                    capsLockRelease();
                    break;

                    //lowercase

                case "a":

                    robot.keyPress(KeyEvent.VK_A);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_A);

                    break;
                case "b":

                    robot.keyPress(KeyEvent.VK_B);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_B);

                    break;
                case "c":

                    robot.keyPress(KeyEvent.VK_C);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_C);

                    break;
                case "d":

                    robot.keyPress(KeyEvent.VK_D);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_D);

                    break;
                case "e":

                    robot.keyPress(KeyEvent.VK_E);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_E);

                    break;
                case "f":

                    robot.keyPress(KeyEvent.VK_F);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_F);

                    break;
                case "g":

                    robot.keyPress(KeyEvent.VK_G);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_G);

                    break;
                case "h":

                    robot.keyPress(KeyEvent.VK_H);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_H);

                    break;
                case "i":

                    robot.keyPress(KeyEvent.VK_I);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_I);

                    break;
                case "j":

                    robot.keyPress(KeyEvent.VK_J);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_J);

<<<<<<< HEAD
                    break;
                case "k":

                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_K);

                    break;
                case "l":

                    robot.keyPress(KeyEvent.VK_L);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_L);

                    break;
                case "m":

                    robot.keyPress(KeyEvent.VK_M);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_M);

                    break;
                case "n":

                    robot.keyPress(KeyEvent.VK_N);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_N);

                    break;
                case "o":

                    robot.keyPress(KeyEvent.VK_O);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_O);

                    break;
                case "p":

                    robot.keyPress(KeyEvent.VK_P);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_P);

                    break;
                case "q":

                    robot.keyPress(KeyEvent.VK_Q);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Q);

                    break;
=======
                    break;
                case "k":

                    robot.keyPress(KeyEvent.VK_K);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_K);

                    break;
                case "l":

                    robot.keyPress(KeyEvent.VK_L);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_L);

                    break;
                case "m":

                    robot.keyPress(KeyEvent.VK_M);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_M);

                    break;
                case "n":

                    robot.keyPress(KeyEvent.VK_N);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_N);

                    break;
                case "o":

                    robot.keyPress(KeyEvent.VK_O);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_O);

                    break;
                case "p":

                    robot.keyPress(KeyEvent.VK_P);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_P);

                    break;
                case "q":

                    robot.keyPress(KeyEvent.VK_Q);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Q);

                    break;
>>>>>>> a35e92ef2c8fe395976a38fc4683052638d2ea33
                case "r":

                    robot.keyPress(KeyEvent.VK_R);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_R);

                    break;
                case "s":

                    robot.keyPress(KeyEvent.VK_S);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_S);

                    break;
                case "t":

                    robot.keyPress(KeyEvent.VK_T);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_T);

                    break;
                case "u":

                    robot.keyPress(KeyEvent.VK_U);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_U);

                    break;
                case "v":

                    robot.keyPress(KeyEvent.VK_V);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_V);

                    break;
                case "w":

                    robot.keyPress(KeyEvent.VK_W);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_W);

                    break;
                case "x":

                    robot.keyPress(KeyEvent.VK_X);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_X);

                    break;
                case "y":

                    robot.keyPress(KeyEvent.VK_Y);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Y);

                    break;
                case "z":
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.delay(10);
                    robot.keyRelease(KeyEvent.VK_Z);
                    break;
            }
<<<<<<< HEAD
            
=======


>>>>>>> a35e92ef2c8fe395976a38fc4683052638d2ea33
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }
}
