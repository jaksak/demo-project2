package pl.ln.b;

import lib.*;
import lombok.RequiredArgsConstructor;
import pl.ln.b.command.*;

import java.util.List;

@RequiredArgsConstructor
public class ModuleBCommandHandlerRegistry implements CommandHandlerRegistry {

    private final ModuleBFirstCommandHandler moduleBFirstCommandHandler;
    private final ModuleBSecondCommandHandler moduleBSecondCommandHandler;

    @Override
    public List<CommandHandler<?>> getAll() {
        return List.of(
                moduleBFirstCommandHandler,
                moduleBSecondCommandHandler
        );
    }
}
