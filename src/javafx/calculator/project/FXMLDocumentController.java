/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafx.calculator.project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Rico
 */
public class FXMLDocumentController implements Initializable {
    
    Calculator calc = new Calculator(0, 0,0);
    
    @FXML
    private void btnClear(ActionEvent event){
        
        calc.setX(0);
        calc.setY(0);
        calc.setAnswer(0);
        displayValues(calc);
        
    }
        
    @FXML
    private void btnOne(ActionEvent event){
        
        setSelected(1, calc);
        
    }
    
    @FXML
    private void btnTwo(ActionEvent event){
        
        setSelected(2, calc);
        
    }
    
    @FXML
    private void btnThree(ActionEvent event){
        
        setSelected(3, calc);
        
    }
    
    @FXML
    private void btnFour(ActionEvent event){
        
        setSelected(4, calc);
        
    }
    
    @FXML
    private void btnFive(ActionEvent event){
        
        setSelected(5, calc);
        
    }
    
    @FXML
    private void btnSix(ActionEvent event){
        
        setSelected(6, calc);
        
    }
    
    @FXML
    private void btnSeven(ActionEvent event){
        
        setSelected(7, calc);
        
    }
    
    @FXML
    private void btnEight(ActionEvent event){
        
        setSelected(8, calc);
        
    }
    
    @FXML
    private void btnNine(ActionEvent event){
        
        setSelected(9, calc);
        
    }
    
    @FXML
    private void btnZero(ActionEvent event){
        
        setSelected(0, calc);
        
    }
    
    
    @FXML
    private void btnPlus(ActionEvent event){
        
        try {
            calc.Add(Double.parseDouble(txtX.getText()), Double.parseDouble(txtY.getText()));
            displayValues(calc);
        }
        catch (NumberFormatException e) {
            numberFormatAlert();            
        }
        
        
        
    }
    
    @FXML
    private void btnLess(ActionEvent event){
        
        try {
            calc.Subtract(Double.parseDouble(txtX.getText()), Double.parseDouble(txtY.getText()));
        displayValues(calc);
        }
        catch (NumberFormatException e) {
            numberFormatAlert();            
        }
        
    }
    
    @FXML
    private void btnMultiply(ActionEvent event){
        
        try {
        calc.Multiply(Double.parseDouble(txtX.getText()), Double.parseDouble(txtY.getText()));
        displayValues(calc);
        }
        catch (NumberFormatException e) {
            numberFormatAlert();            
        }
        
    }
    
    @FXML
    private void btnDivide(ActionEvent event){
        
        try {
        calc.Divide(Double.parseDouble(txtX.getText()), Double.parseDouble(txtY.getText()));
        displayValues(calc);
        }
        catch (NumberFormatException e) {
            numberFormatAlert();            
        }
        
    }
    
    @FXML
    private void btnSqrt(ActionEvent event){
        
        try {
        
        if(radioX.isSelected()){
            
        calc.Sqrt(Double.parseDouble(txtX.getText()));
            
        }
        
        else {
            
        calc.Sqrt(Double.parseDouble(txtY.getText()));
            
        }
        
        txtAnswer.setText(Double.toString(calc.getAnswer()));
        requestFocus();
        }
        
        catch (NumberFormatException e) {
            numberFormatAlert();            
        }
        
    }
    
    @FXML
    private void btnOneX(ActionEvent event){
        
        try {
        if(radioX.isSelected()){
            
        calc.OneX(Double.parseDouble(txtX.getText()));
            
        }
        
        else {
            
        calc.OneX(Double.parseDouble(txtY.getText()));
            
        }
        
        txtAnswer.setText(Double.toString(calc.getAnswer()));
        requestFocus();
        }
        
        catch (NumberFormatException e) {
            numberFormatAlert();            
        }
        
    }

    @FXML
    private RadioButton radioX;
    @FXML
    private RadioButton radioY;
    
    @FXML
    private TextField txtX;
    
    @FXML
    private TextField txtY;
    
    @FXML
    private TextField txtAnswer;
    
    @FXML    
    private Button btnOne;
    
    @FXML    
    private Button btnTwo;
    
    @FXML    
    private Button btnThree;
    
    @FXML    
    private Button btnFour;
    
