package lib;

import java.util.*;
import java.util.stream.Collectors;

public class RemoteCommandExecutor {

    private final Map<String, CommandHandler<?>> handlersByCommands;

    public RemoteCommandExecutor(List<CommandHandlerRegistry> handlerRegistries) {
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
