package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {
    WebDriver driver;

    By uploadDocumentsOption = By.id("uploadDocumentsOption");
    By singleUploadOption = By.id("singleUploadOption");
    By multipleUploadOption = By.id("multipleUploadOption");
    By singleFileBox = By.id("singleFileBox");
    By multipleFileBoxesContainer = By.id("multipleFileBoxesContainer");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadSection() {
        driver.get("http://example.com/upload_section");
    }

    public void selectUploadDocumentsOption() {
        driver.findElement(uploadDocumentsOption).click();
    }

    public boolean isSingleUploadOptionVisible() {
        return driver.findElement(singleUploadOption).isDisplayed();
    }

    public boolean isMultipleUploadOptionVisible() {
        return driver.findElement(multipleUploadOption).isDisplayed();
    }

    public void selectSingleFileUpload() {
        driver.findElement(singleUploadOption).click();
    }

    public boolean isSingleFileBoxEnabled() {
        return driver.findElement(singleFileBox).isEnabled();
    }

    public void selectMultipleFilesUpload() {
        driver.findElement(multipleUploadOption).click();
    }

    public boolean areMultipleFileBoxesVisible() {
        return driver.findElement(multipleFileBoxesContainer).isDisplayed();
    }
}