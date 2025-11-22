package mx.unam.ciencias.expo.binaryTree;


public interface BinaryTreeNode<T>{
    
    /*
     * Returns the left son of the current node.
     *
     * @return BinaryTreeNode representing left son
     *
     */
    public BinaryTreeNode<T> left();

    /*
     * Returns the right son of the current node.
     *
     * @return BinaryTreeNode representing right son
     *
     */
    public BinaryTreeNode<T> right();

    /*
     * Returns the parent of the current node.
     *
     * @return BinaryTreeNode representing parent
     *
     */
    public BinaryTreeNode<T> parent(); 
    
    /*
     * Returns the element contained in the current node.
     *
     * @return T element contained in the node
     *
     */

    public T get();

}
