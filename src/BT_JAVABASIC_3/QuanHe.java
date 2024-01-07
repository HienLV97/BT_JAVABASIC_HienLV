package BT_JAVABASIC_3;

public class QuanHe {


	public static void main(String[] args) {
		int numberA = 5;
		int numberB = 10;
		int numberC = 25;
		int numberA1 = 5;
		String text1 = "Hien LV";
		String text2 = "Hien LE VINH";
		String text3 = "Hien LV";

		boolean toanTuSoSanhVa = ((numberA == numberA1) && (numberB == numberC));
		System.out.println("A = B and B = C: " + toanTuSoSanhVa);
		boolean toanTuHoac = (numberA == numberB) || (numberA == numberA1);
		System.out.println("A = B or A = A1: " + toanTuHoac);
		boolean aLonHonB = numberA > numberB;
		System.out.println("A > B: " + aLonHonB);
		boolean aBeHonB = numberA < numberB;
		System.out.println("A < B: "+aBeHonB);
		boolean aEqualB = numberA == numberB;
		System.out.println("A = B: "+ aEqualB);
	}
}
