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
