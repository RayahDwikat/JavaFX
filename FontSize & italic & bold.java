
package italic;
import java.lang.Integer;
import javafx.event.ActionEvent;
 import javafx.event.EventHandler;
 import javafx.geometry.Insets;
 import javafx.scene.control.CheckBox;
 import javafx.scene.layout.BorderPane;
 import javafx.scene.layout.VBox;
 import javafx.scene.text.Font;
 import javafx.scene.text.FontPosture;
 import javafx.scene.text.FontWeight;
import javafx.application.Application;
 import javafx.stage.Stage;
 import javafx.geometry.Pos;
 import javafx.scene.Scene;
  import javafx.scene.control.Button;
 import javafx.scene.image.ImageView;
 import javafx.scene.layout.BorderPane;
 import javafx.scene.layout.HBox;
 import javafx.scene.layout.Pane;

import javafx.application.Application;
 import javafx.stage.Stage;
 import javafx.geometry.Pos;
  import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.image.ImageView;
 import javafx.scene.layout.BorderPane;
 import javafx.scene.layout.HBox;
 import javafx.scene.layout.Pane;
 import javafx.scene.text.Text;
 import javafx.scene.control.Label;
 import javafx.scene.control.TextField;
 public class ButtonDemo extends Application {
 protected Text text = new Text(50, 50, "JavaFX Programming");

 protected BorderPane getPane() {
 HBox paneForButtons = new HBox(20);
 Button resize = new Button("resize");
 Button btRight = new Button("Right");
 TextField tf = new TextField();
 tf.setText(""+20);
 tf.setAlignment(Pos.BOTTOM_RIGHT);
 paneForButtons.getChildren().addAll(resize,tf);
 paneForButtons.setAlignment(Pos.CENTER);
 paneForButtons.setStyle("-fx-border-color: green");
 BorderPane pane = new BorderPane();
 pane.setBottom(paneForButtons);

 Pane paneForText = new Pane();
 paneForText.getChildren().add(text);
 pane.setCenter(paneForText);


 

 
 
 
 
 
 //////////////////////////////////////
 
/** BorderPane paneForTextField = new BorderPane();
 paneForTextField.setPadding(new Insets(5, 5, 5, 5));
 paneForTextField.setStyle("-fx-border-color: green");
 paneForTextField.setLeft(new Label("Enter font size "));**/

 //TextField tf = new TextField();
 //tf.setAlignment(Pos.BOTTOM_RIGHT);
 //paneForButtons.setCenter(tf);
 //pane.setTop(paneForTextField);
//size=Integer.getNumUpdates(tf.getText());

//Font font = Font.font("Times New Roman",
// FontWeight.NORMAL, FontPosture.REGULAR, size);

// tf.setOnAction(e->text.setFont(font));
 
/**Font fontBoldItalic = Font.font("Times New Roman",
 FontWeight.BOLD, FontPosture.ITALIC, Integer.parseInt(tf.getText()));
 Font fontBold = Font.font("Times New Roman",
 FontWeight.BOLD, FontPosture.REGULAR, Integer.parseInt(tf.getText()));
 Font fontItalic = Font.font("Times New Roman",
 FontWeight.NORMAL, FontPosture.ITALIC, Integer.parseInt(tf.getText()));
 Font fontNormal = Font.font("Times New Roman",
 FontWeight.NORMAL, FontPosture.REGULAR, Integer.parseInt(tf.getText()));*/
Font fontNormal1 = Font.font("Times New Roman",
 FontWeight.NORMAL, FontPosture.REGULAR, Integer.parseInt(tf.getText()));
 text.setFont(fontNormal1);

 
 VBox paneForCheckBoxes = new VBox(20);
 paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
 paneForCheckBoxes.setStyle("-fx-border-color: green");
 CheckBox chkBold = new CheckBox("Bold");
 CheckBox chkItalic = new CheckBox("Italic");
 paneForCheckBoxes.getChildren().addAll(chkBold, chkItalic);
 pane.setRight(paneForCheckBoxes);

 EventHandler<ActionEvent> handler = e -> {
     
     Font fontBoldItalic = Font.font("Times New Roman",
 FontWeight.BOLD, FontPosture.ITALIC, Integer.parseInt(tf.getText()));
 Font fontBold = Font.font("Times New Roman",
 FontWeight.BOLD, FontPosture.REGULAR, Integer.parseInt(tf.getText()));
 Font fontItalic = Font.font("Times New Roman",
 FontWeight.NORMAL, FontPosture.ITALIC, Integer.parseInt(tf.getText()));
 Font fontNormal = Font.font("Times New Roman",
 FontWeight.NORMAL, FontPosture.REGULAR, Integer.parseInt(tf.getText()));
 if (chkBold.isSelected() && chkItalic.isSelected()) {
 text.setFont(fontBoldItalic); // Both check boxes checked
 }
 else if (chkBold.isSelected()) {
 text.setFont(fontBold); // The Bold check box checked
 }
 else if (chkItalic.isSelected()) {
 text.setFont(fontItalic); // The Italic check box checked
 }
 else {
 text.setFont(fontNormal); // Both check boxes unchecked
 }
};

 chkBold.setOnAction(handler);
 chkItalic.setOnAction(handler);
 tf.setOnAction(handler);
 resize.setOnAction(handler);
 return pane;
 }

 @Override // Override the start method in the Application class
 public void start(Stage primaryStage) {
 // Create a scene and place it in the stage
 Scene scene = new Scene(getPane(), 450, 200);
 primaryStage.setTitle("ButtonDemo"); // Set the stage title
 primaryStage.setScene(scene); // Place the scene in the stage
 primaryStage.show(); // Display the stage
 }
 
 
/*public class CheckBoxDemo extends ButtonDemo {
  protected BorderPane getPane() {
 BorderPane pane = super.getPane();
 
 Font fontBoldItalic = Font.font("Times New Roman",
 FontWeight.BOLD, FontPosture.ITALIC, 20);
 Font fontBold = Font.font("Times New Roman",
 FontWeight.BOLD, FontPosture.REGULAR, 20);
 Font fontItalic = Font.font("Times New Roman",
 FontWeight.NORMAL, FontPosture.ITALIC, 20);
 Font fontNormal = Font.font("Times New Roman",
 FontWeight.NORMAL, FontPosture.REGULAR, 20);

 text.setFont(fontNormal);

 VBox paneForCheckBoxes = new VBox(20);
 paneForCheckBoxes.setPadding(new Insets(5, 5, 5, 5));
 paneForCheckBoxes.setStyle("-fx-border-color: green");
 CheckBox chkBold = new CheckBox("Bold");
 CheckBox chkItalic = new CheckBox("Italic");
 paneForCheckBoxes.getChildren().addAll(chkBold, chkItalic);
 pane.setRight(paneForCheckBoxes);

 EventHandler<ActionEvent> handler = e -> {
 if (chkBold.isSelected() && chkItalic.isSelected()) {
 text.setFont(fontBoldItalic); // Both check boxes checked
 }
 else if (chkBold.isSelected()) {
 text.setFont(fontBold); // The Bold check box checked
 }
 else if (chkItalic.isSelected()) {
 text.setFont(fontItalic); // The Italic check box checked
 }
 else {
 text.setFont(fontNormal); // Both check boxes unchecked
 }
 };

 chkBold.setOnAction(handler);
 chkItalic.setOnAction(handler);

 return pane; // Return a new pane
 }
 }
  }*/
 }