// Dalila Spencer
// 2026-02-16

package dms_week5;

public class Program1 {

	public static void main(String[] args) {
		
		int i;
        for(i = 1; i < 5000; i = 2 * i + 1){
             System.out.println("Count is: " + i);


        } 
        
	} 

}

// The program starts with the integer i. In the for loop i is assigned the value of 1.
// The condition for the loop is that i is less than 5000. Each time the loop repeats i is multiplied by 2 and one is added to it. 
// This new value is assigned to i. For each loop a line is printed that says, "Count is: " and then the current value of i.
// The loop repeats, printing each increasing value of i until the next value of i would be larger than 5000. 
// Then the loop exits and the program ends.

