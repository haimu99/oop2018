package week7.task1;

public class Multiplication extends BinaryExpression{
	private Expression left;
	private Expression right;
	public Multiplication (Expression left,Expression right) {
		this.left=left;
		this.right=right;
	}
	public Expression left() {
		return left;
		
	}
	public Expression right() {
		return right;
	}
	public String toString() {
		return left.toString()+"*"+right.toString();
	}
	public int evaluate() {
		return left.evaluate()*right.evaluate();
	}
}
