package javafx;
import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

import javafx.stage.Stage;

import javafx.util.Duration;
import media.MediaHandling;




public class Main extends Application implements javafx.event.EventHandler{

    private static MediaHandling mediaHandling;
    Button button;
    Button buttonChecker;
    Label label;

    public static void main(String args[]) {
        mediaHandling = new MediaHandling("tamale", "tamale");

       launch(args);


    }


    @Override
    public void start(Stage primarystage)
    {


        primarystage.setTitle("Tribute_");
        StackPane stackPane = new StackPane();
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10,20,10,20));


        button = new Button("Play!");
        buttonChecker = new Button("Checker_");
        label = new Label("0 second");



        button.setOnAction(this);
        buttonChecker.setOnAction(this);

        borderPane.setTop(button);
        borderPane.setLeft(label);
        borderPane.setCenter(buttonChecker);



        Scene scene = new Scene(borderPane, 700, 500);

        //primarystage.setResizable(false);
        //primarystage.setFullScreen(true);


        primarystage.setOpacity(0.9);



        primarystage.setScene(scene);
        primarystage.show();

    }



    public void handle(Event event) {
        if(event.getSource()==button)
        {
            if(button.getText()=="Play!") {
                mediaHandling.PlayFile();
                button.setText("Stop!");
            }
            else
            {
                mediaHandling.StopFile();
                button.setText("Play!");
            }
        }
        if(event.getSource()==buttonChecker)
        {
            label.setText(String.valueOf(mediaHandling.GetTime()/10));
        }
    }
}
