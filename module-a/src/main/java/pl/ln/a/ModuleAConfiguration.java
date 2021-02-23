package pl.ln.a;

import org.springframework.context.annotation.*;
import pl.ln.a.command.ParentCommandHandler;

@Configuration
public class ModuleAConfiguration {

    @Bean
    public ParentCommandHandler parentCommandHandler() {
        return new ParentCommandHandler();
    }

    @Bean
    public ModuleACommandHandlerRegistry moduleACommandHandlerRegistry(
            ParentCommandHandler parentCommandHandler
    ) {
        return new ModuleACommandHandlerRegistry(parentCommandHandler);
    }
}
