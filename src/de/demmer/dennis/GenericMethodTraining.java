package de.demmer.dennis;

public class GenericMethodTraining {

	public static <T> T getArgumentBack(T variable) {
		return variable;
	}
	

	public static <E> void printArray(E[] array) {
		System.out.print("[");

		for (int i = 0; i < array.length; i++) {
			if (!(i == array.length - 1)) {
				System.out.print(array[i] + ",");
			} else {
				System.out.print(array[i]);
			}
		}
		System.out.print("]\n");
	}

	
	//ADVANCED!
	public static <T extends Comparable<T>> T getBiggestVariable(T var1, T var2, T var3) throws Exception  {
	
		T biggest = var1;

		if (var2.compareTo(biggest) > 0) {
			biggest = var2;
		}

		if (var3.compareTo(biggest) > 0) {
			biggest = var3;
		}
		
		return biggest;

	}

}
