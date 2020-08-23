package Homework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonPractice extends SearchBox {

    @Test
    public void searchBoxCheck() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        //Click on search box and Enter Hand sanitizer
        driver.findElement(By.xpath(searchBox)).sendKeys(productSearch);
        Thread.sleep(3000);
        //Click on search button
        //driver.findElement(By.xpath(searchButton)).click();
        driver.findElement(By.xpath(searchBox)).submit();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).isDisplayed(), true);

    }

    @Test //Test Case Number=1
    public void searchPC() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(pcSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).isDisplayed(), true);


    }
    @Test  //Test Case Number=2
    public void testBestSellers() {
        setUp(chromeDriver, chromeDriverPath, url);
        bestSellers();
    }
    @Test  //Test Case Number=3
    public void testCustomerService() {
        setUp(chromeDriver, chromeDriverPath, url);
        customerService();
    }
    @Test  //Test Case Number=4
    public void testTodaysDeals() {
        setUp(chromeDriver, chromeDriverPath, url);
        todaysDeals();
    }
    @Test   //Test Case Number=5
    public void testNewReleases() {
        setUp(chromeDriver, chromeDriverPath, url);
        newReleases();
    }
    @Test    //Test Case Number=6
    public void testFind_A_Gift() {
        setUp(chromeDriver, chromeDriverPath, url);
        find_a_gift();
    }
    @Test  //Test Case Number=7
    public void testWholeFoods() {
        setUp(chromeDriver, chromeDriverPath, url);
        wholeFoods();
    }

    @Test  //Test Case Number=8
    public void testGiftCards() {
        setUp(chromeDriver, chromeDriverPath, url);
        giftCards();
    }
    @Test  //Test Case Number=9
    public void testFreeShipping() {
        setUp(chromeDriver, chromeDriverPath, url);
        freeShipping();
    }
    @Test  //Test Case Number=10
    public void testRegistry() {
        setUp(chromeDriver, chromeDriverPath, url);
        registry();
    }
    @Test   //Test Case Number=11
    public void testSell() {
        setUp(chromeDriver, chromeDriverPath, url);
        sell();
    }
    @Test   //Test Case Number=12
    public void testCoupons() {
        setUp(chromeDriver, chromeDriverPath, url);
        coupons();
    }
    @Test  //Test Case Number=13
    public void testAmazonBasics() {
        setUp(chromeDriver, chromeDriverPath, url);
        amazonBasics();
    }
    @Test   //Test Case Number=14
    public void testFoundItOnAmazon() {
        setUp(chromeDriver, chromeDriverPath, url);
        foundItOnAmazon();
    }
    @Test  ////Test Case Number=15
    public void testAmazonMusic() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        amazonMusic();
    }
    @Test  //Test Case Number=16
    public void testPrimeVideo() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        primeVideo();
    }
    @Test  //Test Case Number=17
    public void testAudibleBooksAndOriginals() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        audibleBooksAndOriginals();
    }
    @Test  //Test Case Number=18
    public void testFireTablets() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        fireTablets();
    }
    @Test  //Test Case Number=19
    public void testAppstoreForAndroid() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        appstoreForAndroid();
    }
    @Test  //Test Case Number=20
    public void testBooks() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        books();
    }
    @Test   //Test Case Number=21
    public void testElectronics() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        electronics();
    }
    @Test  //Test Case Number=22
    public void testComputers() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        computers();
    }
    @Test  //Test Case Number=23
    public void testFoodAndGrocery() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        foodAndGrocery();
    }
    @Test  //Test Case Number=24
    public void testPetSupplies() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        petSupplies();
    }
    @Test  //Test Case Number=25
    public void testBeautyAndHealth() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        beautyAndHealth();
    }
    @Test  //Test Case Number=26
    public void testHandMade() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        handMade();
    }
    @Test  //Test Case Number=27
    public void testSports() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        sports();
    }
    @Test  //Test Case Number=28
    public void testOutdoors() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        outdoors();
    }
    @Test  //Test Case Number=29
    public void testWholeFoodsMarket() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        wholeFoodsMarket();
    }
    @Test  //Test Case Number=30
    public void testMakeMoneyWithAmazon() throws InterruptedException {
        setUp(chromeDriver, chromeDriverPath, url);
        makeMoneyWithAmazon();
    }

    }





