package com.softserve.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Task 3 (optional). First YouTube link in the "Навчайся" challenge.
 */
public class ChallengeTest extends UiTest {

    @BeforeEach
    void openHomePage() {
        driver.get(ClubSearchTest.BASE_URL);
    }

    @Test
    void checkChallengeYoutube() {
        // 1. Open the "Навчайся" challenge.
        // 2. Scroll to the video "Спікерка – викладачка української мови, перекладачка, редакторка Наталя Вуйтік".
        // 3. Switch into the video frame and start the video.
        // 4. Assert the video URL is https://www.youtube.com/watch?v=JMAF_pSOBws
        Assertions.fail("Implement the challenge video check");
    }
}
