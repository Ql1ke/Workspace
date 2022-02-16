package ui;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchOrderTest {

    @Test
    public void searchOrderWithInvalidTest() {

        //System.setProperty("webdriver.geckodriver", "https://github.com/mozilla/geckodriver/releases");
        System.setProperty("selenide.browser", "firefox");
        //создаем при открытии страницы MainPage, передавая указание класса. (То что в конце ссылки через точку)
        MainPage mainPage = open("http://qa-scooter.praktikum-services.ru/", MainPage.class);
        boolean result = mainPage.clickOrderStatusButton()
                .sendOrderNumber("5")
                .clickSearchButton()
                .isSeatchResultImageDisplayed();

        assertTrue(result);

    }

}
