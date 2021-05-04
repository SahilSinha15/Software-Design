/*Title: CalcGui.java
* Abstract: Creating a mini calculator gui with implementations of labels and buttons
* Date: 11/13/20
* Author: Sahil Sinha */

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;

public class CalcGui extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() {

    }


    @Override
    public void start(Stage stage) throws Exception {
        try {

            stage.setTitle("JavaFX Mini-Calculator");
            BorderPane rootNode = new BorderPane();
            Scene myScene = new Scene(rootNode, 400, 400);


            Label title = new Label("               My Mini Calculator");
            Label result = new Label("Result:  ");
            Label op = new Label("");
            title.setFont(new Font("Arial", 22));
            result.setFont(new Font("Arial", 18));
            op.setFont(new Font("Arial", 18));
            rootNode.setAlignment(title, Pos.CENTER);
            rootNode.setTop(title);


            VBox vb1 = new VBox(15);
            VBox vb2 = new VBox(0);
            HBox hb1 = new HBox();
            HBox hb2 = new HBox();
            HBox hb3 = new HBox();
            HBox hb4 = new HBox();
            HBox hb5 = new HBox();
            MenuBar menu = new MenuBar();
            Menu file = new Menu("File");
            menu.getMenus().addAll(file);
            MenuItem about = new MenuItem("About");
            file.getItems().add(about);
            vb1.getChildren().addAll(menu, title);
            rootNode.setTop(vb2);


            Label fnum = new Label("First Number       ");
            Label snum = new Label("Second Number  ");
            TextField t1;
            TextField t2;
            t1 = new TextField();
            t2 = new TextField();

            hb1.setPadding(new Insets(20, 50, 10, 50));
            hb2.setPadding(new Insets(20, 50, 10, 50));
            hb3.setPadding(new Insets(20, 50, 2, 80));
            hb4.setPadding(new Insets(0, 50, 10, 160));
            hb5.setPadding(new Insets(0, 50, 10, 160));
            hb1.getChildren().addAll(fnum, t1);

            hb2.getChildren().addAll(snum, t2);


            Button btn1 = new Button("Add");
            Button btn2 = new Button("Subtract");
            Button btn3 = new Button("Multiply");
            Button btn4 = new Button("Divide");
            Button btn5 = new Button("Clear");
            hb3.getChildren().addAll(btn1, btn2, btn3, btn4);
            hb4.getChildren().add(btn5);
            hb5.getChildren().addAll(result, op);

            vb1.getChildren().addAll(hb1, hb2, hb3, hb4, hb5);
            rootNode.setCenter(vb1);


            stage.setScene(myScene);
            stage.show();


            btn1.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent ae) {
                    float a = Integer.parseInt(t1.getText());
                    float b = Integer.parseInt(t2.getText());
                    float c = a + b;
                    op.setText(String.valueOf(c));
                }
            });

            btn2.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent ae) {
                    float a = Integer.parseInt(t1.getText());
                    float b = Integer.parseInt(t2.getText());
                    float c = a - b;
                    op.setText(String.valueOf(c));
                }
            });

            btn3.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent ae) {
                    float a = Integer.parseInt(t1.getText());
                    float b = Integer.parseInt(t2.getText());
                    float c = a * b;
                    op.setText(String.valueOf(c));
                }
            });

            btn4.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent ae) {
                    float a = Integer.parseInt(t1.getText());
                    float b = Integer.parseInt(t2.getText());
                    float c = a / b;
                    op.setText(String.valueOf(c));
                }
            });


            btn5.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent ae) {
                    t1.clear();
                    t2.clear();
                }
            });

            about.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent ae) {
                    BorderPane rN2;
                    Scene myScene2 = new Scene(rN2 = new BorderPane(), 250, 100);
                    Stage stage2 = new Stage();
                    stage2.setTitle("About");
                    stage2.setScene(myScene2);
                    stage2.show();
                    VBox abVB = new VBox();
                    Button abBut = new Button("OK");
                    Label ab = new Label("Author Name: Sahil Sinha");
                    abVB.getChildren().addAll(ab, abBut);
                    abVB.setPadding(new Insets(20, 50, 10, 50));
                    rN2.setAlignment(ab, Pos.CENTER);
                    rN2.setCenter(abVB);

                    abBut.setOnAction(new EventHandler<ActionEvent>() {
                        public void handle(ActionEvent ae) {
                            stage2.close();
                        }
                    });


                }
            });



        }
        catch (NumberFormatException e){
            BorderPane rN2;
            Scene myScene2 = new Scene(rN2 = new BorderPane(), 250, 100);
            Stage stage2 = new Stage();
            stage2.setTitle("About");
            stage2.setScene(myScene2);
            stage2.show();
        }
    }
}


