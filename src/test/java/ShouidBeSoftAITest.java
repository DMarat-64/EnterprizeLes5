import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class ShouidBeSoftAITest {

    @Test
    void ShouidBeSoftHeadingTest(){

        open("https://github.com/");
       $(".HeaderMenu-nav").$(byText("Solutions")).hover();
       $$("[aria-labelledby=solutions-by-company-size-heading]").first().$("a").click();
        $("#hero-section-brand-heading").shouldHave(Condition.text("The AI-powered developer platform"));
    }
}
