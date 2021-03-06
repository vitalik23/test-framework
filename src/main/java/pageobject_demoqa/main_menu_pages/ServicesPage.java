package pageobject_demoqa.main_menu_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobject_demoqa.SideMenu;

public class ServicesPage extends SideMenu {

    @FindBy(css = ".entry-title")
    WebElement pageTitle;

    @FindBy(css = ".entry-content p")
    WebElement pageContent;

    WebDriver driver;

    public ServicesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean isPageLoaded() {
        return pageTitle.getText().equals("Services");
    }
}
