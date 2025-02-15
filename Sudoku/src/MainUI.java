import ui.custom.screen.MainScreen;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class MainUI {

    public static void main(String[] args) {
        final var gameConfig = Stream.of(args).collect(toMap(
                k -> k.split(";")[0].trim(),
                v -> v.split(";")[1].trim()
        ));

       var mainScreen = new MainScreen(gameConfig);
       mainScreen.buildMainScreen();
    }
}
