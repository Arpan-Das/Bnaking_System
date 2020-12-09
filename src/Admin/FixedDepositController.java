package Admin;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.fxml.Initializable;

public class FixedDepositController implements Initializable{
	@FXML
    private TableView<fixeddeposit> table_fixes;

    @FXML
    private TableColumn<fixeddeposit, Integer> col_anumber;

    @FXML
    private TableColumn<fixeddeposit, String> col_username;

    @FXML
    private TableColumn<fixeddeposit, Double> col_amount;

    @FXML
    private TableColumn<fixeddeposit, String> col_adate;

    @FXML
    private TableColumn<fixeddeposit, Double> col_rate;

    @FXML
    private TableColumn<fixeddeposit, String> col_mdate;

    @FXML
    private TableColumn<fixeddeposit, String> col_profit;

    @FXML
    private Label adminlbl;

    public void setName(String name) {
		adminlbl.setText(name);
	}
    @FXML
    void dashboard(ActionEvent event) {
    	try {
    		
    		((Node)event.getSource()).getScene().getWindow().hide();
    		Stage primaryStage = new Stage();
    		FXMLLoader loader = new FXMLLoader();
    		Pane root = loader.load(getClass().getResource("/Admin/AdminPanel.fxml").openStream());
    		
    		AdminPanelController admincomplaints = (AdminPanelController)loader.getController();
    		admincomplaints.SetAdminName(adminlbl.getText());
    		
    		Scene scene = new Scene(root);
    		primaryStage.setScene(scene);
    		primaryStage.initStyle(StageStyle.TRANSPARENT);
    		primaryStage.show();
    		
    	} catch (Exception e) {
    		
    	}

    }

    @FXML
    void exxit(ActionEvent event) {

    	System.exit(0);
    }

    @FXML
    void logout(ActionEvent event) {
    	try {
    		
    		((Node)event.getSource()).getScene().getWindow().hide();
    		Stage primaryStage = new Stage();
    		FXMLLoader loader = new FXMLLoader();
    		Pane root = loader.load(getClass().getResource("/application/BankingSystem.fxml").openStream());
    		Scene scene = new Scene(root);
    		primaryStage.setScene(scene);
    		primaryStage.initStyle(StageStyle.TRANSPARENT);
    		primaryStage.show();
    		
    	} catch (Exception e) {
    		
    	}

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}




    