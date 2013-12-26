package javafxapplication.Controller.User;

import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.User;
import javafxapplication.Proxy.UserProxy;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
/**
 *
 * @author Akim
 */
public class ListUserController implements Initializable {
    public TableColumn UserName;
    public TableColumn Email;
    public TableView tableView1;

    UserProxy userProxy = new UserProxy();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
          UserName.setCellValueFactory(new PropertyValueFactory<User, String>("user"));
          Email.setCellValueFactory(new PropertyValueFactory<User, String>("email"));

    }
    public void TextComplete(ActionEvent actionEvent) {
        List<User> shop = Arrays.asList(userProxy.getUsers());

        tableView1.getItems().setAll(shop);
    }
}
