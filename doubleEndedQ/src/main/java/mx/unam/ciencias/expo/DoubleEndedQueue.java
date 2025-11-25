package mx.unam.ciencias.expo;

public abstract class DoubleEndedQueue<T extends Comparable<T>> {

    /* Fields */

    private T min, max;

    private int elements;

    /**********  Methods ************/    
    
    /*
     * Returns the minimum element in the double ended queue.
     * @return the minimum element in the double ended queue.
     *
     */
    public T getMin() { 
        return min;
    }

    /*
     * Returns the maximum element in the double ended queue.
     * @return the maximum element in the double ended queue.
     *
     */
    public T getMax() { 
        return max;
    }

    /* Returns the elements in the DEPQ 
     * 
     * @return the elements in the DEPQ
     */
    public int size() {
        return elements;
    }


    /*
     * Inserts an element into the double ended queue.
     * @param t the element to insert.
     *
     */
    public abstract void put(T t);

    /*
     * Removes and returns the minimum element in the double ended queue.
     * @return the minimum element in the double ended queue.
     *
     */
    public abstract T removeMin();

    /*
     * Removes and returns the maximum element in the double ended queue.
     * @return the maximum element in the double ended queue.
     *
     */
    public abstract T removeMax();

}
