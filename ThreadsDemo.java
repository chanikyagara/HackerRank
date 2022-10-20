
public class ThreadsDemo {
    
public static void main(String[] args) {
    int n = 8; // Number of threads
    // Implement multi threading by extending thread class.
    for (int i = 0; i < n; i++) {
        MultithreadingDemo object = new MultithreadingDemo();
        object.start();
    }
// Implement multi threading by implementing runnable Interface.
    for (int i = 0; i < n; i++) {
        Thread object1
	                = new Thread(new RunnableThread());
	            object1.start();
        object1.start();
    }
}
    
}