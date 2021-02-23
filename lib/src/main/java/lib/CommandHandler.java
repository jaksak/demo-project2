package lib;

public interface CommandHandler<COMMAND> {

    void handle(COMMAND command);

    Class<COMMAND> getSupportedCommandClass();
}
