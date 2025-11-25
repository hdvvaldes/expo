package mx.unam.ciencias.expo.test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import mx.unam.ciencias.expo.DoubleEndedQueue;
import mx.unam.ciencias.expo.binaryTree.BinaryTree;
import mx.unam.ciencias.expo.implementations.SymmetricMMHeap;

/**
 * Unit Test for the class{@link BinaryTree}.
 */
public class TestSMMH {

    private Random random = new Random();

    /* Upper Bound to generate a random int */
    private int sizeBound = 100;
    
    private int elementBound = 1000;

    /** Expiration rule */
    @Rule 
    public Timeout timeout = Timeout.seconds(5);


    /** Testing Constructor*/
    
    /* Test constructor with elements */

    @Test
    public void testConstructorWithElements() {
        int n = random.nextInt(sizeBound);
        Set<Integer> set = new HashSet<>();
        while(set.size() < n)
            set.add(random.nextInt(elementBound));
        SymmetricMMHeap<Integer> smmhh = new SymmetricMMHeap<>(set);
        Assert.assertTrue(depq.size() == n);
        validDPQueue(depq);
    }

    @Test
    public void testAdd() {
        

    }

    @Test
    public void testRemove() {

    }

    @Test 
    public void testAdd() {
        SymmetricMMHeap<Integer> depq = new SymmetricMMHeap<>();
        int expectedSize = getRandomInt();
        for(int i = 0; i < expectedSize; ++i){
            Assert.assertTrue(depq.size() == i);
            int element = getRandomInt();
            depq.add(element);
            Assert.assertTrue(depq.contains(element));
            validDPQueue(depq)
        }
        Assert.assertTrue(depq.size() == expectedSize);
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
