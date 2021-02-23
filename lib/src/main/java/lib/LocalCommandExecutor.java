package lib;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

// handlers from the same machine, should use it
@Component
public class LocalCommandExecutor {

    private final Map<String, CommandHandler<?>> handlersByCommands;

    public LocalCommandExecutor(List<CommandHandlerRegistry> handlerRegistries) {
        handlersByCommands = handlerRegistries.stream()
                .flatMap(registry -> registry.getAll().stream())
                .collect(Collectors.toMap(
                        handler -> handler.getSupportedCommandClass().getName(),
                        handler -> handler
                ));
    }

    public void execute(Command command) {
        CommandHandler<Command> handler = (CommandHandler<Command>) handlersByCommands.get(command.getClass().getName());
        handler.handle(command);
    }
}
