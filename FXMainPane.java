


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.input.MouseEvent;
/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	
	Button hello;
	Button howdy;
	Button chinese;
	Button clear; 
	Button exit;
	
Label myLabel;
	
	TextField myTextField;
	
	HBox hbox1;
	HBox hbox2;
	

	
	//student Task #4:
	//  declare an instance of DataManager
	
	DataManager a = new DataManager();
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
		
		hello = new Button("Hello");
		howdy = new Button("Howdy");
		chinese = new Button("Chinese");
		clear = new Button("Clear");
		exit = new Button("Exit");
		
		myLabel = new Label("Feedback:");
		
		myTextField = new TextField();
		
		hbox1 = new HBox();
		hbox2 = new HBox();
		
		
		
		//student Task #4:
		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		
		HBox.setMargin(hello, new Insets(10));
		HBox.setMargin(howdy,new Insets(10));
		HBox.setMargin(chinese,new Insets(10));
		HBox.setMargin(clear, new Insets(10));
		HBox.setMargin(exit,new Insets(10));
		HBox.setMargin(myLabel,new Insets(10));
		HBox.setMargin(myTextField,new Insets(10));
		
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		
		hbox1.getChildren().addAll(hello, howdy, chinese, clear, exit);
		hbox1.getChildren().addAll(myLabel, myTextField);
		
		
		
		getChildren().addAll(hbox1,hbox2);
		Platform.exit();
		System.exit(0);
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	
	
	class ButtonHandler  implements EventHandler <ActionEvent>
	{
	
		
		public void handle(ActionEvent event)
		{
			hello.setOnAction(new ButtonHandler());
			howdy.setOnAction(new ButtonHandler());
			chinese.setOnAction(new ButtonHandler());
			clear.setOnAction(new ButtonHandler());
			exit.setOnAction(new ButtonHandler());
			
			
			if (event.getTarget()== hello)
			{
				myTextField.setText(a.getHello());
			}
			if (event.getTarget() == howdy)
			{
				myTextField.setText(a.getHowdy());
			}
			if (event.getTarget() == chinese)
			{
				myTextField.setText(a.getChinese());
			}
			if (event.getTarget() == clear)
			{
				myTextField.setText("");
			}
			if(event.getTarget() == exit)
			{
				Platform.exit();
				System.exit(0);
			}
				
		}
	}
}
	
