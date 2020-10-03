import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test1 {
    WebDriver driver;
    Properties prop;
    FileInputStream ip = null;

    public Test1() throws FileNotFoundException {
        prop = new Properties();

        ip = new FileInputStream(System.getProperty("user.dir" + "src\\main\\java\\config.properties"));

        try {
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 public static void Main(String[] args){
         String Osname = System.getProperty("Os.name");
         System.getProperties().list(System.out);
         System.out.println(Osname);
//        if (Osname.equals("Mac")) {
//            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Beauty\\Desktop\\New\\geckodriverMac.exe");
//            // https://github.com/mozilla/geckodriver/releases   download geckdriver from this link
//            driver = new FirefoxDriver();
//        }else {
//            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Beauty\\Desktop\\New\\geckodrivernew.exe");
//            driver = new FirefoxDriver();
//        }
//            driver.manage().window().maximize();
//            driver.manage().deleteAllCookies();
//
//            Thread.sleep(5000);
//        }
     }
 }


