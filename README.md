# spriteCloud-TA-assignment
### Description

Web-UThe part of the project is based on Selenium & Cucumber and the API part is based on Okhttp & Retrofit.
I used open-source libraries that I contribute to, such as Pickleib and Java-Utilities.
The CommonSteps class stores the generic UI steps and saves us from the repeated code.
The ObjectRepository class is used for storing the page object instances; the page objects are instantiated when we are interaction to that page.
The PageObject class is for overwriting Selenium's default field decorator to be able to use WebComponents.

## Run

- Go to project directory in terminal

- Run:
    ```yml
    mvn clean test
    ```

- To run a specific scenario use the special scenario tags:
    ```yml
    mvn clean test -q -Dcucumber.filter.tags="@SCN-Reqres-1"
    ```
- Deafult driver type is Chrome. To select a driver type, add a driver tag in scenarios.

- Tests can be run headless by modifying the headless property in _test.properties_.