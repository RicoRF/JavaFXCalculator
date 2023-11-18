/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javafx.calculator.project;

/**
 *
 * @author Rico
 */
public interface ICalculator {
    
    public abstract void Add(double x, double y);
    public abstract void Subtract(double x, double y);
    public abstract void Multiply(double x, double y);
    public abstract void Divide(double x, double y);
    public void Clear();
    
}
