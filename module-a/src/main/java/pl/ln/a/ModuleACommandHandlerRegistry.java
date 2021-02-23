package pl.ln.a;

import lib.*;
import lombok.RequiredArgsConstructor;
import pl.ln.a.command.ParentCommandHandler;

import java.util.List;

@RequiredArgsConstructor
public class ModuleACommandHandlerRegistry implements CommandHandlerRegistry {

    private final ParentCommandHandler parentCommandHandler;

    @Override
    public List<CommandHandler<?>> getAll() {
        return List.of(
                parentCommandHandler
        );
    }
}
