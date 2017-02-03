/**
 * CS 141: Intro to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 *
 * Programming Assignment #3
 *
 * This is an implementation of the Memory game written in Java
 * through good Object-Oriented Design
 *
 * Julio Berina
 */

package edu.cpp.cs.cs141.assignment3;

import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Julio
 */
public class MemoryUI {
    
    private GameEngine engine;
    private Scanner scan;
    
    public MemoryUI(GameEngine engine)
    {
        this.engine = engine;
        scan = new Scanner(System.in);
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
        int pick1 = flipFirstCard();
        engine.getGrid().getCards().get(pick1).flip();
        System.out.print("\n");
        displayGrid();
        
        int pick2 = flipSecondCard(pick1);
        engine.getGrid().getCards().get(pick2).flip();
        System.out.print("\n");
        displayGrid();
        
        String symbol = engine.checkMatch(pick1, pick2);
        
        if (symbol.equals(""))
            System.out.print("No match found!  ");
        else
            System.out.print("Matched symbol:  " + symbol + ".  ");
        
        System.out.print("Press Enter to continue...");
        scan.nextLine();
        System.out.print("\n");
        engine.nextMove();
    }
    
    public int flipFirstCard()
    {
        int pick1 = -1;
        List<Card> cards = engine.getGrid().getCards();
        
        System.out.print("Enter first card number to flip:  ");
        
        do {
            pick1 = Integer.parseInt(scan.nextLine()) - 1;
            if (pick1 < 0 || pick1 > 15)
                System.out.print("Not a card number!  Reenter card number:  ");
            else if (cards.get(pick1) == null)
                System.out.print("Card number already matched!  Reenter card number:  ");
        } while (pick1 < 0 || pick1 > 15 || cards.get(pick1) == null);
        
        cards.get(pick1).flip();
        return pick1;
    }
    
    public int flipSecondCard(int prevPick)
    {
        int pick2 = -1;
        List<Card> cards = engine.getGrid().getCards();
        
        System.out.print("\nEnter second card number to flip:  ");
        
        do {
            pick2 = Integer.parseInt(scan.nextLine()) - 1;
            if (pick2 < 0 || pick2 > 15)
                System.out.print("Not a card number!  Reenter card number:  ");
            else if (pick2 == prevPick)
                System.out.print("Cannot equal first pick!  Reenter card number");
            else if (cards.get(pick2) == null)
                System.out.print("Card number already matched!  Reenter card number:  ");
        } while (pick2 < 0 || pick2 > 15 || pick2 == prevPick || cards.get(pick2) == null);
        
        cards.get(pick2).flip();
        return pick2;
    }
    
    public void displayGrid()
    {
        String[][] grid = engine.getGrid().getLayout();
        List<Card> cards = engine.getGrid().getCards();
        
        for (int i = 0; i < 16; i++)
        {
            if ((i % 4) == 3)
            {
                if (cards.get(i) == null)
                    System.out.print("\n");
                else
                {
                    if (cards.get(i).isFlipped())
                        System.out.println(cards.get(i).getSymbol());
                    else
                        System.out.println(grid[i/4][i%4]);
                }
            }
            else
            {
                if (cards.get(i) == null)
                    System.out.print("\t");
                else
                {
                    if (cards.get(i).isFlipped())
                        System.out.print(cards.get(i).getSymbol() + "\t");
                    else
                        System.out.print(grid[i/4][i%4] + "\t");
                }
            }
        }
        
        System.out.print("\n");
    }
}
