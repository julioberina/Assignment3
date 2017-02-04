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
 * This class represents a subclass of {@link Card}, which inherits all the
 * attributes of a card and assigns to itself the symbol {@code -}.
 */
public class MinusCard extends Card {
    
    /**
     * The default constructor for the class {@link MinusCard}, which 
     * supplies an argument to {@link Card} that is its symbolic
     * representation as a real-life card.
     */
    public MinusCard()
    {
        super("-");
    }
}
