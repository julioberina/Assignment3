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

import java.util.List;

/**
 *
 * @author Julio
 */

/**
 * This class represents a game engine, which works with {@link MemoryUI} by
 * returning responses to the requests from the user interface.
 */
public class GameEngine {
    
    /**
     * This field represents the number of moves that the user has taken.
     */
    private int moveCount;
    
    /**
     * This field represents the {@link Grid} that lays out all {@link Card}s on
     * the screen, which is displayed by {@link MemoryUI}, and they all start
     * out face-down with a number (1-16) representing the spot of the card in
     * the grid.
     */
    private Grid grid;
    
    /**
     * This is the default constructor for the class, which assigns {@code 0} to
     * {@link #moveCount} and creates the {@link Grid}.  
     */
    public GameEngine()
    {
        moveCount = 0;
        grid = new Grid();
    }
    
    /**
     * This moves increments {@link #moveCount} as a representation of the next
     * turn.
     */
    public void nextMove()
    {
        ++moveCount;
    }
    
    /**
     * This method responds to the {@link MemoryUI} with the value of 
     * {@link #moveCount} for purposes of displaying it to the screen.
     * 
     * @return The value of {@link #moveCount}.
     */
    public int getMoveCount()
    {
        return moveCount;
    }
    
    /**
     * This method responds to the {@link MemoryUI} with by giving it 
     * {@link #grid} for purposes of displaying the {@link Grid} to the screen.
     * 
     * @return The {@link #grid} to display to the screen.
     */
    public Grid getGrid()
    {
        return grid;
    }
    
    /**
     * This method takes two inputs from the user, which are integers that 
     * represents a face-down {@link Card} in the {@link Grid} and compare
     * them by checking symbol values and nullifying them if they're equal.
     * 
     * @param pick1 The first {@link Card} the user picks.
     * @param pick2 The second {@link Card} the user picks.
     * @return The symbol matched or an empty string if no match found.
     */
    public String checkMatch(int pick1, int pick2)
    {
        List<Card> cards = grid.getCards();
        String symbol1 = cards.get(pick1).getSymbol();
        String symbol2 = cards.get(pick2).getSymbol();
        
        if (symbol1.equals(symbol2)) {
            cards.set(pick1, null);
            cards.set(pick2, null);
            return symbol1;
        }
        else {
            cards.get(pick1).unflip();
            cards.get(pick2).unflip();
            return "";
        }
    }
    
    /**
     * This method checks every {@link Card} in the {@link Grid} every turn,
     * which keeps the game running if at least one {@link Card} isn't 
     * {@code null}.
     * 
     * @return State of whether at least one {@link Card} isn't {@code null}.
     */
    public boolean gameIsRunning()
    {
        boolean notAllNulls = false;
        
        List<Card> cards = grid.getCards();
        
        for (int i = 0; i < 16; i++)
        {
            if (grid.getCards().get(i) != null) {
                notAllNulls = true;
                break;
            }
        }
        
        return notAllNulls;
    }
}
