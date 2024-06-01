package manager_jar.font;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import manager_jar.Main.Admin;

import java.io.IOException;

public class AdminLoginController {

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    @FXML
    private Stage stage;

    @FXML
    private Button btn_reg;

    @FXML
    private Button btn_login;

    @FXML
    public void RegisterEvent() throws IOException {
        stage.close();
        new Admin().initreg();
    }

    public void LoginEvent() throws IOException {
        //这里需要数据库
        //TODO
        new Admin().MainApp();
    }
}

