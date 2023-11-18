/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafx.calculator.project;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author Rico
 */
public class Calculator implements ICalculator {
    
    private double answer;
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public operator_enum getOp() {
        return op;
    }

    public void setOp(operator_enum op) {
        this.op = op;
    }
    private operator_enum op = operator_enum.None;
    public enum operator_enum {        
        Add,
        Subtract,
        Multiply,
        Divide,
        None
    }

    public void setAnswer(double answer){
        this.answer = answer;
    }
    
    public double getAnswer() {
        return answer;
    }
    
      public Calculator(double answer, double x, double y) {
        this.answer = answer;
        this.x = x;
        this.y = y;
        op = operator_enum.None;
    }
    
    @Override
    public void Add(double x, double y){
        this.x = x;
        this.y = y;
        op = operator_enum.Add;
        this.answer = x + y;
    }
    
    @Override
    public void Subtract(double x, double y){
        this.x = x;
        this.y = y;
        op = operator_enum.Subtract;
        this.answer = x - y;
    }
    
    @Override
    public void Multiply(double x, double y){
        this.x = x;
        this.y = y;
        op = operator_enum.Multiply;
        this.answer = x * y;
    }
    
    @Override
    public void Divide(double x, double y){
        if(y != 0){
        this.x = x;
        this.y = y;
        op = operator_enum.Divide;
        this.answer = x / y;
        }
        else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Divide by Zero");
            alert.setContentText("You cannot divide by zero!");

            // Show the dialog
            alert.showAndWait();
        }
    }
    
    @Override
    public void Clear(){
        answer = 0;
        x = 0;
        y = 0;
        op = operator_enum.None;        
    }
    
    public void appendX(double x) {
        this.x = this.x + x;
    }
    
    public void appendY(double x) {
        this.y = this.y + y;
    }
    
    public void OneX(double n){
        this.answer = 1 / n;
    }
    
    public void Sqrt(double n){
        this.answer = Math.sqrt(n);
    }
    
}
