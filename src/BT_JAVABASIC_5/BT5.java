package BT_JAVABASIC_5;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class BT5 {
	public Map<String, Integer> infoEmployees(){
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("HIEN LV",27);
		hashMap.put("HIEN LE VINH",26);
		hashMap.put("LE VINH HIEN",25);
		return hashMap;
	}
	public void handleBaiTap4(){
		List<Integer> arrayList = new ArrayList<>();
		System.out.println("Các phần tử số chẵn");
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				arrayList.add(i);
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
		for (int j : arrayList) {
			System.out.print(j+" ");
		}
	}

	public static void main(String[] args) {
		BT5 bt5	= new BT5();
//		bt5.handleBaiTap4();

		System.out.println(bt5.infoEmployees());
		for (int i = 0; i <= bt5.infoEmployees().size();i++){
			System.out.println(bt5.infoEmployees().getKey());
		}
		for (Map.Entry<String, Integer> entry : bt5.infoEmployees().entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
//		for(int j : bt5.infoEmployees){
//			System.out.print(j+" ");
//		}
	}

}

