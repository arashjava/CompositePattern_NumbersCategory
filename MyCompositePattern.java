/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompositepattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author arash
 */
public class MyCompositePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String category=null;
        ArrayList<String> al= new ArrayList<String>();
        al.add("Quite programe");
        al.add("Prime");
        al.add("Odd");
        al.add("Even");
        al.add("Number");
        boolean _even, _prime;
        Scanner sc = new Scanner(System.in);
        
        Tree prime= new Tree();
        category="Prime Number";
        prime.addNode(category);
        
        Tree odd= new Tree();
        category="Odd Number";
        odd.addNode(category);
        
        Tree even= new Tree();
        category="Even Number";
        even.addNode(category);

        for (int opt= 1; opt < 30; opt++)
        {
            if (opt==0){break;} //  quite the program
            _prime=isPrime(opt);
            _even= isEven(opt);
            if (_prime){  prime.addNode(Integer.toString(opt)); }
            
            if (_even){ even.addNode(Integer.toString(opt));}
            
            else{ odd.addNode(Integer.toString(opt));}
  
        }

        printOut(prime);
        printOut(odd);
        printOut(even);
    }

    private static void printOut(Tree list){
        for (String p: list.getSubSets()){
                System.out.println("\t" +p);
        }  
        System.out.println("-----------------------");
    }

 
    private static boolean isPrime(int num){
        for (int i=num-1; i>1; i--){
            if ( num%i ==0 ){ 
                return false;
            }
        }
        return true;
    }
    
    private static boolean isEven(int num){
        if ( num%2 ==0 ){ 
            return true;
        }
        return false;
    }
}
