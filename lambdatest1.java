import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class lambdatest1{
     /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {


        System.setProperty("webdriver.chrome.driver","E:\\Demojava\\Jave.demo\\src\\Drivers\\chromedriver.exe");
         
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.lambdatest.com/selenium-playground/");

        driver.findElement(By.xpath("//a[@href='https://www.lambdatest.com/selenium-playground/drag-drop-range-sliders-demo']")).click();

      
        // Locate the slider element by XPath (replace with actual XPath)
        WebElement slider = driver.findElement(By.xpath("//input[@value='15']"));

        // Get the default value of the slider
        int defaultValue = Integer.parseInt(slider.getAttribute("value"));
        System.out.println("Default value: " + defaultValue);
         Thread.sleep(3000);
        // Calculate the offset to drag the slider from default value to target value (95)
        int targetValue = 95;
        int offset = calculateOffset(defaultValue, targetValue);

        // Use Actions class to drag the slider to the target value
        Actions actions = new Actions(driver);
        actions.clickAndHold(slider).moveByOffset(offset, 0).release().perform();

        // Validate whether the range value shows 95
        int currentValue = Integer.parseInt(slider.getAttribute("value"));
        if (currentValue == targetValue) {
            System.out.println("Slider value set to 95 successfully.");
        } else {
            System.out.println("Slider value set to 95 failed.");
        }

       
    }

    // Calculate the offset to drag the slider from default value to target value
    private static int calculateOffset(int defaultValue, int targetValue) {
        int sliderWidth = 100; // Assuming the slider width is 100 units
        int steps = targetValue - defaultValue;
        return (sliderWidth / 100) * steps;
    }
}