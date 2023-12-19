package BT_JAVABASIC_2;

public class Calculator {
	public void tinhTong(int a, int b){
		int sum = a + b;
		System.out.println("Tổng của a và b là: "+sum);
	}
	public void tinhTich(float a, float b){
		float tich = a * b;
		System.out.println("Tích của a và b là: "+tich);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.tinhTong(1,2);
		calculator.tinhTich(3.3f,4.5f);
	}
}
