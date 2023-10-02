import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class mainControler {

    @FXML
    private ListView<String> listOfItems;

    @FXML
    private TextField nameItem;

    @FXML
    private TextField qtdItem;

    @FXML
    private TextField valueItem;
    private final List<listItems> list = new ArrayList<>();

    public void addShow(listItems item){
        list.add(item);
    }

    @FXML
    void returnButton(ActionEvent event) {
        Main.changeScene("login");
    }
    @FXML
    void addButton(ActionEvent event) {
        String name = nameItem.getText();
        String value = valueItem.getText();
        String quantity = qtdItem.getText();

        if (!name.isEmpty() && !value.isEmpty() && !quantity.isEmpty()) {
            listItems _list = new listItems(name,
                    Double.parseDouble(value),
                    Integer.parseInt(quantity));

            addShow(_list);
            nameItem.clear();
            valueItem.clear();
            qtdItem.clear();
            listOfItems.getItems().add(_list.toString());
        }
    }

    @FXML
    void paidButton(ActionEvent event) {
        int selectedId = listOfItems.getSelectionModel().getSelectedIndex();
        if (selectedId >= 0){
            listOfItems.getItems().remove(selectedId);
            list.remove(selectedId);
        }
    }
}