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
 * This class represents the {@link Main} class, which creates an instance of
 * the whole game and runs the game loop.
 */
public class Main {
    
    /**
     * This is the main method for the class, which is the method run at 
     * execution taking optional arguments for parameters. 
     * 
     * @param args Optional command-line arguments for program execution.
     */
    public static void main(String[] args)
    {
        MemoryUI ui = new MemoryUI(new GameEngine());
        ui.run();
    }
}
