package mx.unam.ciencias.expo.binaryTree;

import java.util.LinkedList;
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
    
    private Node root;

    protected int elements;

    public BinaryTree() {}


    /**
     * Construye un árbol binario a partir de una colección. El árbol binario
     * tendrá los mismos elements que la colección recibida.
     * @param coleccion la colección a partir de la cual creamos el árbol
     *        binario.
     */
    public BinaryTree(Iterable<T> iterable) {
        for(T t:iterable)
            add(t);
    }

    protected Node newNode(T element) {
        return new Node(element);
    }

    public int size() {
        return elements;
    }

    public int getElements() {
        return elements;
    }

    public boolean contains(T element) {
        return find(element) != null;
    }

    public void add(T element) {
        if(element == null)
            throw new IllegalArgumentException("element null");
        if(isEmpty())
            root = newNode(element);
        else {
            String b = binaryNumber(elements+1);
            Node r = incompleteNode(b), 
                    v = newNode(element) ;
            v.parent = r;
            if((elements&1) == 0)
                r.right = v;
            else 
                r.left = v;
        }
        elements++;
    }

    public void remove(T element) {
        Node v = (Node)find(element);
        Node u = incompleteNode(binaryNumber(elements));
        if(v == null)
            return;
        if(elements-- == 1)
            root = null;
        else if((elements&1) == 1){
            v.element = u.left.element;
            u.left.parent = null;
            u.left = null;
        } else {
            v.element = u.right.element;
            u.right.parent = null;
            u.right = null;
        }
    }


    public BinaryTreeNode<T> find(T element) {
        if(isEmpty()||element == null)
            return null;
        LinkedList<BinaryTreeNode<T>> queue = new LinkedList<>();
        BinaryTreeNode<T> v;
        queue.addFirst(root);
        while (!queue.isEmpty()) {
            v = queue.removeLast();
            if(v.get().equals(element))
                return v;
            if(v.left() != null)
                queue.addFirst(v.left());
            if(v.right() != null)
                queue.addFirst(v.right());
        }
        return null;
    }

    public BinaryTreeNode<T> root() {
        if(isEmpty())
            throw new NoSuchElementException("El arbol es vacio");
        return root;
        
    }

    public boolean isEmpty() {
        return elements == 0;
    }

    public void clean() {
        root = null;
        elements = 0;
    }

    private String binaryNumber(int n){
        String b = "";
        while (n > 0) {
            b = (n&1) + b;
            n = n >> 1;
        }
        return b;
    }

    private Node incompleteNode(String s){
        if(isEmpty())
            return null;
        Node v = root;
        for(int i = 1; i < s.length()-1; i++)
            if(s.charAt(i) == '1')
                v = v.right;
            else 
                v = v.left;
        return v;
    }




}