    @FXML    
    private Button btnFive;
    
    @FXML    
    private Button btnSix;
    
    @FXML    
    private Button btnSeven;
    
    @FXML    
    private Button btnEight;
    
    @FXML    
    private Button btnNine;
    
    @FXML    
    private Button btnZero;
    
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        displayValues(calc);        

    }
    
    public void KeyPress(){
        btnZero.setOnKeyPressed(event -> handleKeyPress(event, btnZero, KeyCode.DIGIT0));
        btnOne.setOnKeyPressed(event -> handleKeyPress(event, btnOne, KeyCode.DIGIT1));
        btnTwo.setOnKeyPressed(event -> handleKeyPress(event, btnTwo, KeyCode.DIGIT2));
        btnThree.setOnKeyPressed(event -> handleKeyPress(event, btnThree, KeyCode.DIGIT3));
        btnFour.setOnKeyPressed(event -> handleKeyPress(event, btnFour, KeyCode.DIGIT4));
        btnFive.setOnKeyPressed(event -> handleKeyPress(event, btnFive, KeyCode.DIGIT5));
        btnSix.setOnKeyPressed(event -> handleKeyPress(event, btnSix, KeyCode.DIGIT6));
        btnSeven.setOnKeyPressed(event -> handleKeyPress(event, btnSeven, KeyCode.DIGIT7));
        btnEight.setOnKeyPressed(event -> handleKeyPress(event, btnEight, KeyCode.DIGIT8));
        btnNine.setOnKeyPressed(event -> handleKeyPress(event, btnNine, KeyCode.DIGIT9));
        
    }
    
    private void handleKeyPress(KeyEvent event, Button button, KeyCode keyCode) {
                
        switch(event.getCode()){
            
            case NUMPAD0:
                btnZero.fire();
                break;
            case DIGIT0:
                btnZero.fire();
                break;

            case NUMPAD1:
                btnOne.fire();
                break;
            case DIGIT1:
                btnOne.fire();
                break;

            case NUMPAD2:
                btnTwo.fire();
                break;
            case DIGIT2:
                btnTwo.fire();
                break;

            case NUMPAD3:
                btnThree.fire();
                break;
            case DIGIT3:
                btnThree.fire();
                break;

            case NUMPAD4:
                btnFour.fire();
                break;
            case DIGIT4:
                btnFour.fire();
                break;

            case NUMPAD5:
                btnFive.fire();
                break;
            case DIGIT5:
                btnFive.fire();
                break;

            case NUMPAD6:
                btnSix.fire();
                break;
            case DIGIT6:
                btnSix.fire();
                break;

            case NUMPAD7:
                btnSeven.fire();
                break;
            case DIGIT7:
                btnSeven.fire();
                break;
                
                case NUMPAD8:
                btnEight.fire();
                break;
            case DIGIT8:
                btnEight.fire();
                break;

            case NUMPAD9:
                btnNine.fire();
                break;
            case DIGIT9:
                btnNine.fire();
                break;
            
        }
        
    }

    public void displayValues(Calculator c){
        
        String x = Double.toString(c.getX());
        String y = Double.toString(c.getY());
        String answer = Double.toString(c.getAnswer());
        
        txtX.setText(x);
        txtY.setText(y);
        txtAnswer.setText(answer);
        
        btnZero.requestFocus();
        
    }
    
    public void requestFocus(){
        btnZero.requestFocus();
    }
    
    public void setSelected(double number, Calculator c){
                
        int i = (int)number;
        
        String n = Integer.toString(i);
        
        if(radioX.isSelected()){
                        
            if(Double.parseDouble(txtX.getText()) == 0.0){
                
                txtX.setText(n);
                
            }
            
            else {
            
            txtX.appendText(n);
            
            }
            
            
            
        }
        
        else {
            
            if(Double.parseDouble(txtY.getText()) == 0.0){
                
                txtY.setText(n);
                
            }
            
            else {
            
            txtY.appendText(n);
            
            }
            
        }
        
        //displayValues(c);
        
    }
    
    public void numberFormatAlert(){
         Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Number not valid");
            alert.setContentText("Please try again.");

            // Show the dialog
            alert.showAndWait();        
            
    }
    
}
