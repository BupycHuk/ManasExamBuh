package main.java.javafxapplication.Controller.Tizme;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafxapplication.Model.RequestDto.AddSellerRequest;
import javafxapplication.Model.Shop;
import javafxapplication.Proxy.SellerProxy;
import javafxapplication.Proxy.ShopProxy;

import java.net.URL;
import java.util.ResourceBundle;
public class AddTizmeController {

    public ComboBox tizmeComboBox;
    @FXML
    private TextField text2;
    TizmeProxy tizmeProxy = new TizmeProxy();


    @FXML
    private void handleButtonAction(ActionEvent event) {

        String tizmeName;
        Tizme tizme = (Tizme)tizmeComboBox.getValue();
        long tizmeId = (tizme!=null)? (long) tizme.getId() :0;
        tizmeName=text2.getText();
        AddTizmeRequest request = new AddTizmeRequest(tizmeId, tizmeName);

        tizmeProxy.addTizme(request);
    }
    @FXML
    private void textTazala(ActionEvent event){
        text2.setText("");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Tizme[] tizme = tizmeProxy.getTizme();
        tizmeComboBox.getItems().setAll(tizme);
    }

}
