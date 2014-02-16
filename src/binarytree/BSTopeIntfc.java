/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;
import java.util.Iterator;
/**
 *
 * @author akila
 */
public interface BSTopeIntfc {
    
        /*Generic methods*/
        public abstract boolean isEmpty();
	public abstract int size();
//	public abstract Iterator iterator();
//	public abstract Iterable positions();

	/*Accessor methods*/
	public abstract BSTNode root();
	public abstract BSTNode parent(BSTNode child);
	public abstract Iterable children(BSTNode parent);

	/*Query methods*/
	public abstract boolean isInternal(BSTNode position);
	public abstract boolean isExternal(BSTNode position);
	public abstract boolean isRoot(BSTNode position);

	/*Update metods*/
//	public abstract Object replace(Object position, Object value);
//	public abstract Object remove(Object position);

	/*Binary Tree specific methods*/
	public abstract BSTNode left(BSTNode position);
	public abstract BSTNode right(BSTNode position);
	public abstract boolean hasLeft(BSTNode position);
	public abstract boolean hasRight(BSTNode position);

	/*Traversing methods*/
//	public abstract void preOrder(Object position);
//	public abstract void postOrder(Object position);
//	public abstract void inOrder(Object position);

}
