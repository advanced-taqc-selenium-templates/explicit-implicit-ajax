package com.softserve.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Task 2. Advanced club search on "Навчай українською".
 */
public class ClubSearchTest extends UiTest {

    static final String BASE_URL = "http://speak-ukrainian.eastus2.cloudapp.azure.com/dev/";

    @BeforeEach
    void openClubsPage() {
        driver.get(BASE_URL);
    }

    @Test
    void checkClubSearch() {
        // 1. Select the city "Харків".
        // 2. Assert that the club "Новий Кадр" is present.
        // 3. Open advanced search.
        // 4. Open page 5 and assert that "Новий Кадр" is present there as well.
        // Use explicit waits for the results. Do not use Thread.sleep.
        Assertions.fail("Implement club search checks");
    }
}
