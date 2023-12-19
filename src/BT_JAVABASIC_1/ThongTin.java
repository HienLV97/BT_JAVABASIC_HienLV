package BT_JAVABASIC_1;

public class ThongTin {
	public static int newAge = 5;
	public static String newName = "Le Vinh Hien";

	public static void main(String[] args) {
		SinhVien sv = new SinhVien(newName, newAge);
		sv.displayInfo();
	}
}
