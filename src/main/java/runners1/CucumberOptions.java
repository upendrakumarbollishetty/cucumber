package runners1;

public @interface CucumberOptions {

	String features();

	String glue();

	String[] plugin();

}
