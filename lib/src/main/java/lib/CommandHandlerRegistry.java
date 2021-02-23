package lib;

import java.util.List;

public interface CommandHandlerRegistry {
    List<CommandHandler<?>> getAll();
}
