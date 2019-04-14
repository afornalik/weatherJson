package pl.academy.sda.backend.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ViewWeather extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox root = new HBox();
        Image image = new WeatherGirlImage("weather-girl.png");
        ImageView imageView = new ImageView();
        imageView.setImage(image);

        root.getChildren().add(imageView);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}
    class WeatherGirlImage extends Image {
        WeatherGirlImage(String file) {
            super(inputStreamFromFile(file));
        }

        private static InputStream inputStreamFromFile(String fileName) {
            File initialFile = new File("src/main/resources/".concat(fileName));
            try {
                return new FileInputStream(initialFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        }

}
