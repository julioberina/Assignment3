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
public class Main {
    public static void main(String[] args)
    {
        MemoryUI ui = new MemoryUI(new GameEngine());
        ui.run();
    }
}
