package easv.college.mytunesassignment.gui;

import easv.college.mytunesassignment.HelloApplication;
import easv.college.mytunesassignment.be.Music;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MyTunesController implements Initializable {

    @FXML
    private Button addNewMuicOnLibrary;

    @FXML
    private ImageView backwardBtn;

    @FXML
    private Button closeWindow;

    @FXML
    private Button deleteFromPlaylist;

    @FXML
    private Button deleteMuicOnLibrary;

    @FXML
    private Button deletePlaylistBtn;

    @FXML
    private Button editMuicOnLibrary;

    @FXML
    private Button editPlaylistBtn;

    @FXML
    private ImageView forwardBtn;

    @FXML
    private ListView<Music> musicInPlaylist;

    @FXML
    private TableView<Music> allMusicLibrary;


    @FXML
    private TableView<Music> nameOfPlaylist;

    @FXML
    private ProgressBar musicProgress;

    @FXML
    private Button newPlaylistBtn;

    @FXML
    private ImageView playBtn;

    @FXML
    private Button sendMusicDown;

    @FXML
    private Button sendMusicUp;

    @FXML
    private Button sendToPlaylist;

    @FXML
    void addNewMusicLibraryAction(ActionEvent event) throws IOException  {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/easv/college/mytunesassignment/editSong-view.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Esbjerg Music Player ♫");
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void closeWindowAction(ActionEvent event) {
        Stage stage = (Stage) closeWindow.getScene().getWindow();
        stage.close();


    }

    @FXML
    void createNewPlaylistAction(ActionEvent event)  throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/easv/college/mytunesassignment/newPlaylist-view.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Create New Playlist");
        stage.show();





    }

    @FXML
    void deleteMusicFromPLaylistAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete music from the playlist");
        alert.setHeaderText("Are you sure you want to delete this music from the playlist?");
        alert.showAndWait();
        if (alert.getResult() == ButtonType.OK) {
            System.out.println("Deleted music from the playlist");
        } else {
            System.out.println("Delete music from the playlist failed");

        }

    }

    @FXML
    void deleteMusicInLibraryAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete music from the library");
        alert.setHeaderText("Are you sure you want to delete this music from the library?");
        alert.showAndWait();
        if (alert.getResult() == ButtonType.OK) {
            System.out.println("Deleted music from the library");
        } else {
            System.out.println("Delete music from the library failed");

        }
    }

    @FXML
    void deletePlaylistAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete playlist from the playlist");
        alert.setHeaderText("Are you sure you want to delete this playlist ?");
        alert.showAndWait();
        if (alert.getResult() == ButtonType.OK) {
            System.out.println("Deleted selected playlist");
        } else {
            System.out.println("Delete selected playlist failed");

        }

    }

    @FXML
    void editMusicLibraryAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/easv/college/mytunesassignment/editSong-view.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Esbjerg Music Player ♫");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void editPlaylistAction(ActionEvent event) {

    }

    @FXML
    void sendDownAction(ActionEvent event) {

    }

    @FXML
    void sendUpAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        allMusicLibrary.getItems();
        nameOfPlaylist.getItems();
        musicInPlaylist.getItems();


    }
}
