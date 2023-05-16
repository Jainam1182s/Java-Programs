import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Practical_38 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a button and a label
        Button button = new Button("Click me!");
        Label label = new Label("Welcome to JavaFx");

        button.setOnAction(event -> {
            boolean isVisible = label.isVisible();
            label.setVisible(!isVisible);
        });

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(label,button);

        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
