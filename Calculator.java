package week1.assignments;

public class Calculator {

	int num1 = 111;
	int num2 = 111;
	int num3 = 111;

	public void sum() {
		int add;
		add = num1 + num2 + num3;
		System.out.println("Addition of 3 values " + add);
	}

	public void sub() {

		int subt;
		subt = num1 - num2;
		System.out.println("Subtraction of 2 values " + subt);
	}

	public double mul() {
		double num1 = 17.14;
		double num2 = 20.25; // local variable
		double num;
		num = num1 * num2;
		System.out.println("Multiplication of 2 values " + num);
		return num;
	}

	public float div() {
		float num1 = 1.564f;
		float num2 = 2.156f;
		float num;
		num = num1 / num2;
		System.out.println("Division of two values " + num);
		return num;
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Calculator calc=new Calculator();
	int num1=calc.num1;
	int num2=calc.num2;
	int num3=calc.num3;
	System.out.println("Addition Values 1 "+ num1);
	System.out.println("Addition Values 2 "+ num2);
	System.out.println("Addition Values 3 "+ num3);
	System.out.println("--------------------------");
	calc.sum();
	System.out.println("--------------------------");
	System.out.println("Subtraction Values 1 "+ num1);
	System.out.println("Subtraction Values 2 "+ num2);
	System.out.println("--------------------------");
	calc.sub();
	System.out.println("--------------------------");
	calc.mul();
	calc.div();
}
}