package com.demo;

import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;
import com.demo.actions.CreateAccountAction;
import com.demo.actions.JobResultsActions;
import com.demo.actions.SearchForJobsAction;
import com.demo.actions.ViewSavedJobsAction;
import com.demo.actions.WaitForSpinnerAction;
import com.demo.data.RandomEmail;

public class SavingJobsTest
{

    CreateAccountAction createAccount = new CreateAccountAction();
    SearchForJobsAction searchForJobs = new SearchForJobsAction();
    WaitForSpinnerAction waitForSpinner = new WaitForSpinnerAction();
    JobResultsActions jobResultsActions = new JobResultsActions();
    ViewSavedJobsAction viewSavedJobs = new ViewSavedJobsAction();

    @BeforeMethod
    public void openTheApplication() {

        Configuration.timeout = 10000;

        open(HomePage.URL);
        waitForSpinner.toDissapear();

    }

    @Test
    public void jobSeekersCanSaveTheJobsTheyAreInterestedIn()
    {
        createAccount.withEmailAndPassword(RandomEmail.address(),"Secret123!");
        searchForJobs.forPopularCompany("Philips Jobs");
        jobResultsActions.saveJobNumber(2);
        jobResultsActions.saveJobNumber(3);
        jobResultsActions.saveJobNumber(4);
        jobResultsActions.saveLastJob();

        List<String> savedJobs = viewSavedJobs.viewMySavedJobs();
        assertThat(savedJobs).hasSize(4);
    }
}
