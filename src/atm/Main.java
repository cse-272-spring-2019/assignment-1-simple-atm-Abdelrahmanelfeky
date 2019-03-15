/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        Client Account =new Client();
         primaryStage.setTitle("ATM bank");
    
        ////// scene 1 ///////////////
        Label cardnumber=new Label();
        cardnumber.setText("cardnumber");
        
        TextField cardnumberfield=new TextField();
       
        Label error=new Label();
        
        
        Button submit=new Button();
        submit.setText("submit");
        
        GridPane grid1=new GridPane();
        grid1.add(cardnumber, 0, 0);
        grid1.add(cardnumberfield,1,0);
        grid1.add(submit,1,1);
         grid1.add(error,3,5);
         
        Scene scene1=new Scene(grid1,400,400);
        primaryStage.setScene(scene1);
        primaryStage.show();
        
  
  
  
             
        
        
        //////scene2
        
        Label thebalance=new Label();
        
        Label history=new Label();
        
        Button previous=new Button();
        previous.setText("previous");
        
        Button next=new Button();
        next.setText("next");
         next.setDisable(true);
        
        
        Button deposite=new Button();
        deposite.setText("deposite");
        
        Button balance=new Button();
         balance.setText("balance");
        
        Button withdraw=new Button();
        withdraw.setText("withdraw");
        
        Button back=new Button();
        back.setText("Back)");
        
        GridPane grid2=new GridPane(); 
         grid2.add(balance,0,0);
        grid2.add(deposite, 0, 2);
         grid2.add(withdraw,0,3);
         grid2.add(thebalance,7,7);
         grid2.add(back,0,4); 
         grid2.add(next,5,5);
         grid2.add(previous,5,6);
         grid2.add(history,6,6);
         
         
                Scene scene2=new Scene(grid2,400,400);
                
                
       /////scene3
       
     TextField depositefield=new TextField();
     
     Button deposite2=new Button(); 
          deposite2.setText("deposite") ;
          
          Button back2=new Button(); 
          back2.setText("back") ;
          
         Label d3=new Label ();
         
          GridPane grid3=new GridPane();
          grid3.add(depositefield,0,0);
        grid3.add(deposite2,3,1);
        grid3.add(back2,3,2);
        grid3.add(d3,3,3);
        
        Scene scene3=new Scene(grid3,400,400);
        
        
        ///scene4
         TextField withdrawfield=new TextField();
     
     Button withdraw2=new Button(); 
          withdraw2.setText("Withdraw") ;
          
          Button back3=new Button(); 
          back3.setText("back") ;
          
          
          
          Label w3=new Label();
         
          GridPane grid4=new GridPane();
          grid4.add(withdrawfield,0,0);
        grid4.add(withdraw2,3,1);
        grid4.add(back3,3,2);
             grid4.add(w3,3,3);    
                
        Scene scene4=new Scene(grid4,400,400);
        
        
        
        
        
        
        
     ///////////////// buttons ///////////////
     submit.setOnAction(new EventHandler<ActionEvent>(){
					public void handle (ActionEvent event)
	{
            if(cardnumberfield.getText().equals("2222"))
            {
                 primaryStage.setScene(scene2);
                
            }
            else
                error.setText("Invalid cardnumber..try again");
            
            
	}});
    
    balance.setOnAction(new EventHandler<ActionEvent>(){
					public void handle (ActionEvent event)
	{
            String y="your balance"+(String.valueOf(Account.getBalance2()));
           thebalance.setText(y);
            
	}});
     
     deposite.setOnAction(new EventHandler<ActionEvent>(){
					public void handle (ActionEvent event)
	{

            primaryStage.setScene(scene3);
            
	}});
     withdraw.setOnAction(new EventHandler<ActionEvent>(){
					public void handle (ActionEvent event)
	{
            
            primaryStage.setScene(scene4);
   
            
	}});
     
     
    
     deposite2.setOnAction(new EventHandler<ActionEvent>(){
					public void handle (ActionEvent event)
	{
            
            String z=depositefield.getText();
           double v=(Double.parseDouble(z));
           Account.depositeTheValue(v);
            d3.setText("deposite succesfully");
            
	}});
     
     withdraw2.setOnAction(new EventHandler<ActionEvent>(){
					public void handle (ActionEvent event)
	{
String z=withdrawfield.getText();
       double v=(Double.parseDouble(z));
       if(v>(Account.getBalance()))
       {
       w3.setText("error canot be withdrawen");
       }
           
       else {Account.withdrawTheValue(v);
       w3.setText("withdraw succesfully");
       }
	}});
     
      back.setOnAction(new EventHandler<ActionEvent>(){
					public void handle (ActionEvent event)
	{

           primaryStage.setScene(scene1);
            
	}});
     
     
      back2.setOnAction(new EventHandler<ActionEvent>(){
					public void handle (ActionEvent event)
	{

           primaryStage.setScene(scene2);
            
	}});
     
      
      back3.setOnAction(new EventHandler<ActionEvent>(){
					public void handle (ActionEvent event)
	{

           primaryStage.setScene(scene2);
            
	}});
      
       next.setOnAction(new EventHandler<ActionEvent>(){
					public void handle (ActionEvent event)
	{
             previous.setDisable(false);
            String x = Account.Next();
            history.setText(x);
            if(Account.getIndex() == Account.getSize() -1)
                next.setDisable(true);
            
	}});
     
       previous.setOnAction(new EventHandler<ActionEvent>(){
					public void handle (ActionEvent event)
	{
             next.setDisable(false);
            String x = Account.Previous();
            history.setText(x);
            if(Account.getIndex() == 0)
                previous.setDisable(true);

            
	}});
    }
    

    
    
}
