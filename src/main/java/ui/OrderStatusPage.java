package ui;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderStatusPage {

    @FindBy(how = How.CLASS_NAME, using = "Track_NotFound__6oaoY")
    private SelenideElement searchResultImage;

    public Boolean isSeatchResultImageDisplayed() {
        return searchResultImage.isDisplayed();
    }
}
