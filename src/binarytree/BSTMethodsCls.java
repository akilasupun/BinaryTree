/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;
import java.util.ArrayList;
//import java.util.Iterator;
/**
 *
 * @author akila
 */
public class BSTMethodsCls implements BSTopeIntfc {
    
    BSTNode root=new BSTNode();
    
    //<editor-fold desc="Generic methods">  
    public boolean isEmpty(){
        
        if (root.leftChild==null && root.rightChild==null) {
            return true;
        } else {
            return false;
        }
    }
    public int size(){return size(root);}
    public int size(BSTNode rootNode){
        
        if(rootNode == null){
            return 0;
        }
        else{
            return 1 + size(left(rootNode)) + size(right(rootNode));
        }
    }
    //</editor-fold> 
    
    //<editor-fold desc="Accessor methods">
    public BSTNode root(){return root;}
    
    public BSTNode parent(BSTNode child)
    { 
        if(child.parent!=null)
            {return child.parent;}
        else{return null;}
        //reurn null;  
    }  
    
    public Iterable children(BSTNode parent){
        
        ArrayList<BSTNode> childList = new ArrayList<BSTNode>();
        
        if (parent.leftChild!=null  ||  parent.rightChild!=null) {
            if (parent.leftChild != null) {
                childList.add(parent.leftChild);
            }
            if (parent.rightChild != null) {
                childList.add(parent.rightChild);
            }
            return childList;
        } else {
            return null;
        }
    }
     //</editor-fold>
    
    //<editor-fold desc="Query methods">
    public boolean isInternal(BSTNode position){
        if (hasLeft(position)||hasRight(position)) {
            return true;
        } else {
            return false;
        }       
    }
    
    public boolean isExternal(BSTNode position){
        if (hasLeft(position)||hasRight(position)) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean isRoot(BSTNode position){
        
        if (position.parent!=null) {
            return false;
        } else {
            return true;
        }
    }
    //</editor-fold>
    
    //<editor-fold desc="Binary Tree specific methods">
    
    public BSTNode left(BSTNode position){
        
        if(hasLeft(position)){
            return position.leftChild;
        }
        else{
            return null;
        }
    }
    
    public BSTNode right(BSTNode position){
    
        if (hasRight(position)) {
            return position.rightChild;
        } else {
            return null;
        }
    }
    
    public boolean hasLeft(BSTNode position){
        if(position.leftChild!=null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean hasRight(BSTNode position){
    
        if (position.rightChild!=null) {
            return true;
        } else {
            return false;
        }
    }
    //</editor-fold>
}
