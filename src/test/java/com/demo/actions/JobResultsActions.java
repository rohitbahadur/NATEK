package com.demo.actions;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.actions;

import com.codeborne.selenide.ElementsCollection;

public class JobResultsActions {

    private final static String JOB_TITLES = ".summary h2 a";

    public void saveJobNumber(int jobNumber) {
        ElementsCollection jobTitles = $$(JOB_TITLES);
        actions().moveToElement(jobTitles.get(jobNumber - 1)).perform();

        $(jobTitles.get(jobNumber - 1)).shouldBe(visible);
        $(jobTitles.get(jobNumber - 1)).click();

        $("#SaveJob").shouldBe(visible);
        $("#SaveJob").click();
        $(".alert-success").should(disappear);
    }

    public void saveLastJob() {
        ElementsCollection jobTitles = $$(JOB_TITLES);
        saveJobNumber(jobTitles.size());
    }

}
