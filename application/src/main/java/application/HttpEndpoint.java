package application;

import lib.LocalCommandExecutor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.ln.b.command.ModuleBSecondCommand;

@RestController
@RequiredArgsConstructor
public class HttpEndpoint {

    private final LocalCommandExecutor remoteCommandExecutor;

    @GetMapping
    public void runB2() {
        remoteCommandExecutor.execute(new ModuleBSecondCommand());
    }
}
