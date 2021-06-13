package scenarios;

import entity.WebTestEntity;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.BaseTest;
import setup.TestDataProvider;

public class webMobileTests extends BaseTest {

    @Test(groups = {"web"}, description = "Open Google.com & search EPAM, assure we get search results",
    dataProviderClass = TestDataProvider.class, dataProvider = "webTestData")
    public void webExerciseTest(WebTestEntity webTestData) {

        getDriver().get(webTestData.getUrl());
        getWebPO().search(webTestData.getSearch());
        Assert.assertTrue(getWebPO().getResults().size() > 0);
        System.out.println("Found " + getWebPO().getResults().size() + " search results");
        getWebPO().getResults().forEach(
                element -> Assert.assertTrue(element.getText().toLowerCase().contains("epam")));

    }

}
