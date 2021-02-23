package application;

import lib.LibConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import pl.ln.a.ModuleAConfiguration;
import pl.ln.b.ModuleBConfiguration;

@Import({
        LibConfig.class,
        ModuleAConfiguration.class,
        ModuleBConfiguration.class
})
@SpringBootApplication
public class DemoProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoProjectApplication.class, args);
    }
}
