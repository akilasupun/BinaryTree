/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;

/**
 *
 * @author akila
 */
public class BSTNode {

    /**
     * fields specific to books
     */
    protected String bookName = "";
    protected String authorFirstName = "";
    protected String authorSurname = "";
    protected int isbn;
    
    /**
     * fields specific to node
     */
    protected BSTNode parent;
    protected BSTNode leftChild, rightChild;
    
    /**
     * constructors
     */
    public BSTNode(){}
    
    public BSTNode(String bookName){
        this.bookName = bookName;
    }
    
    public BSTNode(int isbn){
        this.isbn = isbn;
    }
    
    public BSTNode(String bookName, String authorFirstName, String authorSurename, int isbn){
        this.bookName = bookName;
        this.authorFirstName = authorFirstName;
        this.authorSurname = authorSurename;
        this.isbn = isbn;
    }
}
