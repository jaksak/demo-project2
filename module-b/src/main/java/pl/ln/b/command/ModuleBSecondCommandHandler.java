package pl.ln.b.command;

import lib.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ModuleBSecondCommandHandler implements CommandHandler<ModuleBSecondCommand> {

    private final LocalCommandExecutor localCommandExecutor;

    @Override
    public void handle(ModuleBSecondCommand moduleBSecondCommand) {
        localCommandExecutor.execute(new ModuleBFirstCommand());
    }

    @Override
    public Class<ModuleBSecondCommand> getSupportedCommandClass() {
        return ModuleBSecondCommand.class;
    }
}
