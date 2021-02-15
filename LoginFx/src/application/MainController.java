package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField UsernameStato;

    @FXML
    private PasswordField PasswordStato;

    @FXML
    private Label StatoEtichetta;

    @FXML
    void Login(ActionEvent event) throws IOException {
    	if(UsernameStato.getText().equals("luca") && PasswordStato.getText().equals("capotombolo")) {
    		Stage primaryStage = new Stage();
    		FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
    		Parent root = loader.load();
    		Scene scene = new Scene(root);
    		primaryStage.setScene(scene);
    		primaryStage.show();
    	}
    }

    @FXML
    void initialize() {
        assert UsernameStato != null : "fx:id=\"UsernameStato\" was not injected: check your FXML file 'Login.fxml'.";
        assert PasswordStato != null : "fx:id=\"PasswordStato\" was not injected: check your FXML file 'Login.fxml'.";
        assert StatoEtichetta != null : "fx:id=\"StatoEtichetta\" was not injected: check your FXML file 'Login.fxml'.";

    }
}
