package com.promineotech;

public class Week4CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 * 1. Question: Create an array of int called ages that 
 * contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
 */
		//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array
	
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		int result = ages[ages.length - 1] - ages[0]; {

        System.out.println("Result of subtraction: " + result);
	}

	/*
	 * b. Create a new array of the int called ages2 
	 * with 9 elements (ages2 will be longer than the ages array,
	 * and have more elements).
	 */
	// i.
		
	int [] ages2 = {11, 22, 33, 44, 55, 66, 77, 88, 99};
	int sum2 =0; 
	
	//ii Repeat the subtraction from step 1a
	
	int result2 = ages2[ages2.length - 1] - ages2[0]; {

        System.out.println("Result of subtraction: " + result2);
	}
	
	//Show that using index values for the elements is dynamic (works for arrays of different lengths). See the results of part a & b both work 
	//on arrays of different lengths. 
	
	//c Use a loop to iterate through the array and calculate the average age. 
	
	int sum = 0;
	for (int age:ages) {
		
		sum += age;
	}
	double average = (double) sum/ages.length; 
	
		System.out.println("The average age is " + average);
		
		//2. Create an array of String called names....
		
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// a. Use a loop to iterate through array and calculate the average number of the letters per name. 
	
		int sum3= 0; 
		for( int i = 0; i< names.length; i++ ) {
			sum3 += names[i].length (); 
		System.out.println(names[i]);
		System.out.println("Value of sum for names is " + sum3);
		System.out.println("Average letters per name in array = " + (sum3/names.length));
		
		//b. Use a loop to iterate through the array again and
		//concatenate all the names together, separated by spaces, and print the result to the console.
		
		String concatNames =""; 
		for (int i1 = 0; i1< names.length; i1++) {
			concatNames += names[i1] + " ";
			System.out.println(concatNames); }
		
			}

	// 3. How do we find the index of the last element?
	
		// arrayName.length-1 
		
	//4. How do you access the first element of any array? 

	//	System.out.println(arrayName)[0];
	
	// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.

	 int [] nameLengths = new int[names.length]; {
		 
		 for (int i = 0; i < names.length; i++) {
	            nameLengths[i] = names[i].length();
	        }
	 
	
	 // 6. Write a loop to iterate over the nameLengths array and 
	//calculate the sum of all the elements in the array. Print the result to the console.
	
	int sum4 = 0; {
    for (int length : nameLengths) {
        sum4 += length;
    }

    // Print the result to the console
    System.out.println("Sum of name lengths: " + sum); 
	
    	
    }
    	
	 }
	}
	//7 Write a method that takes a String, word, and an int, n, as 
	//arguments and returns the word concatenated to itself n number of times.



	 public static String concatenateWord(String word, int n) {
	        StringBuilder result = new StringBuilder();
	        
	        for (int i = 0; i < n; i++) {
	            result.append(word);
	        }
	        
	        return result.toString();
	 }        

	      //8. Write a method that takes two Strings, firstName and lastName, and returns a full name
	        //(the full name should be the first and the last name as a String separated by a space).
	        
	            
	            public static String getFullName(String firstName, String lastName) {
	                return firstName + " " + lastName;
	            }
	            
	      // 9. Write a method that takes an array of int and returns true if 
	      //the sum of all the ints in the array is greater than 100
	            
	            public static boolean isSumGreaterThan100(int[] array) {
	                int sum = 0;

	                // Calculate the sum of array elements
	                for (int num : array) {
	                    sum += num;
	                }

	                // Check if the sum is greater than 100
	                return sum > 100;
	            }
	            
	        //10. Write a method that takes an array of double and returns the average of all the elements in the array.   
	            public static double calculateAverage(double[] array) {
	    			double sum = 0;
	    			for (double number : array) {
	    				sum += number;
	    			}
	    			return sum / array.length;
	    			
	            }
	    	 //11  Write a method that takes two arrays of double and returns true if the average of the elements
	    			 //in the first array is greater than the average of the elements in the second array.
	    			 
	    			public static boolean compareAverages(double[] array1, double[] array2) {
	    		        double averageArray1 = calculateAverage(array1);
	    		        double averageArray2 = calculateAverage(array2);

	    		        return averageArray1 > averageArray2;
	    		    }
	    			 
	    			//#12 Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	    			 //and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	    			 
	    			 
	    			public static boolean willBuyDrink ( boolean isHotOutside, double moneyInPocket) { 
	    					
	    					return isHotOutside && moneyInPocket > 10.50;
	    						
	    			}
	    						 
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
	    	 
	        