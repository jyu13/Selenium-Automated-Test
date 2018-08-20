/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formtest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Arnold
 */
public class FormTest {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Logger logger = Logger.getLogger("FormTest");
        PropertyConfigurator.configure("Log4j.properties");
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/chromedriver");
        
        WebDriver driver = new ChromeDriver();
        logger.info("Browser Opened");
        
        driver.get("http://localhost:3000");
        logger.info("Website launched");
        
        driver.findElement(By.name("first")).sendKeys("Arnold");
        logger.info("First name entered");
        Thread.sleep(500);
        
        driver.findElement(By.name("last")).sendKeys("Yu");
        logger.info("Last name entered");
        Thread.sleep(500);
        
        driver.findElement(By.name("street")).sendKeys("1600 Hollow Way.");
        logger.info("Street entered");
        Thread.sleep(500);
        
        driver.findElement(By.name("suite")).sendKeys("301");
        logger.info("Suite entered");
        Thread.sleep(500);
        
        driver.findElement(By.name("city")).sendKeys("San Francisco");
        logger.info("City entered");
        Thread.sleep(500);
               
        Select state = new Select(driver.findElement(By.name("state")));
        state.selectByVisibleText("California");
        logger.info("State selected");
        
        driver.findElement(By.name("zipcode")).sendKeys("94132");
        logger.info("Zip code entered");
        Thread.sleep(500);
        
        Select edu = new Select(driver.findElement(By.name("selectEdu")));
        edu.selectByVisibleText("College");
        logger.info("Education selected");
        
        Select income = new Select(driver.findElement(By.name("selectIncome")));
        income.selectByVisibleText("Less than $50k");
        logger.info("Income selected");
        
        driver.findElement(By.name("phone")).sendKeys("9999999999");
        logger.info("Phone number entered");
        Thread.sleep(500);
        
        driver.findElement(By.name("zipcode")).sendKeys("94132");
        logger.info("Zip code entered");
        Thread.sleep(500);
        driver.findElement(By.name("email")).sendKeys("arnoldyu@yahoo.com");
        logger.info("Email entered");
        Thread.sleep(500);
        driver.findElement(By.name("password")).sendKeys("arnold2000");
        logger.info("Password entered");
        Thread.sleep(500);
        driver.findElement(By.name("repassword")).sendKeys("arnold2000");
        logger.info("Password re-entered");
        Thread.sleep(500);
        driver.findElement(By.name("checkItOut")).click();
        logger.info("I agree to terms checked");
        Thread.sleep(500);

        driver.findElement(By.name("btnsub")).click();
        logger.info("Submit button clicked.");
        Thread.sleep(2000);
        String lastname = driver.findElement(By.id("result-last")).getAttribute("value");
        if("Yu".equals(lastname)){
            logger.info("Check lastname correct!");
        }else{
            logger.info("Check lastname failed");
        }
        Thread.sleep(500);
        String firstname = driver.findElement(By.id("result-first")).getAttribute("value");
        if("Arnold".equals(firstname)){
            logger.info("Check firstname correct!");
        }else{
            logger.info("Check firstname failed");
        }
        Thread.sleep(500);
        String street = driver.findElement(By.id("result-street")).getAttribute("value");
        if("1600 Hollow Way.".equals(street)){
            logger.info("Check street correct!");
        }else{
            logger.info("Check street failed");
        }
        Thread.sleep(500);
        String suite = driver.findElement(By.id("result-suite")).getAttribute("value");
        if("301".equals(suite)){
            logger.info("Check suite correct!");
        }else{
            logger.info("Check suite failed");
        }
        Thread.sleep(500);
        String city = driver.findElement(By.id("result-city")).getAttribute("value");
        if("San Francisco".equals(city)){
            logger.info("Check city correct!");
        }else{
            logger.info("Check city failed");
        }
        Thread.sleep(500);
        String state1 = driver.findElement(By.id("result-state")).getAttribute("value");
        if("California".equals(state1)){
            logger.info("Check state correct!");
        }else{
            logger.info("Check state failed");
        }
        Thread.sleep(500);
        String zip = driver.findElement(By.id("result-zipcode")).getAttribute("value");
        if("94132".equals(zip)){
            logger.info("Check zipcode correct!");
        }else{
            logger.info("Check zipcode failed");
        }
        Thread.sleep(500);
        String edu1 = driver.findElement(By.id("result-education")).getAttribute("value");
        if("College".equals(edu1)){
            logger.info("Check education correct!");
        }else{
            logger.info("Check ducation failed");
        }
        Thread.sleep(500);
        String income1 = driver.findElement(By.id("result-income")).getAttribute("value");
        if("Less than $50k".equals(income1)){
            logger.info("Check income correct!");
        }else{
            logger.info("Check income failed");
        }
        Thread.sleep(500);
        String phone1 = driver.findElement(By.id("result-phone")).getAttribute("value");
        if("9999999999".equals(phone1)){
            logger.info("Check phone number correct!");
        }else{
            logger.info("Check phone number failed");
        }
        Thread.sleep(500);
        String email = driver.findElement(By.id("result-email")).getAttribute("value");
        if("arnoldyu@yahoo.com".equals(email)){
            logger.info("Check email correct!");
        }else{
            logger.info("Check email failed");
        }
        Thread.sleep(500);
        String pwd1 = driver.findElement(By.id("result-password")).getAttribute("value");
        if("arnold2000".equals(pwd1)){
            logger.info("Check password correct!");
        }else{
            logger.info("Check password failed");
        }
        Thread.sleep(500);
        logger.info("Test complete");
    }
    
}
