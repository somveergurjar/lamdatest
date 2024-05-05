import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lemdademo {
     /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {


        System.setProperty("webdriver.chrome.driver","E:\\Demojava\\Jave.demo\\src\\Drivers\\chromedriver.exe");
         
       
       

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.lambdatest.com/selenium-playground/");

        //click on simple form demo 
        driver.findElement(By.xpath("//a[@href='https://www.lambdatest.com/selenium-playground/simple-form-demo']")).click();
        System.out.println(driver.getCurrentUrl());

        {
            @SuppressWarnings("unused")
            String ab = "Welcome to LambdaTest";
        //enter values in the “Enter Message” text box
        driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']")).sendKeys("Welcome to LambdaTest");
        System.out.println(driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']")).getText());
        }
        //click on get checked button 
        driver.findElement(By.id("showInput")).click();

        //verify the msg 
        System.out.println(driver.findElement(By.id("message")).getText());





    
       




     }
    }