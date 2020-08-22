package Homework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
    public String pcSearch="pc";
    public String bookSearch="books";
    public String tableSearch="table";
    public String fanSearch="fan";
    public String penSearch="pen";
    public String bagsSearch="bags";
    public String shirtsSearch="shirts";
    public String blazersSearch="blazers";
    public String longCoatsSearch="longCoats";
    public String chairsSearch="chairs";
    public String flagsSearch="flags";
    public String cameraSearch="camera";
    public String bookShelfSearch="bookShelf";
    public String phoneSearch="phone";
    public String moviesSearch="movies";
    public String disinfectingSpraySearch="disinfectingSpray";
    public String soapsSearch="soaps";
    public String detergentsSearch="detergents";
    public String paperTowelsSearch="paperTowels";
    public String oliveOilSearch="oliveOil";
    public String guitarSearch="guitar";
    public String electricGuitarSearch="electricGuitar";
    public String speakersSearch="speakers";
    public String musicSearch="music";
    public String serialsSearch="serials";
    public String carKeysSearch="carKeys";
    public String laptopSearch="laptop";
    public String faceMaskSearch="faceMask";
    public String ipadSearch="ipad";
    public String fishingHookSearch="fishingHook";

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


}
