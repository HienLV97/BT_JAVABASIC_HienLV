package BT_JAVABASIC_3;

public class Logic {
	int number = 100;
	public void checkNumber(int n){
		if (n == number){
			System.out.println("2 giá trị bằng nhau");
		}
		if (n < 100){
			System.out.println("n bé hơn number");
		}
		if (n > 100){
			System.out.println("n lớn hơn number");
		}
	}

	public static void main(String[] args) {
		Logic logic = new Logic();
		logic.checkNumber(10);
	}
}
