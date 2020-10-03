import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

    public static void main(String[] args) {
        String osname = System.getProperty("os.name");
        System.out.println(osname);
        if (osname.contains("Windows")){
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Executable//geckodrivernew.exe");
            WebDriver driver = new FirefoxDriver();
        } else if (osname.contains("Mac")) {
             System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Executable//geckodriverMac.exe");
            WebDriver driver = new FirefoxDriver();
        }

    }
}
