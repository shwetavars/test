package finalTest;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Randomnos {

	public static void main(String[] args) {
		//Random class object
		Random rand = new Random();
		//using Set Collection
		Set <Integer> tset = new TreeSet<Integer>();
				
		while (tset.size()!=500)
		{
			int  n= rand.nextInt(900)+100;
			tset.add(n);
			}
		System.out.println(tset);
		System.out.println("Size of the Treeset is "+ tset.size());
		
		//Part 2.. asking the user for the Nth smallest no
		Scanner userInput = new Scanner(System.in);
			System.out.println("Enter the Nth smallest no");
			int nth =userInput.nextInt();
			//toArray
			Object[] a = tset.toArray();
			System.out.println(a[nth-1]);
		
						
		}
	}


