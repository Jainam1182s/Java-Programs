import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Practical_39 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label label = new Label("What Is Your Favourite Seasons?");
        CheckBox option1 = new CheckBox("Winter");
        CheckBox option2 = new CheckBox("Summer");
        CheckBox option3 = new CheckBox("Monsoon");

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(label,option1, option2, option3);

        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
