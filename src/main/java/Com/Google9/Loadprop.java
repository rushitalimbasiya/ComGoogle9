package Com.Google9;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Loadprop {
    static Properties prop;
    static FileInputStream inputStream;

    public String getProperty(String key)
    {
        prop = new Properties();
        try {
            inputStream = new FileInputStream("src\\test\\resources\\Config.properties");
            prop.load(inputStream);
            inputStream.close();
        }catch (IOException e)
        {e.printStackTrace();}
        return prop.getProperty(key);

    }
}
