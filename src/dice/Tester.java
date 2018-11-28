package dice;

import java.lang.Math;

public class Tester 
{
	
	public void getRolls()
	{
		
	}//getRolls

	public static void main(String[] args) 
	{
		int stats[]= new int[6];
		int rolls[] = new int[4];
		int i, j;
		int num1, num2, num3;
		int smallestNum=9999;
		int statSum=0;
	  	
	
			  for(i=0;i<4;i++)
			  {
				  rolls[i]= (int) (Math.random()*6+1);
				  if(rolls[i] < smallestNum)
					  smallestNum= rolls[i];	  
			  }
	
			  for(i=0;i<4;i++)
			  {				  
				  for(j=0;j<6;j++)
					  stats[j]+=rolls[i];
			  }
			  for(j=0;j<6;j++)
			  System.out.println(stats[j]-smallestNum);
			  
			  
	}//main
}//Tester
