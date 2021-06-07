package scenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import setup.BaseTest;
import setup.TestDataProvider;

public class webMobileTests extends BaseTest {

    @Test(groups = {"web"}, description = "Open Google.com & search EPAM, assure we get search results",
    dataProviderClass = TestDataProvider.class, dataProvider = "webTestData")
    public void webExerciseTest(String URL, String textToSearch) {

        getDriver().get(URL);
        getWebPO().search(textToSearch);

        Assert.assertTrue(getWebPO().getResults().size() > 1);
        System.out.println("Found " + getWebPO().getResults().size() + " search results");
        getWebPO().getResults().forEach(element -> System.out.println(element.getText()));
    }

}
