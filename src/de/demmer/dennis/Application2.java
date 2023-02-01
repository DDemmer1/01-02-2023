package de.demmer.dennis;

import java.util.ArrayList;

public class Application2 {

	public static void main(String[] args) {
		int x = GenericMethodTraining.getArgumentBack(10);
		System.out.println(x);

		String s = GenericMethodTraining.getArgumentBack("Hallo Welt!");
		System.out.println(s);

		// ------------------------

		Integer[] arrInt = { 5, 4, 2, 5 };
		GenericMethodTraining.printArray(arrInt);

		String[] stringArr = { "Hallo", "Welt" };
		GenericMethodTraining.printArray(stringArr);

		Double[] doubleArr = { 5.5, 5.5, 4.2 };
		GenericMethodTraining.printArray(doubleArr);

		// -------------------------

		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Test");
		stringList.add("Hallo");
		stringList.add("Welt");

		stringList.size();


		for (int i = 0; i < stringList.size(); i++) {
			System.out.println(stringList.get(i));
		}
		
		System.out.println("---------");
		
		for(String xy : stringList) {
			System.out.println(xy);
		}
		
		GenericClassTraining<String> stringClass = new GenericClassTraining<String>();
		stringClass.setVar("Test");
//		System.out.println(stringClass.getVar());

	}

}
