package com.Session4.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
	/*
	 * Sort an array and insert an element inside it.
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a lenght of array");
		Scanner scan = new  Scanner(System.in);
		int length = scan.nextInt();
		
		if(length>0)
		{
			ArrayClass array = new ArrayClass(length);
			
			for(int i=1; i<=length; i++)
			{
				array.addElementForIndex(i);
			}
			System.out.println("------ Print array --- ");
			array.print();
			System.out.println("------ Print sorted array --- ");
			array.sort();
			array.print();
		}
		else
		{
			System.out.println("The length of array should be grater than Zero");
		}
		
		
	}
}


class ArrayClass
{
	private int[] arr = null;
	private Scanner scan;
	
	public ArrayClass(int length)
	{
		arr = new int [length];
	}
	
	
	public void addElementForIndex (int index)
	{
		scan = new  Scanner(System.in);
		System.out.println("Enater for array element No "+index+": ");
		arr[index-1] = scan.nextInt();
	}
	public void print() 
	{
		for(int a:arr)
		{
			System.out.println(a);
		}
	}
	public void sort() 
	{
		Arrays.sort(arr);
	}
	
	
	
}