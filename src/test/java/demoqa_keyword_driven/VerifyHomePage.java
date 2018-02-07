package demoqa_keyword_driven;

import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

public class VerifyHomePage extends KeywordTestBase{

    @Step("1.1: Verifying Home Page")
    @Test
    public void test() {
        homePage.clickAboutUsButton();
        aboutUsPage.isPageLoaded();
        aboutUsPage.clickBlogButton();
        aboutUsPage.clickContactButton();
        aboutUsPage.clickServicesButton();
    }

}
