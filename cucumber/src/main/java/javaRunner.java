import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\ekpoo\\Desktop\\TekArch\\GIT\\cucumber\\src\\test\\resources\\Features\\training.feature"
        ,glue={"cucumberStep"}
)
public class javaRunner {
}
