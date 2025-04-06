# spriteCloud-TA-assignment

The Web-UI part of the project is based on Selenium & Cucumber and the API part is based on Okhttp & Retrofit.
I used open-source libraries that I contribute to, such as Pickleib and Java-Utilities.

The CommonSteps class stores the generic UI steps and saves us from the repeated code.
The ObjectRepository class is used for storing the page object instances; the page objects are automatically instantiated when the element of that page is interacted with.
The PageObject class is for overwriting Selenium's default field decorator to be able to use WebComponents.

You can find the cucumber test reports under the reports directory in resources folder.
After the run is completed you can find the generated results in the target directory under the reports folder.

## Requirements
- JDK 17
- Maven 3

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
- Deafult browser type is Chrome. To select a browser type, add a browser tag in scenarios. Supported browsers are ```@Firefox```, ```@Safari``` and ```@Chrome```. 

- Tests can be run headless by modifying the headless property in _test.properties_.

- To be able to use ```@Firefox``` change ```allow-remote-origin``` to ```false``` in _test.properties_ file.