package pl.ln.a.command;

import lib.CommandHandler;
import org.springframework.stereotype.Component;

@Component
public class ParentCommandHandler implements CommandHandler<ParentCommand> {
    @Override
    public void handle(ParentCommand parentCommand) {
        System.out.println("ParentCommand - start");
    }

    @Override
    public Class<ParentCommand> getSupportedCommandClass() {
        return ParentCommand.class;
    }
}
