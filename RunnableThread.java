public class RunnableThread implements Runnable {
    // Implement multi threading by implementing runnable Interface.
        public void run()
        {
            try {
                // Displaying the thread that is running
                System.out.println(
                    "Runnable Thread " + Thread.currentThread().getId()
                    + " is running");
            }
            catch (Exception e) {
                // Throwing an exception
                System.out.println("Exception is caught");
            }
        }
    
}
