# Explicit and implicit waits

Student starter for Selenium waits: implicit wait, explicit wait, and AJAX updates inside an iframe.

Requires **JDK 25** (current LTS) and Google Chrome. Maven downloads the matching ChromeDriver through WebDriverManager.

## What to implement

Leave `com.softserve.edu.example` as reference code. Implement the three tests below. The browser setup lives in `UiTest`; write the scenario in the test method.

| Task | Class | Method |
| --- | --- | --- |
| 1. Remote Filtering | `RemoteFilteringTest` | `checkRemoteFiltering` |
| 2. Club search | `ClubSearchTest` | `checkClubSearch` |
| 3. Challenge video (optional) | `ChallengeTest` | `checkChallengeYoutube` |

Run one task:

```bash
mvn -Dtest=RemoteFilteringTest test
mvn -Dtest=ClubSearchTest test
mvn -Dtest=ChallengeTest test
```

The reference examples are disabled so `mvn test` does not open a browser for them. Enable a single method locally when you want to compare `Thread.sleep`, implicit wait, and explicit wait.

## Task 1

Check filtering in the Remote Filtering table.

1. Open https://devexpress.github.io/devextreme-reactive/react/grid/docs/guides/filtering/
2. Scroll to **Remote Filtering**.
3. Switch into the table iframe.
4. Type `lon` in the City filter.
5. The first row must be Country `UK`, City `London`, Address `Fauntleroy Circus`.

The grid reloads by AJAX. An implicit wait alone is not enough after the filter: wait until the previous rows disappear, then read the new row. See `AjaxTest`.

## Task 2

Check advanced club search.

1. Open http://speak-ukrainian.eastus2.cloudapp.azure.com/dev/
2. Select the city **Харків**.
3. Assert that the club **Новий Кадр** is on the page.
4. Open advanced search.
5. Find **Новий Кадр** on page 5.

## Task 3 (optional)

Check the first YouTube link in the **Навчайся** challenge.

1. Open http://speak-ukrainian.eastus2.cloudapp.azure.com/dev/
2. Open the **Навчайся** challenge.
3. Scroll to the video *Спікерка – викладачка української мови, перекладачка, редакторка Наталя Вуйтік*.
4. Switch into the video frame and start the video.
5. Assert the address is `https://www.youtube.com/watch?v=JMAF_pSOBws`.

## Report

Record a short video (3–5 minutes) of the code and a test run, and publish it on YouTube. The report needs the GitHub link and the video link.
