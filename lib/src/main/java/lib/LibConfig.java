package lib;

import org.springframework.context.annotation.*;

import java.util.List;

@Configuration
public class LibConfig {

    @Bean
    public LocalCommandExecutor localCommandExecutor(List<CommandHandlerRegistry> registryList) {
        return new LocalCommandExecutor(registryList);
    }

    @Bean
    public RemoteCommandExecutor remoteCommandExecutor(List<CommandHandlerRegistry> registryList) {
        return new RemoteCommandExecutor(registryList);
    }
}
