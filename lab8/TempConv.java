import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class TempConv extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {

        myStage.setTitle("Temperature Convertor");
        FlowPane rootNode = new FlowPane(10,10);

        // Center the controls in the scene
        rootNode.setAlignment(Pos.CENTER);

        // Create a scene
        Scene myScene = new Scene(rootNode, 230, 140);

        // Set the scene on the stage.
        myStage.setScene(myScene);

        // Create a label that will display the string
        Label response = new Label("Enter Temperature in Celsius above");

        // Create a button that gets the text.
        Button btnGetText = new Button("Convert");

        // Create a text field
        TextField tf = new TextField();

        // Set the prompt
        tf.setPromptText("Enter temperature in Celsius ");

        // Set the preferred column count
        tf.setPrefColumnCount(15);

        // when ENTER is pressed
        tf.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                int num = Integer.parseInt(tf.getText());
                float fah = ((9/5)*num)+32;
                response.setText("Temperature in Fahrenheit: " + fah);
            }
        });


        // using lambda expression
        // tf.setOnAction(ae -> response.setText("You entered: " + tf.getText()));

        // get text when button is pressed
        btnGetText.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                int num = Integer.parseInt(tf.getText());
                float fah = ((9/5)*num)+32;
                response.setText("Temperature in Fahrenheit: " + fah);
            }
        });

        // Use a separator to better organize the layout.
        Separator separator = new Separator();
        separator.setPrefWidth(200);

        // Add controls to the scene graph.
        rootNode.getChildren().addAll(tf, btnGetText, separator, response);


        // Show the stage and its scene.
        myStage.show();

    }
}