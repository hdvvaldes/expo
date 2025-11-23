package mx.unam.ciencias.expo.test;

import java.util.LinkedList;
import java.util.Random;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import mx.unam.ciencias.expo.binaryTree.BinaryTree;

/**
 * Unit Test for the class{@link BinaryTree}.
 */
public class TestBinaryTree {

    
    private Random random = new Random();

    /* Upper Bound to generate a random int */
    private int upperBound = 100;


    /** Expiration rule */
    @Rule 
    public Timeout timeout = Timeout.seconds(5);

    /** Testing Constructor*/
    
    /* Test empty constructor */

    @Test
    public void testEmptyConstructor() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Assert.assertTrue(tree.isEmpty());
        Assert.assertEquals(0, tree.size());
    }
    
    /* Test constructor with elements */


    @Test
    public void testConstructorWithElements() {
        LinkedList<Integer> list = new LinkedList<>();
        int n = getRandomInt();
        for(int i = 0; i < n; ++i)
            list.add(i);
        BinaryTree<Integer> tree = new BinaryTree<>(list);
        Assert.assertTrue(tree.size() == n);
        LinkedList<Integer> orderTester = new LinkedList<>();
        for(Integer i: tree) 
            orderTester.add(i);
        Assert.assertTrue(list.equals(orderTester));
    }

    @Test 
    public void testAdd() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        int expectedSize = getRandomInt();
        for(int i = 0; i < expectedSize; ++i){
            Assert.assertTrue(tree.size() == i);
            int element = getRandomInt();
            tree.add(element);
            Assert.assertTrue(tree.contains(element));
        }
        Assert.assertTrue(tree.size() == expectedSize);
    }

    @Test
    public void testRemove() {
        LinkedList<Integer> list = new LinkedList<>();
        int n = getRandomInt();
        for(int i = 0; i < n; i++) {
            int element = getRandomInt();
            while(list.contains(element))
                element = getRandomInt();
            list.add(element);
        }
        BinaryTree<Integer> tree = new BinaryTree<>(list);
        while(!list.isEmpty()) { 
            boolean alternate = true;
            int element = -1;
            if(alternate)
                element =list.removeFirst();
            else 
                element = list.removeLast();
            Assert.assertTrue(tree.contains(element));
            tree.remove(element);
            Assert.assertFalse(tree.contains(element));
        }

    }

    private int getRandomInt() {
        return random.nextInt(upperBound);
    }

}
