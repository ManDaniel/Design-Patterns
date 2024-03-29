package MVC.DesignPattern;
import java.awt.event.ActionListener;

import javax.swing.*;
//The interface part that is probably the most complicated 


public class CalculatorView extends JFrame {

	private JTextField firstNumber=new JTextField(10);
	private JLabel additionLabel=new JLabel("+");
	private JTextField secondNumber=new JTextField(10);
	private JButton calculateButton=new JButton("Calculate");
	private JTextField calcSolution=new JTextField(10);
	
	CalculatorView(){
		
		JPanel calcPanel=new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
	}
	
	public int getFirstNumber(){
		return Integer.parseInt(firstNumber.getText());
		//getText returns the value in the JTextField
		
	}
	
	public int getSecondNumber(){
		
		return Integer.parseInt(secondNumber.getText());
		//getText returns the value in the JTextField
		
	}
	
	public int getCalcSolution(){
		return Integer.parseInt(calcSolution.getText());
		//getText returns the value in the JTextField
		
	}
	
	public void setCalcSolution(int solution){
		calcSolution.setText(Integer.toString(solution));
	}
	
	void addCalculationListener(ActionListener listenForCalcButton){
		calculateButton.addActionListener(listenForCalcButton);
	}
 
	void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this,errorMessage);
	}
	
	
	
}
