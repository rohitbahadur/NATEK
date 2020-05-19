package com.demo.actions;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import org.openqa.selenium.By;

import com.codeborne.selenide.Condition;

public class SearchForJobsAction {

    WaitForSpinnerAction waitForSpinner = new WaitForSpinnerAction();

    public void forPopularCompany(String companyTitle) {
        waitForSpinner.toDissapear();

        Pause.forMilliseconds(2000);
        $(By.linkText(companyTitle)).shouldBe(Condition.visible) .click();

        $$("#SearchResults .title").shouldHave(sizeGreaterThan(10));

    }

}
