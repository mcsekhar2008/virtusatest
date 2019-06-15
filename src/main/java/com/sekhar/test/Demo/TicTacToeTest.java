package com.sekhar.test.Demo;

import java.util.Scanner;

import com.sekhar.test.exception.InvalidInputException;


public class TicTacToeTest  {

	public static void main(String[] args) throws InvalidInputException {
		
		TicTacToe t = new TicTacToe();
		Scanner s = new Scanner(System.in);
		int x=0,y=0;
		do
		{
			try {
			System.out.println(t.player==t.X?"Player X turn":"Player O turn");
			System.out.println("Enter x and y places");
			x=s.nextInt();
			y=s.nextInt();
			
			t.putSign(x, y);
			System.out.println(t.toString());
			System.out.println("_____________________________");
			t.displayWinner();
			
			}catch(Exception e) {
				System.out.println("Error got:"+e.getMessage());
				throw new InvalidInputException(e.getMessage());
			}
			
		}while(t.isEmpty);
	}
}

