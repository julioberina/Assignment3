/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cpp.cs.cs141.assignment3;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Julio
 */
public class Grid {
    
    private String[][] gridLayout;
    private List<Card> cards;
    
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
    
    public List<Card> getCards()
    {
        return cards;
    }
    
    public String[][] getLayout()
    {
        return gridLayout;
    }
}
