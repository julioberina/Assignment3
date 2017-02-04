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

/**
 * This class represents the abstract notion of a {@link Card}, which contatins
 * the attributes of every type of card included in the game.
 */
public abstract class Card {
    
    /**
     * This field represents the symbol displayed by the {@link Grid} when a
     * {@link Card} is flipped over ({@link #flip()}) as well as the symbolic
     * representation of the child class that inherits {@link Card}.
     */
    private final String symbol;
    
    /**
     * This field simply represents the state of the {@link Card} whether it's
     * face-up or face-down.
     */
    private boolean flipped;
    
    /**
     * This is the default constructor for the class, which requires that 
     * every subclass of {@link Card} must have a {@link #symbol} associated
     * with it.
     * 
     * @param symbol    The symbol that will be assigned to {@link #symbol}. 
     */
    public Card(String symbol)
    {
        this.symbol = symbol;
    }
    
    /**
     * This method simulates the real-life idea of flipping a card face-up by 
     * setting {@link #flipped} to {@code true}.
     */
    public void flip()
    {
        flipped = true;
    }
    
    /**
     * This method simulates the real-life idea of determining whether a card is
     * flipped or not by observing the state of {@link #flipped}.
     * 
     * @return The value of {@link #flipped}.
     */
    public boolean isFlipped()
    {
        return flipped;
    }
    
    /**
     * This method simulates the real-life idea of flipping a card face-down by
     * setting {@link #flipped} to {@code false}.
     */
    public void unflip()
    {
        flipped = false;
    }
    
    /**
     * This method simply returns the value of {@link #symbol} for purposes of
     * displaying it along the rows and columns of a {@link Grid}.
     * 
     * @return The symbolic representation of a {@link Card} a.k.a type.
     */
    public String getSymbol()
    {
        return symbol;
    }
}
