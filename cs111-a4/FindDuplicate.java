/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author:
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 2
 *  true
 *************************************************************************/

public class FindDuplicate 
{

    public static void main(String[] args) 
	{

		//WRITE YOUR CODE HERE
		boolean output = false;
		int[] duplicate = new int[args.length];

		for(int i = 0; i < args.length; i++)
		{
			duplicate[i] = Integer.parseInt(args[i]);
		}

		for(int i = 0; i < duplicate.length; i++)
		{
			for(int j = i + 1; j < duplicate.length; j++)
			{
				if(duplicate[i] == (duplicate[j]))
				{
					output = true;
					break;
				}
			}
		}
		System.out.println(output);
	}
}
