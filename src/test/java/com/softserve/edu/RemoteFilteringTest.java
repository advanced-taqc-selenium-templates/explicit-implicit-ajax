package com.softserve.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

/**
 * Task 1. Remote Filtering.
 * https://devexpress.github.io/devextreme-reactive/react/grid/docs/guides/filtering/
 */
public class RemoteFilteringTest extends UiTest {

    private static final String BASE_URL
            = "https://devexpress.github.io/devextreme-reactive/react/grid/docs/guides/filtering/";

    @BeforeEach
    void openFilteringGuide() {
        driver.get(BASE_URL);
        closeCookiePopup();
    }

    private void closeCookiePopup() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        List<WebElement> footerButton = driver
                .findElements(By.xpath("//footer[contains(@class,'cookie')]//button"));
        if (!footerButton.isEmpty()) {
            footerButton.get(0).click();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT_SECONDS));
    }

    @Test
    void checkRemoteFiltering() {
        // 1. Scroll to the "Remote Filtering" section.
        // 2. Switch into the table iframe.
        // 3. Type "lon" into the City filter.
        // 4. Wait until the filtered row is shown (explicit wait; do not use Thread.sleep).
        // 5. Assert the first row: Country UK, City London, Address Fauntleroy Circus.
        Assertions.fail("Implement Remote Filtering checks");
    }
}
