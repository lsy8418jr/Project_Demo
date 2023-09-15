/* This is my first project for making 
  Powerball number generator*/

package _2023._3Q;

import java.util.*;

public class PowerBall_NumGenarator {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random rand = new Random();

		while (numbers.size() < 5) {

			int powerball = rand.nextInt(69) + 1;
			if (!numbers.contains(powerball)) {
				numbers.add(powerball);
			}
		}
		Collections.sort(numbers);

		int powerNum = (int) (Math.random() * 26 + 1);

		System.out.println("Your lucky numbers are : \n" + numbers + " + " + powerNum);

	}

}
