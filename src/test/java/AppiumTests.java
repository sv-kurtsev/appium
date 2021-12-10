
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class AppiumTests {

    @Test
    public void firstAppiumTest() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "6.0");
        desiredCapabilities.setCapability("deviceName", "Nexus_S_API_2");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appActivity", ".SplashActivity");
        desiredCapabilities.setCapability("appPackage", "com.swaglabsmobileapp");
        desiredCapabilities.setCapability("app", "D:\\Java\\AppiumTesting\\SaucelabTestApp\\SauceLabsTestApp.apk");

        AndroidDriver<AndroidElement> androidDriver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        androidDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        MobileElement userNameField = (MobileElement) androidDriver.findElementByAccessibilityId("test-Username");
        userNameField.sendKeys("standard_user");
        MobileElement passwordField = (MobileElement) androidDriver.findElementByAccessibilityId("test-Password");
        passwordField.sendKeys("secret_sauce");
        MobileElement logInButton = (MobileElement) androidDriver.findElementByAccessibilityId("test-LOGIN");
        logInButton.click();
        MobileElement filterIcon = (MobileElement) androidDriver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]//android.widget.ImageView");
        filterIcon.click();
        MobileElement a_zSortingButton = (MobileElement) androidDriver.findElementByXPath("//*[@text='Name (Z to A)']");
        a_zSortingButton.click();
        MobileElement listViewOptionsIcon = (MobileElement) androidDriver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"test-Toggle\"]/android.widget.ImageView");
        listViewOptionsIcon.click();
        MobileElement addToCartIcon1Item = (MobileElement) androidDriver.findElementByXPath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]/android.widget.TextView");
        addToCartIcon1Item.click();
        MobileElement cartIcon = (MobileElement) androidDriver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]//android.widget.ImageView");
        cartIcon.click();
        MobileElement checkoutButton = (MobileElement) androidDriver.findElementByAccessibilityId("test-CHECKOUT");
        checkoutButton.click();
        MobileElement firstNameField = (MobileElement) androidDriver.findElementByAccessibilityId("test-First Name");
        firstNameField.sendKeys("Test Name");
        MobileElement lastNameField = (MobileElement) androidDriver.findElementByAccessibilityId("test-Last Name");
        lastNameField.sendKeys("Test Last Name");
        MobileElement ZipCodeField = (MobileElement) androidDriver.findElementByAccessibilityId("test-Zip/Postal Code");
        ZipCodeField.sendKeys("12345NY");
        MobileElement ContinueButton = (MobileElement) androidDriver.findElementByAccessibilityId("test-CONTINUE");
        ContinueButton.click();
    }

}
