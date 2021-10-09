package week2assignmwent;

public class MyCalculator {

	public static void main(String[] args) {
Calculator obj= new Calculator();
System.out.println("MY CLACULATOR");
obj.add(5, 6, 8);
System.out.println("The Addition of 5, 6, 8 is:" + +obj.add(5, 6, 8));
obj.sub(10,15);
System.out.println("The Subtraction  of 10,15 is:" + +obj.sub(10,15));
obj.mul(10,15);
System.out.println("The Multiplicatioin  of 10,15 is:" + +obj.mul(10,15));
obj.sub(10,15);
System.out.println("The DIVIVSION  of 10,15 is:" + +obj.div(10,15));

	}

}
