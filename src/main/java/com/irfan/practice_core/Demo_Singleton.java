/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.irfan.practice_core;

/**
 *
 * @author Irfan
 */
public class Demo_Singleton {

    private static Demo_Singleton demoSingleton;

    private Demo_Singleton() {

    }

    public static Demo_Singleton getDemoSingleton() {
        if (demoSingleton == null) {
            demoSingleton = new Demo_Singleton();
            System.out.println("singleton created first time");
        } else {
            System.out.println("sorry only one time is alloed");
        }
        return demoSingleton;
    }
}
