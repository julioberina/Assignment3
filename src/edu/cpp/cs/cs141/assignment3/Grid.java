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
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Julio
 */

/**
 * This class represents the {@link Grid} that will display all {@link Card}s
 * face-down and assign them a number based on their order in the layout of
 * the grid ({@link #gridLayout}).
 */
public class Grid {
    
    /**
     * This field is a multidimensional array that represents how the 
     * {@link Grid} will be layed out and display to the screen by the
     * {@link MemoryUI}.
     */
    private String[][] gridLayout;
    
    /**
     * This field represents a list of all {@link Card} types that is utilized
     * to display the symbolic representation of the {@link Card} or an 
     * empty string if nullified instead of its numeric order via the 
     * {@link #gridLayout}.
     */
    private List<Card> cards;
    
    /**
     * This is the default constructor for the class, which develops the
     * {@link #gridLayout} and initialize the {@link #cards}.
     */
    public Grid()
    {
        gridLayout = new String[4][4];
        
        for (int x = 0; x < 4; x++)
        {
            for (int y = 0; y < 4; y++)
                gridLayout[x][y] = Integer.toString(x * 4 + (y + 1));
        }
        
        initializeCards();
    }
    
    /**
     * This method initialize {@link #cards} by adding two {@link Card}s of
     * each type to {@link #cards} and shuffles it 5 times.
     */
    public void initializeCards()
    {
        cards = new ArrayList<Card>();
        
        for (int i = 0; i < 16; i++)
        {
            if (i == 0 || i == 1)
                cards.add(i, new QuestionCard());
            else if (i == 2 || i == 3)
                cards.add(i, new PlusCard());
            else if (i == 4 || i == 5)
                cards.add(i, new MinusCard());
            else if (i == 6 || i == 7)
                cards.add(i, new StarCard());
            else if (i == 8 || i == 9)
                cards.add(i, new BangCard());
            else if (i == 10 || i == 11)
                cards.add(i, new SlashCard());
            else if (i == 12 || i == 13)
                cards.add(i, new PoundCard());
            else if (i == 14 || i == 15)
                cards.add(i, new PercentCard());
        }
        
        for (int x = 0; x < 5; x++) { Collections.shuffle(cards); }
    }
    
    /**
     * This methods simply returns the list of cards.
     * 
     * @return The {@link #cards} list. 
     */
    public List<Card> getCards()
    {
        return cards;
    }
    
    /**
     * This method returns the two-dimensional layout of the {@link Grid}.
     * 
     * @return two-dimensional array representation of a {@link Grid}.
     */
    public String[][] getLayout()
    {
        return gridLayout;
    }
}
