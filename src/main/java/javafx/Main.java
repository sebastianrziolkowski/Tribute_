package javafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String args[])
    {
        launch(args);
    }


    @Override
    public void start(Stage primarystage)
    {
        primarystage.setTitle("Tribute_");
        StackPane stackPane = new StackPane();
        Button button = new Button("Button");

        stackPane.getChildren().add(button);

        Scene scene = new Scene(stackPane, 400, 600);

        primarystage.setScene(scene);
        primarystage.show();
    }

}
