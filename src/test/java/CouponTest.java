import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page_object.CartPage;
import page_object.HeaderPage;
import page_object.HomePage;
import page_object.ProductPage;
import utils.LocalDriverManager;
import utils.PropertiesReader;

import static constans.Colors.BLUE;
import static constans.Messages.COUPON_IS_APPLIED;
import static constans.Products.HOODIE;

@Slf4j
public class CouponTest {

    private final WebDriver driver =
            LocalDriverManager.getInstance();

    HeaderPage header = new HeaderPage();
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();

    @BeforeEach
    public void init() {
        log.info("Step 1: User open webpage");
        // Implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(PropertiesReader.getProperties().getProperty("home.page"));
    }

    @Test
    public void applyCouponCode() {
        log.info("Step 2: User select product by product name: " + HOODIE);
        homePage.clickOnProduct(HOODIE);

        log.info("Step 3:");
        productPage.selectColor(BLUE);

        log.info("Step 4:");
        productPage.selectLogo(true);

        log.info("Step 5:");
        productPage.addProductToCart();

        log.info("Step 6: ");
        productPage.viewCart();

        log.info("Step 7: ");
        cartPage.enterCoupon("easy_discount");

        log.info("Step 8: ");
        cartPage.applyCoupon();

        log.info("Step 9: ");
        cartPage.checkSuccessMessage(COUPON_IS_APPLIED);

        cartPage.removeCouponWithJs();
        System.out.println("123");

    }

    @AfterEach
    public void tearDown() {
        LocalDriverManager.closeDriver();
    }
}