/**
 * 
 */
package pythagoreanTheorem;

/**
 * @author MH137428
 *
 */
import javax.swing.JOptionPane;
public class pythagoreanTheorem 
{

	private static double a, b, c;
	
	public static void main(String[] args) 
	{
		String solveSide, solveAgain;
		
		do
		{
			solveSide = JOptionPane.showInputDialog(null, "Which side do you need to solve for?\nA, B, or C");
		
			if("A".equals(solveSide) || "a".equals(solveSide))
			{
				b = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the length of side B?"));
				c = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the length of side C?"));
				getSideA(b, c);
				JOptionPane.showMessageDialog(null, "The side length of " + solveSide + " is " + a);
			}
			if("B".equals(solveSide) || "b".equals(solveSide))
			{
				a = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the length of side A?"));
				c = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the length of side C?"));
				getSideB(a, c);
				JOptionPane.showMessageDialog(null, "The side length of " + solveSide + " is " + b);
			}
			if("C".equals(solveSide) || "c".equals(solveSide))
			{
				a = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the length of side A?"));
				b = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the length of side B?"));
				getSideC(a, b);
				JOptionPane.showMessageDialog(null, "The side length of " + solveSide + " is " + c);
			}
			solveAgain = JOptionPane.showInputDialog(null, "Would you like to solve another right triangle?\nYes or No?");
		} while("Yes".equals(solveAgain) || "yes".equals(solveAgain) || "Y".equals(solveAgain) || "y".equals(solveAgain));
			
	}
	public static double getSideA(double b, double c)
	{
		a = Math.sqrt(c*c - b*b);
		return a;
	}
	public static double getSideB(double a, double c)
	{
		b = Math.sqrt(c*c - a*a);
		return b;
	}
	public static double getSideC(double a, double b)
	{
		c = Math.sqrt(a*a + b*b);
		return c;
	}
}
