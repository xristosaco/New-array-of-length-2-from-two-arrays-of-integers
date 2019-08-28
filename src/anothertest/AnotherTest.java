/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anothertest;

import java.io.File;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author xristos
 */
public class AnotherTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
 int []list={10,11,12,13,14,15};
 int [] list2={20,21,22,23,24,25};
 
        System.out.println("List is : "+Arrays.toString(list));
        System.out.println("List2 is : "+Arrays.toString(list2));
        int [] final_list={list[1],list2[2]};
        System.out.println("Final_list is: "+Arrays.toString(final_list));
  }
}




