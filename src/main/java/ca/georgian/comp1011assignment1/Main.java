package ca.georgian.comp1011assignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException { //Here I am trowing an exception
        //Bellow on line 13, is where I will change between scene 1 to scene 2 and vise-versa
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Scene1.fxml"));
        //Bellow on line 15, is here I am setting the size of my user interface when it's running
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        //Here I am putting the title
        stage.setTitle("Population Data");
        //Here is where the icon of the user interface goes
        Image icon = new Image(getClass().getResourceAsStream("icon.png"));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
