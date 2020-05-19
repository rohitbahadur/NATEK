package com.demo.actions;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$;

public class WaitForSpinnerAction {

    public void toDissapear() {
        $(".spinner").shouldBe(hidden);
        $(".spinner-overlay").shouldBe(hidden);
    }
}
