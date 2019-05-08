package com.mainacad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lab
{

    private static By info_message = By.cssSelector("p:nth-child(3) em");
    private static By info_message_2 = By.xpath("/html//div[@id='content']/div[1]/div//h1[.='Practice Automation Form']");
    private static By link_test = By.cssSelector("[href='http\\:\\/\\/toolsqa\\.com\\/automation-practice-form\\/'] strong");
    private static By first_name = By.cssSelector("[name='firstname']");
    private static By last_name = By.cssSelector("[name='lastname']");
    private static By gender = By.cssSelector("fieldset .control-group:nth-child(18) [name='sex']:nth-child(2)");
    private static By experience = By.cssSelector("fieldset .control-group:nth-child(23) [name='exp']:nth-child(8)");
    private static By date = By.cssSelector("fieldset p:nth-child(26) [type]");
    private static By tool_1 = By.cssSelector("fieldset .control-group:nth-child(40) [name='tool']:nth-child(3)");
    private static By tool_2 = By.cssSelector("fieldset .control-group:nth-child(40) [name='tool']:nth-child(4)");
    private static By button = By.cssSelector("[name='submit']");
    private static By text_1 = By.cssSelector(".bcd");
    //private static By text_2 = By.cssSelector("#NextedText");
    private static By select = By.cssSelector("[name='continents']");
    private static By select_selenium = By.cssSelector("[multiple='multiple']");

    public static void main( String[] args )
    {
        //Создаём системную переменную которая содержит путь к драйверу
        System.setProperty("webdriver.chrome.driver","src\\main\\java\\com\\mainacad\\drivers\\chromedriverWin.exe");

        //Создаём вебдрайвер
        WebDriver driver = new ChromeDriver();

        //Открываем тестовую страницу
        driver.get("https://www.toolsqa.com/automation-practice-form/");

        //TODO: Вывести в консоль текст Инфо сообщения

        WebElement elem = driver.findElement(info_message);
        System.out.println(elem.getText());

        //TODO: Вывести в консоль текст заголовка формы ("Practice Automation Form")

        WebElement elem2 = driver.findElement(info_message_2);
        System.out.println(elem2.getText());

        //TODO: Кликнуть линк Partial Link Test

        WebElement elem3 = driver.findElement(link_test);
        elem3.click();

        //TODO: Заполнить поле First name:

        WebElement elem4 = driver.findElement(first_name);
        elem4.sendKeys("Umanets");

        //TODO: Заполнить поле Last name:

        WebElement elem5 = driver.findElement(last_name);
        elem5.sendKeys("Alex");

        //TODO: Выбрать пол

        WebElement elem6 = driver.findElement(gender);
        elem6.click();

        //TODO: Выбрать количество лет опыта

        WebElement elem7 = driver.findElement(experience);
        elem7.click();

        //TODO: Заполнить поле дата

        WebElement elem8 = driver.findElement(date);
        elem8.sendKeys("2019-05-08");

        //TODO: Выбрать несколько Automation Tool

        WebElement elem9 = driver.findElement(tool_1);
        elem9.click();
        WebElement elem10 = driver.findElement(tool_2);
        elem10.click();

        //TODO: Выбрать континент из выпадающего списка

        Select elem_select = new Select(driver.findElement(select));
        elem_select.selectByVisibleText("Europe");

        //TODO: Выбрать несколько вариантов из списка Selenium Commands

        Select elem_selenium_1 = new Select(driver.findElement(select_selenium));
        elem_selenium_1.selectByVisibleText("Browser Commands");

        //TODO: Кликнуть на кнопку Button

        WebElement elem11 = driver.findElement(button);
        elem11.click();

        //TODO: Вывести в консоль текст лейбла Text1

        WebElement elem12 = driver.findElement(text_1);
        System.out.println(elem12.getText());

        //TODO: Вывести в консоль текст лейбла Text2
        //WebElement elem13 = driver.findElement(text_2);
        //System.out.println(elem13.getText());

        //TODO: Закрыть браузер

        driver.close();

    }
}