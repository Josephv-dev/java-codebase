import javax.swing.JOptionPane;

public class AdditionToUseDialog{
	public static void main(String[] args){
		
		String num1Str = JOptionPane.showInputDialog("Enter first number: ");	
		String num2Str = JOptionPane.showInputDialog("Enter second number: ");
		
		int number1 = Integer.parseInt(num1Str);
		int number2 = Integer.parseInt(num2Str);
		
		int sum = number1 + number2;
		
		String message = String.format("Sum is %d%n", sum);
		
		JOptionPane.showMessageDialog(null, message, "Sum Result", JOptionPane.PLAIN_MESSAGE);
		
	}
}