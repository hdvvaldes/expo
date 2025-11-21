package mx.unam.ciencias.expo.binaryTree;


public interface BinaryTreeNode<T>{
    
    public BinaryTreeNode<T> left();

    public BinaryTreeNode<T> right();

    public BinaryTreeNode<T> parent(); 
    
    public T get();

}
