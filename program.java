package com.cdac;
import java.util.Scanner;
public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		int b =sc.nextInt();
		int op= sc.nextInt();

		switch(op){
		case 1: 
		 System.out.println(a+b);
		break;

		case  2:
		 System.out.println(a-b);
		break;

		case 3:
		 System.out.println(a*b);
		break;

		case  4:
		 System.out.println(a/b);
		break;

		default :
		 System.out.println("no operations");

		}

	}

}
