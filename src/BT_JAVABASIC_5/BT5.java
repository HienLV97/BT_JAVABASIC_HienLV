package BT_JAVABASIC_5;

import java.util.*;

public class BT5 {
	public LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();

	public void addEmployeeInfo(String key, String value) {
		hashMap.put(key, value);
	}

	public List<Integer> handleBaiTap4() {
		List<Integer> arrayList = new ArrayList<>();
		System.out.println("Các phần tử số chẵn");
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				arrayList.add(i);
				System.out.print(i + " ");
			}
		}
		System.out.println(" ");
		return arrayList;
	}

	public static void main(String[] args) {
		//- Chỉnh sửa bài tập Java Basic 4 với ArrayList
		BT5 bt5 = new BT5();
		System.out.println(bt5.handleBaiTap4());

		//- Trong hàm main gọi lại hàm trên để in ra thông tin nhân viên đó với vòng lặp for CƠ BẢN
		bt5.addEmployeeInfo("Addres", "Da Nang");
		bt5.addEmployeeInfo("Name", "HienLV");
		bt5.addEmployeeInfo("Role", "Tester");

		System.out.println("Thông tin của nhân viên gồm");

		for (int i = 0; i < bt5.hashMap.size(); i++) {
			List<String> arrayListValue = new ArrayList<>(bt5.hashMap.values());
			List<String> arrayListKey = new ArrayList<>(bt5.hashMap.keySet());
			System.out.println(arrayListKey.get(i) + " : " + arrayListValue.get(i));
		}
	}
}

