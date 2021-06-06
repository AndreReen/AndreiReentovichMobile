package setup;

import org.testng.annotations.DataProvider;

import static setup.ReadProperties.props;

public class TestDataProvider {

    @DataProvider
    public Object[][] nativeTestData(){
        ReadProperties.main();
        return new  Object[][] {
                {props.get("email"), props.get("name"), props.get("password"), props.get("title")}
        };
    }


    @DataProvider
    public Object[][] webTestData(){
        return new  Object[][] {
                {"https://google.com", "EPAM"}
        };
    }
}
