/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.irfan.practice_core;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Irfan
 */
public class List_Iterator {

    private Demo_Singleton demo_Singleton1 = null, demo_Singleton2 = null;
    static List_Iterator itr = new List_Iterator();

    public static void main(String[] args) {
        List names = new LinkedList();
        names.add("irfan1");
        names.add("irfan2");
        names.add("irfan3");
        names.add("irfan4");
        names.add("irfan5");
        names.add("irfan6");
        itr.printlist(names);
        itr.createSingletonInstance();

    }

    public void createSingletonInstance() {
        System.out.println("ready for singleton ");
        demo_Singleton1 = Demo_Singleton.getDemoSingleton();
        System.out.println("once again ready for same ");
        demo_Singleton2 = Demo_Singleton.getDemoSingleton();
        System.out.println("Yes got it for second time. ");
        System.out.println("once again ready for same third time ");
        Demo_Singleton demo_Singleton3 = Demo_Singleton.getDemoSingleton();
        System.out.println("Yes got it for third time");
    }

    private void printlist(List names) {
        ListIterator litr = names.listIterator(0);
        while (litr.hasNext()) {
            System.out.println("this is list" + litr.next());
//            System.out.println("this is list" + litr.previous());
        }

        //To change body of generated methods, choose Tools | Templates.
    }

}
