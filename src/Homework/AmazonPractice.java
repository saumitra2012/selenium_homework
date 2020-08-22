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

    @Test
    public void searchPC() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(pcSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).isDisplayed(), true);


    }

    @Test
    public void searchBooks() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(bookSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com: Books");

    }

    @Test
    public void searchTable() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(tableSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : table");
    }

    @Test
    public void searchFan() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(fanSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : fan");

    }
    @Test
    public void searchPen() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(penSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : pen");

    }
    @Test
    public void searchBags() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(bagsSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : bags");

    }
    @Test
    public void searchShirts() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(shirtsSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : shirts");

    }
    @Test
    public void searchBlazers() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(blazersSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : blazers");

    }
    @Test
    public void searchLongCoats() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(longCoatsSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : longCoats");

    }
    @Test
    public void searchChairs() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(chairsSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : chairs");

    }
    @Test
    public void searchFlags() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(flagsSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : flags");
    }
    @Test
    public void searchCamera() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(cameraSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : camera");
    }
    @Test
    public void searchBookShelf() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(bookShelfSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : bookShelf");
    }
    @Test
    public void searchPhone() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(phoneSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : phone");
    }
    @Test
    public void searchMovies() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(moviesSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : movies");
    }
    @Test
    public void searchDisinfectingSpray() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(disinfectingSpraySearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : disinfectingSpray");
    }
    @Test
    public void searchSoaps() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(soapsSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : soaps");
    }
    @Test
    public void searchDetergents() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(detergentsSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : detergents");
    }
    @Test
    public void searchPaperTowels() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(paperTowelsSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : paperTowels");
    }
    @Test
    public void searchOliveOil() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(oliveOilSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : oliveOil");
    }
    @Test
    public void searchGuitar() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(guitarSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : guitar");
    }
    @Test
    public void searchElectricGuitar() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(electricGuitarSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : electricGuitar");
    }
    @Test
    public void searchSpeakers() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(speakersSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : speakers");
    }
    @Test
    public void searchMusic() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(musicSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : music");
    }
    @Test
    public void searchSerials() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(serialsSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : serials");
    }
    @Test
    public void searchCarKeys() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(carKeysSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : carKeys");
    }
    @Test
    public void searchLaptop() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(laptopSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : laptop");
    }
    @Test
    public void searchFaceMask() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(faceMaskSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).isDisplayed(), true);
    }
    @Test
    public void searchIpad() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(ipadSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : ipad");
    }
    @Test
    public void searchFishingHook() {
        setUp(chromeDriver, chromeDriverPath, url);
        driver.findElement(By.xpath(searchBox)).sendKeys(fishingHookSearch);
        driver.findElement(By.xpath(searchBox)).submit();
        Assert.assertEquals(driver.getTitle(), "Amazon.com : fishingHook");
    }





}