package setup;

import org.testng.annotations.DataProvider;

import static setup.ReadProperties.propertiesMap;

public class TestDataProvider {

    @DataProvider
    public Object[][] nativeTestData(){
        ReadProperties.main();
        return new  Object[][] {
                {propertiesMap.get("email"), propertiesMap.get("name"), propertiesMap.get("password"), propertiesMap.get("title")}
        };
    }

    @DataProvider
    public Object[][] webTestData(){
        return new  Object[][] {
                {"https://google.com", "EPAM"}
        };
    }
}
