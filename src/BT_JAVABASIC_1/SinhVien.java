package BT_JAVABASIC_1;

public class SinhVien {
	String fullName = "Hien LV";
	String name;
	int age;

	public SinhVien (String name, int age) {
		this.name = name;
        this.age = age;
	}
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	public static String Country = "Vietnam";
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("Hien",33);
		System.out.println(sv1.fullName);
		System.out.println("Person 1");
		sv1.displayInfo();
		System.out.println(Country);
	}
}
