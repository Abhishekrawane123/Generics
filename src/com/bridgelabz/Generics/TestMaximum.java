package com.bridgelabz.Generics;

public class TestMaximum {
	
	public static void maximumInteger(Integer []intArr) {
		
		int maxCheck = intArr[0].compareTo(intArr[1]);
		if(maxCheck>0) {
			maxCheck=intArr[0].compareTo(intArr[2]);
			if(maxCheck>0) {
				System.out.println("maximum of three integers is : " + intArr[0]);
			}
			else
				System.out.println("maximum of three integers is : " + intArr[2]);
			
		}else if(maxCheck<0) {
			maxCheck=intArr[1].compareTo(intArr[2]); 
			if(maxCheck>0) {
				System.out.println("maximum of three integers is : " + intArr[1]);
			}
			else
				System.out.println("maximum of three integers is : " + intArr[2]);
		}
		
	}
	
	public static void maximumDouble(Double []intArr) {
		
		int maxCheck = intArr[0].compareTo(intArr[1]);
		if(maxCheck>0) {
			maxCheck=intArr[0].compareTo(intArr[2]);
			if(maxCheck>0) {
				System.out.println("maximum of three integers is : " + intArr[0]);
			}
			else
				System.out.println("maximum of three integers is : " + intArr[2]);
			
		}else if(maxCheck<0) {
			maxCheck=intArr[1].compareTo(intArr[2]); 
			if(maxCheck>0) {
				System.out.println("maximum of three integers is : " + intArr[1]);
			}
			else
				System.out.println("maximum of three integers is : " + intArr[2]);
		}
	}
	
	private static void maximumSting(String[] stringArray) {
		int maxCheck = stringArray[0].compareTo(stringArray[1]);
		if(maxCheck>0) {
			maxCheck=stringArray[0].compareTo(stringArray[2]);
			if(maxCheck>0) {
				System.out.println("maximum of three integers is : " + stringArray[0]);
			}
			else
				System.out.println("maximum of three integers is : " + stringArray[2]);
			
		}else if(maxCheck<0) {
			maxCheck=stringArray[1].compareTo(stringArray[2]); 
			if(maxCheck>0) {
				System.out.println("maximum of three integers is : " + stringArray[1]);
			}
			else
				System.out.println("maximum of three integers is : " + stringArray[2]);
		}	
	}
	
	public static void main(String[] args) {
		
		Integer intArray[] = {20,22,21};
		Double doubleArray[] = {26.26,22.25,28.23};
		String stringArray[] = {"Apple","Peach","Banana"};
		maximumInteger(intArray);
		maximumDouble(doubleArray);
		maximumSting(stringArray);
	}
}