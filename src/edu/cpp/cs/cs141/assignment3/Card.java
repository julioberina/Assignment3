/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cpp.cs.cs141.assignment3;

/**
 *
 * @author Julio
 */
public abstract class Card {
    
    private final String symbol;
    private boolean flipped;
    
    public Card(String symbol)
    {
        this.symbol = symbol;
    }
    
    public void flip()
    {
        flipped = true;
    }
    
    public boolean isFlipped()
    {
        return flipped;
    }
    
    public void unflip()
    {
        flipped = false;
    }
    
    public String getSymbol()
    {
        return symbol;
    }
}
