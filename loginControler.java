import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class loginControler{

    @FXML
    void buttonLogin(ActionEvent event) {
        Main.changeScene("main");
    }

    @FXML
    void registerButton(ActionEvent event) {

    }
}
