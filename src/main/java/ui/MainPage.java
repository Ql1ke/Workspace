package ui;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    //Стартовая страница MainePage, и нажать на кнопку "статус заказа"
    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    //Создаём элемент
    private SelenideElement orderStatusButton;

    //аннотация selenide с указанием локатора, по которому ищем. Затем указываем его - using
    @FindBy(how = How.XPATH, using = ".//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")
    //Создаём элемент - ввод номера заказа
    private SelenideElement orderNumberInput;

    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Header_Button__28dPO']")
    //Последнее поле на главной странице
    private SelenideElement searchOrderButton;

    //Метод, который запускает сразу
    public MainPage clickOrderStatusButton(){
        orderStatusButton.click();
        return this;
    }

    public MainPage sendOrderNumber(String orderNumber) {
        orderNumberInput.sendKeys(orderNumber);
        return this;
    }

    public OrderStatusPage clickSearchButton() {
        searchOrderButton.click();
        return page(OrderStatusPage.class);
    }

}
