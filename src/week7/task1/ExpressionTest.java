package week7.task1;

public class ExpressionTest {
	public static void main(String [] args) {
		try {
			Square test1= new Square(new Numeral(10));
			Subtraction test2= new Subtraction(test1, new Numeral(1));
			Addition test3= new Addition(test2, new Multiplication(new Numeral(2), new Numeral(3)));
			Square test= new Square(test3);
			System.out.println(test.toString()+" ="+test.evaluate());
		}
		catch (ArithmeticException x) {
			System.out.println("Loi chia cho 0");
		}
		try {
			Division div1=new Division(new Numeral(5), new Numeral(0));
			System.out.println(div1.toString()+" ="+div1.evaluate());
		}
		catch(ArithmeticException x) {
			System.out.println("Loi chia cho 0");
			System.out.println(x.toString());
		
		}
	}
}
