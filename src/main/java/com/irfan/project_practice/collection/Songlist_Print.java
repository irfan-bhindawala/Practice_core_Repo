/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.irfan.project_practice.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

/**
 *
 * @author Irfan
 */
public class Songlist_Print {

    TreeSet<String> songLIst = new TreeSet<String>();
    ArrayList<String> songLIst1 = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        new Songlist_Print().go();
    }

    private void go() throws IOException {
        getSongs();
//        Collections.sort(songLIst);
        System.out.println("your song list strts here \n" + songLIst);
    }

    private void getSongs() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("C:\\Users\\Irfan\\Desktop\\song.txt")));
            String line = "";
            while ((line = br.readLine()) != null) {
                addLine(line);
            }
        } catch (Exception e) {
            System.out.println("oops exception occure" + e.getStackTrace());
        } finally {
            br.close();
        }
    }

    private void addLine(String line) {
        String token[] = line.split("/");
        songLIst.add(token[0]);
    }

}
