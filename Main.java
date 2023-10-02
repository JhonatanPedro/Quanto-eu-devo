import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main  extends Application {

    private static Stage stage;
    private static Scene loginScene;
    private static Scene mainScene;

    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;

        Parent fxmlLogin = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene/login.fxml")));
        loginScene = new Scene(fxmlLogin);

        Parent fxmlMain = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene/main.fxml")));
        mainScene = new Scene(fxmlMain);

        primaryStage.setTitle("Quanto eu devo");
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    public static void changeScene(String src){
        switch (src){
            case "login":
                stage.setScene(loginScene);
                break;

            case "main":
                stage.setScene(mainScene);
                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}