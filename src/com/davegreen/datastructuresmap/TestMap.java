/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davegreen.datastructuresmap;

import java.util.HashMap;

/**
 *
 * @author Dave
 */
public class TestMap
{
    private HashMap<String, Integer> scores;
    
    public TestMap()
    {
        scores = new HashMap<String, Integer>();
    }
    
    public void go()
    {
        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skylar", 420);
        
        System.out.println(scores);
        
        System.out.println(scores.get("Bert"));
    }
}
