package stepDefinition;

public class SharedSteps {

    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\upend\\eclipse-workspace\\Practice Exercises\\Selenium - S2\\CucumberTest\\drivers\\windows\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        driver.quit();
    }

    
}




