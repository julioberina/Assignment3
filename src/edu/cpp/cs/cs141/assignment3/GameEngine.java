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
public class GameEngine {
    
    private int moveCount;
    
    public GameEngine()
    {
        moveCount = 0;
    }
    
    public void nextMove()
    {
        ++moveCount;
    }
    
    public int getMoveCount()
    {
        return moveCount;
    }
}
