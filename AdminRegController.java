package manager_jar.font;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import manager_jar.Main.Admin;

import java.util.Objects;

public class AdminRegController {

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    @FXML
    private Stage stage;

    @FXML
    private TextField a_reg_aid;

    @FXML
    private PasswordField a_reg_password;

    @FXML
    private PasswordField a_reg_password_again;

    @FXML
    private Button a_reg_setButton;

    @FXML
    private Button a_reg_returnButton;

    @FXML
    public void AdminRegister() {
        //不想用if-else,谁解决一下
        //TODO
        if(a_reg_password.getText().trim().isEmpty()){
            new Admin().showMessage("注册界面","注册失败,密码不能为空！", Alert.AlertType.ERROR,0);
        }
        else if (!Objects.equals(a_reg_password.getText(), a_reg_password_again.getText())) {
            new Admin().showMessage("注册界面","注册失败，两次密码前后不一致！", Alert.AlertType.ERROR,0);
        }
        else {
            //数据库提交
            //TODO

            new Admin().showMessage("注册界面","注册成功！", Alert.AlertType.INFORMATION,0);
            stage.close();
            new Admin().initlogin();
        }

    }

    @FXML
    public void AdminReturn() {
        stage.close();
        new Admin().initlogin();
    }

}

