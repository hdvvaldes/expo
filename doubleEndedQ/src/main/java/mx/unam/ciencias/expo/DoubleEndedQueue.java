package mx.unam.ciencias.expo;


public class DoubleEndedQueue<T> {

    public interface BodyDoubleEndedQueue<T> {

        /*
         * Inserts an element into the double ended queue.
         * @param t the element to insert.
         *
         */
        public void put(T t);

        /*
         * Removes and returns the minimum element in the double ended queue.
         * @return the minimum element in the double ended queue.
         *
         */
        public T removeMin();

        /*
         * Removes and returns the maximum element in the double ended queue.
         * @return the maximum element in the double ended queue.
         *
         */
        public T removeMax();
        /*
         * Returns the minimum element in the double ended queue.
         * @return the minimum element in the double ended queue.
         *
         */
        public T getMin();

        /*
         * Returns the maximum element in the double ended queue.
         * @return the maximum element in the double ended queue.
         *
         */
        public T getMax();

    }
    
    /* Fields */

    private BodyDoubleEndedQueue<T> body;

    public DoubleEndedQueue(BodyDoubleEndedQueue<T> body) {
        this.body = body;

    }

    public DoubleEndedQueue() {
        this.body = null;
    }


    /**********  Methods ************/    
    
    /*
     * Returns the minimum element in the double ended queue.
     * @return the minimum element in the double ended queue.
     *
     */
    public T getMin() { 
        return body.getMin(); 
    }

    /*
     * Returns the maximum element in the double ended queue.
     * @return the maximum element in the double ended queue.
     *
     */
    public T getMax() { 
        return body.getMax(); 
    }

    /*
     * Inserts an element into the double ended queue.
     * @param t the element to insert.
     *
     */
    public void put(T t){
        body.put(t);
    }

    /*
     * Removes and returns the minimum element in the double ended queue.
     * @return the minimum element in the double ended queue.
     *
     */
    public T removeMin() {
        return body.removeMin();
    }

    /*
     * Removes and returns the maximum element in the double ended queue.
     * @return the maximum element in the double ended queue.
     *
     */
    public T removeMax(){
        return body.removeMax();
    }

}
