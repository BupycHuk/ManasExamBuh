package javafxapplication.Controller.User;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.User;
import javafxapplication.Proxy.UserProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author Akim
 */
public class ListUserController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TableColumn userName;
        TableColumn name;
        TableColumn Login;
        TableView tableView1;

        UserProxy sellerProxy = new UserProxy();
    public void textTolukta(ActionEvent actionEvent) {
        List<ListUserController> sellers = Arrays.asList(UserProxy.getUsers());


        tableView1.getItems().setAll(users);
    }


}


}
