package com.demo.actions;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

import org.openqa.selenium.By;

import com.demo.ui.Button;
import com.demo.ui.Dropdown;
import com.demo.ui.InputField;

public class CreateAccountAction {

    WaitForSpinnerAction waitForSpinner = new WaitForSpinnerAction();

    private static final By CREATE_AN_ACCOUNT_BUTTON = By.xpath("//button[contains(.,'Create an account')]");
    private static final String TERMS_AND_CONDITIONS= ".checkbox-toggle";

    public void withEmailAndPassword(String email, String password) {
        openCreateAccountPage();
        enterAccountDetails(email, password);

    }

    private void openCreateAccountPage() {
        $(Button.withLabel("CREATE ACCOUNT")).click();
    }

    private void enterAccountDetails(String email, String password) {
        $(InputField.withLabel("Email Address")).sendKeys(email);
        $(InputField.withLabel("Password")).sendKeys(password);
        $(InputField.withLabel("Re-enter password")).sendKeys(password);
        $(Dropdown.withLabel("Job Corps Center")).selectOption(1);
        $(TERMS_AND_CONDITIONS).click();

        $(CREATE_AN_ACCOUNT_BUTTON).shouldBe(enabled).click();

        waitForSpinner.toDissapear();
    }


}
