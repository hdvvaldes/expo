package mx.unam.ciencias.expo.binaryTree;

import java.util.NoSuchElementException;


public class BinaryTree<T> {

    protected class Node implements BinaryTreeNode<T> {
        
        protected T element;
            
        protected Node parent, left, right;

        /**
         * Constructor único que recibe un element.
         * @param element el element del vértice.
         */
        protected Node(T element) {
            if (element == null)
                throw new IllegalArgumentException();
            this.element = element;
        }

        @Override
        public BinaryTreeNode<T> parent() {
            if (parent == null) {
                throw new NoSuchElementException();
            }
            return parent;
        }

        @Override
        public BinaryTreeNode<T> left() {
            if (left == null) {
                throw new NoSuchElementException();
            }
            return left;
        }

        @Override
        public BinaryTreeNode<T> right() {
            if (right == null) {
                throw new NoSuchElementException();
            }
            return right;
        }


        @Override
        public T get() {
            return element;
        }

        @Override
        public boolean equals(Object object) {
            if (object == null || getClass() != object.getClass())
                return false;
            @SuppressWarnings("unchecked") Node Node = (Node) object;
            if (!element.equals(Node.element))
                return false;
            boolean leftEquals = (left == null && Node.left == null) || 
                                (left != null && left.equals(Node.left));
            boolean rightEquals = (right == null && Node.right == null) || 
                                (right != null && right.equals(Node.right));
            return leftEquals && rightEquals;
        }

        @Override
        public String toString() {
            return element.toString();
        }
    }


}
