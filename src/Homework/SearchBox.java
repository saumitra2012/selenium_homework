package Homework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class SearchBox {


//  #Search box functionality test: Pass
//    Open Chrome browser: Pass
//    Enter amazon url in address bar and hit enter: Pass
//    Click on search box: Pass
//    Enter Hand sanitizer: Pass
//    Click on search button: pass
//    Verify Hand sanitizer is displayed properly: Pass
//    ExpectedResult: Hand sanitizer should display properly
//    ActualResult: Hand sanitizer display properly

    public WebDriver driver;
    public String chromeDriver = "webdriver.chrome.driver";
    public String chromeDriverPath = "C:\\Users\\debna\\IdeaProjects\\Selenium_Homework_First\\lib\\browserDriver\\chromedriver.exe";
    public String url = "https://www.amazon.com/";
    public String searchBox = "//*[@id=\"twotabsearchtextbox\"]";
    public String productSearch = "hand sanitizer";
    public String searchButton = "//*[@id=\"nav-search\"]/form/div[2]/div/input";
    public String handSanitizerActualText = "//span[text()='6-pack myDerm Hand Sanitizer with Aloe - 62% Alcohol kills 99.9% of germs']";
    public String expectedText = "6-pack myDerm Hand Sanitizer with Aloe - 62% Alcohol kills 99.9% of germs";
    public String pcSearch = "pc";
    public String list = "//*[@id=\"nav-hamburger-menu\"]"; // amazon shop by category menu

    @BeforeMethod
    public void welcome() {
        System.out.println("Welcome to Amazon Automation world");
    }

    public void setUp(String driverUrl, String driverPath, String url) {
        // For Chrome Browser
        System.setProperty(driverUrl, driverPath);
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }

    // Test case Action method
    public void searchBoxCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath,url);
        //Click on search box and Enter Hand sanitizer
        driver.findElement(By.xpath(searchBox)).sendKeys(productSearch);
        Thread.sleep(3000);
        //Click on search button
        driver.findElement(By.xpath(searchButton)).click();
        Thread.sleep(5000);
    }

    public String bestSellers = "//*[@id=\"nav-xshop\"]/a[1]";
    public void bestSellers() {
        driver.findElement(By.xpath(bestSellers)).click();
    }

    public String customerService = "//*[@id=\"nav-xshop\"]/a[2]";

    public void customerService() {
        driver.findElement(By.xpath(customerService)).click();
    }

    public String todaysDeals = "//*[@id=\"nav-xshop\"]/a[3]";

    public void todaysDeals() {
        driver.findElement(By.xpath(todaysDeals)).click();
    }

    public String newRealeases = "//*[@id=\"nav-xshop\"]/a[4]";

    public void newReleases() {
        driver.findElement(By.xpath(newRealeases)).click();
    }

    public String find_a_gift = "//*[@id=\"nav-xshop\"]/a[5]";

    public void find_a_gift() {
        driver.findElement(By.xpath(find_a_gift)).click();
    }

    public String wholeFoods = "//*[@id=\"nav-xshop\"]/a[6]";

    public void wholeFoods() {
        driver.findElement(By.xpath(wholeFoods)).click();
    }

    public String giftCards = "//*[@id=\"nav-xshop\"]/a[7]";

    public void giftCards() {
        driver.findElement(By.xpath(giftCards)).click();
    }

    public String freeShipping = "//*[@id=\"nav-xshop\"]/a[8]";

    public void freeShipping() {
        driver.findElement(By.xpath(freeShipping)).click();
    }

    public String registry = "//*[@id=\"nav-xshop\"]/a[9]";

    public void registry() {
        driver.findElement(By.xpath(registry)).click();
    }

    public String sell = "//*[@id=\"nav-xshop\"]/a[10]";

    public void sell() {
        driver.findElement(By.xpath(sell)).click();
    }

    public String coupons = "//*[@id=\"nav-xshop\"]/a[11]";

    public void coupons() {
        driver.findElement(By.xpath(coupons)).click();
    }

    public String amazonBasics = "//*[@id=\"nav-xshop\"]/a[12]";

    public void amazonBasics() {
        driver.findElement(By.xpath(amazonBasics)).click();
    }

    public String foundItOnAmazon = "//*[@id=\"nav-xshop\"]/a[13]";

    public void foundItOnAmazon() {
        driver.findElement(By.xpath(foundItOnAmazon)).click();
    }

    public String amazonMusic = "//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a/div";

    public void amazonMusic() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(amazonMusic)).click();
        Thread.sleep(3000);
    }

    public String primeVideo = "//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a/div";

    public void primeVideo() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(primeVideo)).click();
        Thread.sleep(3000);
    }

    public String audibleBooksAndOriginals = "//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a/div";

    public void audibleBooksAndOriginals() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(audibleBooksAndOriginals)).click();
        Thread.sleep(3000);
    }

    public String fireTablets = "//*[@id=\"hmenu-content\"]/ul[1]/li[5]/a/div";

    public void fireTablets() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(fireTablets)).click();
        Thread.sleep(3000);
    }

    public String appstoreForAndroid = "//*[@id=\"hmenu-content\"]/ul[1]/li[9]/a/div";

    public void appstoreForAndroid() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(appstoreForAndroid)).click();
        Thread.sleep(3000);
    }

    public String books = "//*[@id=\"hmenu-content\"]/ul[1]/li[13]/a/div";

    public void books() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(books)).click();
        Thread.sleep(3000);
    }

    public String electronics = "//*[@id=\"hmenu-content\"]/ul[1]/li[15]/a/div";

    public void electronics() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(electronics)).click();
        Thread.sleep(3000);
    }

    public String computers = "//*[@id=\"hmenu-content\"]/ul[1]/li[16]/a/div";

    public void computers() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(computers)).click();
        Thread.sleep(3000);
    }

    public String foodAndGrocery = "//*[@id=\"hmenu-content\"]/ul[1]/li[20]/a/div";

    public void foodAndGrocery() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(foodAndGrocery)).click();
        Thread.sleep(3000);
    }

    public String petSupplies = "//*[@id=\"hmenu-content\"]/ul[1]/li[19]/a/div";

    public void petSupplies() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(petSupplies)).click();
        Thread.sleep(3000);
    }

    public String beautyAndHealth = "//*[@id=\"hmenu-content\"]/ul[1]/li[21]/a/div";

    public void beautyAndHealth() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(beautyAndHealth)).click();
        Thread.sleep(3000);
    }

    public String handMade = "//*[@id=\"hmenu-content\"]/ul[1]/li[23]/a/div";

    public void handMade() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(handMade)).click();
        Thread.sleep(3000);
    }

    public String sports = "//*[@id=\"hmenu-content\"]/ul[1]/li[24]/a/div";

    public void sports() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(sports)).click();
        Thread.sleep(3000);
    }

    public String outdoors = "//*[@id=\"hmenu-content\"]/ul[1]/li[25]/a/div";

    public void outdoors() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(outdoors)).click();
        Thread.sleep(3000);
    }

    public String wholeFoodsMarket = "//*[@id=\"hmenu-content\"]/ul[1]/li[28]/a/div";

    public void wholeFoodsMarket() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(wholeFoodsMarket)).click();
        Thread.sleep(3000);
    }

    public String makeMoneyWithAmazon = "//*[@id=\"hmenu-content\"]/ul[1]/li[30]/a/div";

    public void makeMoneyWithAmazon() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(list)).click();
        driver.findElement(By.xpath(makeMoneyWithAmazon)).click();
        Thread.sleep(3000);
    }

}

