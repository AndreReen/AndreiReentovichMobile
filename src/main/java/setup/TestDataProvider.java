package setup;

import com.google.gson.Gson;
import entity.WebTestEntity;
import org.testng.annotations.DataProvider;
import java.io.FileReader;
import java.util.HashMap;

public class TestDataProvider {

    @DataProvider
    public Object[][] nativeTestData(){
        ReadProperties rProps = new ReadProperties();
        HashMap<String, String> nativeTestData = rProps.getPropetriesMap();
        return new  Object[][] {
                {nativeTestData.get("email"), nativeTestData.get("name"), nativeTestData.get("password"), nativeTestData.get("title")}
        };
    }

    @DataProvider
    public Object[] webTestData() throws Exception{

        String path = "src/test/resources/webTestData.json";
        WebTestEntity[] webTestEntity = new Gson().fromJson(new FileReader(path), WebTestEntity[].class);

        return webTestEntity;

    }
}
