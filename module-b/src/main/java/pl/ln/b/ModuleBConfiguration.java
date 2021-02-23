package pl.ln.b;

import lib.*;
import org.springframework.context.annotation.*;
import pl.ln.b.command.*;

@Configuration
public class ModuleBConfiguration {

    @Bean
    public ModuleBFirstCommandHandler moduleBFirstCommandHandler(
            @Lazy RemoteCommandExecutor remoteCommandExecutor
    ) {
        return new ModuleBFirstCommandHandler(remoteCommandExecutor);
    }

    @Bean
    public ModuleBSecondCommandHandler moduleBSecondCommandHandler(
            @Lazy LocalCommandExecutor localCommandExecutor
    ) {
        return new ModuleBSecondCommandHandler(localCommandExecutor);
    }

    @Bean
    public ModuleBCommandHandlerRegistry moduleBCommandHandlerRegistry(
            ModuleBFirstCommandHandler moduleBFirstCommandHandler,
            ModuleBSecondCommandHandler moduleBSecondCommandHandler
    ) {
        return new ModuleBCommandHandlerRegistry(
                moduleBFirstCommandHandler,
                moduleBSecondCommandHandler
        );
    }
}
