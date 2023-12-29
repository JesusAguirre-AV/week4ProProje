import java.io.*;
import java.util.*;
public class PromeoProj4 {
		//7
	public static String concatinator(String a, int b)
	{
		/*to save memory, a string builder is utilized*/
		StringBuilder c = new StringBuilder();
		/*first check if inputs are valid*/
		if(!a.isEmpty() && b>0)
		{
			/*If the inputs are valid then the string a will be concatinated
			 * b times*/
			for(int i=0; i<b; i++)
			{
				c.append(a);
			}
		}
		else
		{
			System.out.println("Concatinator inputs invalid");
		}
		return c.toString();
	}
		//8
	public static String fullName(String firstName, String lastName)
	{
		/*We only need to concatinate the inputed names. We don't even need
		 * to name any new variables.*/
		return firstName+" "+lastName;
	}
		//9
	public static boolean sumHundered(int[] nums)
	{
		int tot=0;
		/*if input array is empty, it returns false*/
		if(nums==null || nums.length==0)
		{
			return false;
		}
		for(int i=0; i<nums.length; i++)
		{
			/*adds each part of array, if at any point it surpasses 100 it
			 * returns true and therefore ends the method*/
			tot +=nums[i];
			if(tot>100)
			{
				return true;
			}
		}
		return false;
	}
		//10
	public static double doubAv(double[] d)
	{
		double returnable=0;
		/*checking input array*/
		if(d==null || d.length==0)
		{
			return 0;
		}
		/*summing all parts of d array*/
		for(int i=0; i<d.length; i++)
		{
			returnable +=d[i];
		}
		/*dividing returnable for average*/
		returnable /= d.length;
		return returnable;
	}
		//11
	public static boolean avCompare(double[] f, double[] s)
	{
		/*we already have a method that finds the average of a double array
		 * this function only needs to compare them.*/
		return (doubAv(f)) > (doubAv(s));
	}
		//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
	{
		/*Once again there is no real need to create any variables because we
		 * only need one function, even if it does have two parts.*/
		return isHotOutside && (moneyInPocket>10.50);
	}
		//13
	public static String napTime(double time)
	{
		if(time>=11.00)
		{
			return "I need to sleep!";
		}
		else if(time>=9.00)
		{
			return "I could use some rest.";
		}
		else if(time>=8.00)
		{
			return "It might be a good idea to get ready.";
		}
		return "I have time.";
	}
	
	public static void main(String[] args)
	{
		/*first array with needed values before being printed for 1a*/
		int[] ages= {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length-1]-ages[0]);
		/*second array for part 1b*/
		int[] ages2 = new int[9];
		for(int i=0; i<ages.length; i++)
		{
			ages2[i]=ages[i];
		}
		ages2[8]=40;
		System.out.println(ages2[ages2.length-1]-ages[0]);
		/*The previous shows that the syntax used can be applied to any array
		 * no matter the size to subtract the first from the last index*/
		
		/*finding average using for loop to add all ages in list and divide
		 * by the size after*/
		double avg=0;
		for(int i=0; i<ages2.length; i++)
		{
			avg += ages2[i];
		}
		avg /= ages2.length;
		System.out.println(avg);
		/*2. string array*/
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		avg=0;
			/*a, similar to part one except we are using number of letters
			 * in each word instead of a stored integer*/
		for(int i=0; i<names.length; i++)
		{
			avg += names[i].length();
		}
		avg /= names.length;
		System.out.println(avg);
			/*b, for loop to concatenate the names with a space between them*/
		StringBuilder nameS = new StringBuilder(); 
		for(int i=0; i<names.length; i++)
		{
			nameS.append(names[i] + " ");
		}
		System.out.println(nameS.toString());
		/*3. Because the index of any array start at 0, the last index will be
		 * one less the size of the array. To access it you can use 
		 * ArrayName[ArrayName.length - 1]*/
		
		/*4. The first index of any array will be 0, therefore to access it we
		 * can use ArrayName[0]*/
		
		/*5. int array nameLengths to store the number of letters in each name.
		 * It should have the same size as the names array. Note that
		 * Array.length and String.length() are different.*/
		int[] nameLengths = new int[names.length];
		for(int i=0; i<names.length; i++)
		{
			nameLengths[i]= names[i].length();
		}
		/*6. iterate over nameLengths and print the sum total. I will reuse the
		 * avg variable but I will not divide it like in previous parts.*/
		avg = 0;
		for(int i=0; i<nameLengths.length; i++)
		{
			avg += nameLengths[i];
		}
		System.out.println(avg);
		/*7. this will be the instance where we call concatinator method*/
		String concatinated = concatinator("Hello",3);
		System.out.println(concatinated);
		/*8. Method that concatinates two string (names) and returns the result
		 * is called and printed*/
		System.out.println(fullName("Joseph", "Joestar"));
		/*9. method that takes array, sums its parts and return true if more
		 * than 100*/
		System.out.println(sumHundered(ages));
		/*10. method that takes double array and returns their average*/
		double[] dArr = {1.00, 2.00};
		System.out.println(doubAv(dArr));
		/*11. method returns true if first array double is larger than the
		 * second*/
		double[] dArr2 = {2.00, 2.00};
		System.out.println(avCompare(dArr2, dArr));
		/*12. boolean method willBuyDrink returns true if isHotOutside and
		 * moneyInPocked is greater than 10.50(not specified equal to)*/
		boolean isHotOutside=true;
		double moneyInPocket=10.51;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		/*13. create own method that solves a problem. My method will look at
		 * reasonable times to sleep based off a double input (hour).(minute)*/
		System.out.println(napTime(10.50));
	}
}
