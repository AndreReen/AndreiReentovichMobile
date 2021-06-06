package scenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import setup.BaseTest;
import setup.TestDataProvider;

public class webMobileTests extends BaseTest {

    @Test(groups = {"web"}, description = "Make sure that we've opened IANA homepage",
    dataProviderClass = TestDataProvider.class, dataProvider = "webTestData")
    public void simpleWebTest(String URL, String textToSearch) throws InterruptedException {

        getDriver().get(URL);
        getWebPO().search(textToSearch);

        Assert.assertTrue(getWebPO().getResults().size() > 1);
        System.out.println("Found " + getWebPO().getResults().size() + " search results");
        getWebPO().getResults().forEach(element -> System.out.println(element.getText()));
    }

}
