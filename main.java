package academy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));
        primaryStage.setTitle("Student Information");
        primaryStage.setScene(new Scene(root, 320, 275));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        launch(args);
    }
}
