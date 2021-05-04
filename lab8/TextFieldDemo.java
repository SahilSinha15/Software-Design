import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class TextFieldDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {

        myStage.setTitle("TextField Demo");
        FlowPane rootNode = new FlowPane(10,10);

        // Center the controls in the scene
        rootNode.setAlignment(Pos.CENTER);

        // Create a scene
        Scene myScene = new Scene(rootNode, 230, 140);

        // Set the scene on the stage.
        myStage.setScene(myScene);

        // Create a label that will display the string
        Label response = new Label("You entered: ");

        // Create a button that gets the text.
        Button btnGetText = new Button("Get String");
        Button reverse = new Button("Reverse");

        // Create a text field
        TextField tf = new TextField();

        // Set the prompt
        tf.setPromptText("Enter a String");

        // Set the preferred column count
        tf.setPrefColumnCount(15);

        // when ENTER is pressed
        tf.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                response.setText("You entered: " + tf.getText());
            }
        });


        // using lambda expression
        // tf.setOnAction(ae -> response.setText("You entered: " + tf.getText()));

        // get text when button is pressed
        btnGetText.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                response.setText("You clicked a button and entered: " + tf.getText());
            }
        });
        reverse.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                char [] str1 = tf.getText().toCharArray();
                char [] str2 = new char[str1.length];
                int c=0;
                for (int i = str1.length-1;i >= 0; i--){
                    str2[c]=str1[i];
                    c++;
                }
             response.setText("Reverse: "+String.valueOf(str2));
            }
                            });



        // Use a separator to better organize the layout.
        Separator separator = new Separator();
        separator.setPrefWidth(200);

        // Add controls to the scene graph.
        rootNode.getChildren().addAll(tf, btnGetText,reverse, separator, response);


        // Show the stage and its scene.
        myStage.show();

    }
}