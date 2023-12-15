package com.promineotech;

import java.util.Arrays;

public class Week4CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 * 1. Question: Create an array of int called ages that 
 * contains the following values: 3, 9. 23, 64, 2, 8, 28, 93
 */
		//a.
	int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	System.out.println("The value of the first index in the ages array =" + ages [0]); //#4
	// What is the length of the ages array?
	System.out.println("The length of the ages array = " + ages.length); 
	
	// #3 How do we find the index of the last element?
	
	System.out.println("The last element in the ages array =" +ages [ages.length-1]); //#3
	
	
	//How would we print every element of the ages array?
	
	System.out.println("Outside of for loop!");

	/*
	 * b. Create a new array of the int called ages2 
	 * with 9 elements (ages2 will be longer than the ages array,
	 * and have more elements).
	 */
	
	int [] ages2 = {11, 22, 33, 44, 55, 66, 77, 88, 99,};
	int sum =0; 
	//Create a loop to calculate the sum of all the ages in the ages array
	for (int i =0; i< ages.length; i++) {
		
		sum += ages [i];
		System.out.println(i);
		System.out.println(sum);
	}
	 System.out.println(Arrays.toString(ages));
	//
	
	//2. Create an array of String called names....
	
	String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	// a. Use a loop to iterate through array and calculate the average number of the letters per name. 
	// Print the result to the console. 
	
	int sum2= 0; 
	for( int i = 0; i< names.length; i++ ) {
		sum2 += names[i].length (); 
		//System.out.println(names[i].length());
	}
	System.out.println("Value of sum for names" + sum2);
	System.out.println("Average letters per name in array = " + (sum2/names.length));
	//b.
	String concatNames =""; 
	for (int i = 0; i< names.length; i++) {
		concatNames += names[i] + " ";
		System.out.println(concatNames); }
	
		}

		//Test concatString method:
	System.out.println(concatStrings("Santa", "Claus"));
	
} //end of main method

  //3. How do you access the last element of any array?
 
	System.out.println[Array.length-1];


//4. How do you access the first element of any array? 

	System.out.println(Array)[0];

	
	// Create a method that takes 2 Strings and concatenates them together
	
	public static String concatStrings (String str1, String str2) {
		
	return str1 + "" + str2; 
		
		 
	//5. Create a new array of int called nameLengths. 
	//	Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	
	int[] nameLengths { }
	
	for (int i = 0; i< names ; i++) {
		+= names[i] + " ";
	}
	
	//6 Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
	//Print the result to the console.
	
	//# 7 Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
	//(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	
	StringBuilder result = new StringBuilder();

    for (int i = 0; i < n; i++) {
        result.append(word);
    }

    return result.toString();
    
    //8. Write a method that takes two Strings, firstName and lastName, and returns a full name
    //(the full name should be the first and the last name as a String separated by a space).
    
    public class FullName {
        public static void main(String[] args) {
            String fullName = (String firstName,String lastName);
            return firstName " " + lastName;
               }
       // 9. Write a method that takes an array of int and returns true if 
        //the sum of all the ints in the array is greater than 100
}
	}
	
	 public static int NumbersArray;
	 public static boolean main(int [] args) {
	 
	 NumbersArray int () = {10, 20, 30, 40, 50, 60, 70};
	 if (int i =0; i< NumbersArray.length; i++); 
	 
	 (sum > 100 ) {
		return true; 
	} else {
		return false;
		
	 }
	

	 
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.
	 
	 public static double calculateAverage(double[] array) {
			double sum = 0;
			for (double number : array) {
				sum += number;
			}
			return sum / array.length;
	 
	 }
	 
	 //#11 Write a method that takes two arrays of double and returns true if the average of the elements
	 //in the first array is greater than the average of the elements in the second array.
	 
	 //#12 Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	 //and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	 
	 
	 public static class
	 
	 willBuyDrink boolean () ={ 
			 
	//#13 Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
			 
			 public static double calculateGrade(double[] array) {
					double sum = 0;
					for (double number : array) {
						sum += number;
					}
					return sum / array.length;
		//This method calculates the average of grades in an array. The grades are doubles. 
			 
	 }
	 }
	 
    //end of class

	
