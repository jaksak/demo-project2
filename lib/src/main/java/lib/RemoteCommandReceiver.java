package lib;

import java.util.*;
import java.util.stream.Collectors;

public class RemoteCommandReceiver {
    private final Map<String, CommandHandler<?>> handlersByCommands;

    public RemoteCommandReceiver(List<CommandHandler<?>> handlers) {
        handlersByCommands = handlers.stream().collect(Collectors.toMap(
                handler -> handler.getSupportedCommandClass().getName(),
                handler -> handler
        ));
    }

    public void execute(Command command) {
        CommandHandler<Command> handler = (CommandHandler<Command>) handlersByCommands.get(command.getClass().getName());
        handler.handle(command);
    }
}
