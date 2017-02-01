/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cpp.cs.cs141.assignment3;

import java.util.List;

/**
 *
 * @author Julio
 */
public class GameEngine {
    
    private int moveCount;
    private Grid grid;
    
    public GameEngine()
    {
        moveCount = 0;
        grid = new Grid();
    }
    
    public void nextMove()
    {
        ++moveCount;
    }
    
    public int getMoveCount()
    {
        return moveCount;
    }
    
    public Grid getGrid()
    {
        return grid;
    }
    
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
