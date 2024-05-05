import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class lambdatest2{
     /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {


        System.setProperty("webdriver.chrome.driver","E:\\Demojava\\Jave.demo\\src\\Drivers\\chromedriver.exe");
         
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.lambdatest.com/selenium-playground/");

        driver.findElement(By.xpath("//a[@href='https://www.lambdatest.com/selenium-playground/input-form-demo']")).click();

        //click on submit 
        //driver.findElement(By.cssSelector(".bg-lambda-900")).click();


       //WebElement errorMessageElement = driver.findElement(By.cssSelector(".bg-lambda-900"));

       // System.out.println(errorMessageElement.findElement(By.cssSelector(".bg-lambda-900")));

        driver.findElement(By.cssSelector("input[id='name']")).sendKeys("Somveer Gurjar");

        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Demo@gmail.com");
        
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("@123");

        driver.findElement(By.xpath("//input[@placeholder='Company']")).sendKeys("MM");

        driver.findElement(By.xpath("//input[@placeholder='Website']")).sendKeys("https://www.lambdatest.com/");

         WebElement staticDropdown = driver.findElement(By.xpath("//select[@name='country']"));
        
        Select Dropdown = new Select(staticDropdown);
         Dropdown.selectByValue("US");
         //System.out.println(driver.findElement(By.xpath("//select[@value='US']")).getText());

         driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys("Pune");

         driver.findElement(By.xpath("//input[@placeholder='Address 1']")).sendKeys("Pune");

         driver.findElement(By.xpath("//input[@placeholder='Address 2']")).sendKeys("Pune");

         driver.findElement(By.xpath("//input[@placeholder='State']")).sendKeys("Maharastra");

         driver.findElement(By.cssSelector("input[id='inputZip']")).sendKeys("111045");
         
         driver.findElement(By.cssSelector(".bg-lambda-900")).click();


         System.out.println(driver.findElement(By.xpath("//p[@class='success-msg hidden']")).getText());
    }
}