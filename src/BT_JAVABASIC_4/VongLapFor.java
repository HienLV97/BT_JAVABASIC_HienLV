package BT_JAVABASIC_4;

public class VongLapFor {
	public static void main(String[] args) {
		int a[] = new int[26];
		int x = 0;
		System.out.println("Các phần tử số ch");
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				a[x] = i;
				x++;
				System.out.print(i+" ");
			}
		}
		System.out.println("\nCác phần tử trong mảng");
		for (int j : a) {
			System.out.print(j+" ");
		}
	}
}
