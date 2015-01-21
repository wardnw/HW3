package pkg.nward.baseball;

import java.util.Scanner;

public class Display {

	static Scanner scan = new Scanner(System.in);
	static Baseball b = new Baseball();
	
	//get stat inputs
	public static void GetInput(){
		System.out.println("Enter At Bats:");
		b.SetBats(scan.nextInt());
		
		System.out.println("Enter hits:");
		b.SetHits(scan.nextInt());
		
		System.out.println("Enter outs:");
		b.SetOuts(scan.nextInt());
		
		System.out.println("Enter walks:");
		b.SetWalks(scan.nextInt());
		
	}
	
	//display the averages
	public static void PrintAvgs(){
		System.out.println("Batting average is " + b.GetBatAvg());
		System.out.println("Base average is " + b.GetBaseAvg());
	}
	
}
