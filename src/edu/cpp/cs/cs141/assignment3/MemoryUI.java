/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cpp.cs.cs141.assignment3;

import java.util.Scanner;

/**
 *
 * @author Julio
 */
public class MemoryUI {
    
    private GameEngine engine;
    private Grid grid;
    private Scanner scan;
    
    public MemoryUI(GameEngine engine)
    {
        this.engine = engine;
        scan = new Scanner(System.in);
        grid = new Grid();
    }
    
    public void run()
    {
        System.out.println("Welcome to Memory! Press Enter to play: ");
        scan.nextLine();
        System.out.print("\n");
        
        while (engine.gameIsRunning())
        {
            System.out.println("Number of moves:  " + engine.getMoveCount() 
                    + "\n");
            displayGrid();
            makeMove();
        }
        
        System.out.println("Congratulations! You won in " +
                engine.getMoveCount() + " moves!\n");
    }
    
    public void makeMove()
    {
        int pick1 = -1;
        int pick2 = -1;
        
        System.out.print("Enter first card number to flip:  ");
        
        do {
            pick1 = Integer.parseInt(scan.nextLine()) - 1;
            if (pick1 < 0 || pick1 > 15)
                System.out.print("Not a card number!  Reenter card number:  ");
        } while (pick1 < 0 || pick1 > 15);
        
        System.out.print("\nEnter second card number to flip:  ");
        
        do {
            pick2 = Integer.parseInt(scan.nextLine()) - 1;
            if (pick2 < 0 || pick1 > 15)
                System.out.print("Not a card number!  Reenter card number:  ");
            else if (pick2 == pick1)
                System.out.print("Cannot equal first pick!  Reenter card number");
        } while (pick2 < 0 || pick2 > 15 || pick2 == pick1);
        
    }
    
    public void displayGrid()
    {
        for (int x = 0; x < 4; x++)
        {
            for (int y = 0; y < 4; y++)
            {
                if (y == 3)
                    System.out.println(grid.getLayout()[x][y]);
                else
                    System.out.print(grid.getLayout()[x][y] + "\t");
            }
        }
    }
}
