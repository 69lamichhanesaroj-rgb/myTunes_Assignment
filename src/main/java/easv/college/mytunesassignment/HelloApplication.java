package easv.college.mytunesassignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("myTunes-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 761,573);
        stage.setTitle("Esbjerg Music Player ♫");
        stage.setScene(scene);
        stage.show();
    }
}
