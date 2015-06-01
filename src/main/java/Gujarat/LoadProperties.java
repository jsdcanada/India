package Gujarat;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Jagdish on 21/05/2015.
 */
public class LoadProperties  {

    static Properties prop;
    static String propertiesFileLocation="src/test/java/Properties/";
    static String propertiesFileName="TestData.properties";
    static FileInputStream input;

    public static String getProperty(String key){
        prop=new Properties();
       try {
           input = new FileInputStream(propertiesFileLocation+ propertiesFileName);
           prop.load(input);
           input.close();
       }
       catch (IOException e) {
           e.printStackTrace();
       }
        return prop.getProperty(key);

    }
}
