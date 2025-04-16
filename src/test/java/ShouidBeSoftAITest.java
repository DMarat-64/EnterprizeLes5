import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ShouidBeSoftAITest {

    @Test
    void ShouidBeSoftHeadingTest(){

        open("https://github.com/");
        $(".HeaderMenu-nav").shouldHave(text("Solutions"));
       $(".HeaderMenu-nav").$(byText("Solutions")).hover();
       $$("[aria-labelledby=solutions-by-company-size-heading]").first().$("a").click();
       $(".lp-SubNavContainer").shouldHave(text("Enterprise"));
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));
    }
}
