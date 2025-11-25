package mx.unam.ciencias.expo.test;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import mx.unam.ciencias.expo.DoubleEndedQueue;
import mx.unam.ciencias.expo.implementations.SymmetricMMHeap;

/**
 * Unit Test for the class{@link DoubleEndedQueue}.
 */
public class TestDPQueue {

    private Random random = new Random();

    /* Upper Bound to generate a random int */
    private int elementsBound = 1000;

    private int sizeBound = 100;
    
    /** Expiration rule */
    @Rule 
    public Timeout timeout = Timeout.seconds(5);

    public<T extends Comparable<T>> void 
        validDPQueue(DoubleEndedQueue<T> depq) {
            
            /* TODO 
             * unit testing for a general dpeq
             *
             * */

    }



}
