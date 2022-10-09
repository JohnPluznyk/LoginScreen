import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class interaction extends Application{
   protected String user = ("test");
   protected String pw = ("123");
   
   public static void main(String args[]){
      launch(args);
   }
   
   public void start(Stage primaryStage){
      primaryStage.setTitle("Login Screen");
      
      Label l = new Label("Please enter your e-Mail  ");
      Label l2 = new Label("Please enter in your password:   ");
      TextField userName = new TextField("e-mail");   
      TextField password = new TextField("pass");
      Button btn = new Button("Login");
      Label login = new Label("Login Status: ");
      Label status = new Label("Awaiting");
      
      GridPane p = new GridPane();
      p.add(l,0,0);
      p.add(userName,1,0);
      p.add(l2,0,1);
      p.add(password,1,1);
      p.add(btn,1,2);
      p.add(login,0,3);
      p.add(status,1,3);
      
      
      EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                  String s = userName.getText();
                  s = s.toLowerCase();
                if(s.equals(user) &&  password.getText().equals(pw)){
                     status.setText("login correct");
                     primaryStage.close();
                     new home();
                }
                else
                  status.setText("login failed pls try again");
            }
        };
      btn.setOnAction(event);
      
        p.setAlignment(Pos.CENTER);

      Scene s = new Scene(p, 800, 400);
      primaryStage.setScene(s);
      primaryStage.show(); 
   } 

}