/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cpp.cs.cs141.assignment3;

import java.util.Scanner;

/**
 *
 * @author Julio
 */
public class MemoryUI {
    
    private GameEngine engine;
    private Scanner scan;
    
    public MemoryUI(GameEngine engine)
    {
        this.engine = engine;
        scan = new Scanner(System.in);
    }
    
    public void run()
    {
        System.out.println("Welcome to Memory! Press Enter to play: ");
        scan.nextLine();
    }
    
    
}
