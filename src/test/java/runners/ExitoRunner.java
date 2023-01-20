package runners;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import utils.RunnerPersonalizado;

@CucumberOptions(features = {"src/test/resources/features/OrdenarProductos.feature"},
        tags = "@OrdenarProductos",
        glue = {"definitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
@RunWith(RunnerPersonalizado.class)

public class ExitoRunner {

    private ExitoRunner() {

    }

}
