/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycompositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arash
 */
public class Tree {
    private String node;
    private List<String> subSets= new ArrayList<String>();

    public Tree() { }

    public void setNode(String node) {
        this.node = node;
    }

    public void addNode(String n){
        subSets.add(n);
    }     
    
    public List<String> getSubSets(){
        return subSets;
    }
}
