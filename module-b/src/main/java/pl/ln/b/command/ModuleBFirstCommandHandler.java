package pl.ln.b.command;

import lib.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.ln.a.command.ParentCommand;

@Component
@RequiredArgsConstructor
public class ModuleBFirstCommandHandler implements CommandHandler<ModuleBFirstCommand> {

    private final RemoteCommandExecutor remoteCommandExecutor;

    @Override
    public void handle(ModuleBFirstCommand moduleBFirstCommand) {
        System.out.println("ModuleBFirstCommand start");
        remoteCommandExecutor.execute(new ParentCommand());
    }

    @Override
    public Class<ModuleBFirstCommand> getSupportedCommandClass() {
        return ModuleBFirstCommand.class;
    }
}
