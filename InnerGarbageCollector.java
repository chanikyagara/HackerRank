public class InnerGarbageCollector {

    InnerGarbageCollector(){
        System.out.println("Object is created");
    }
    @Override
    protected void finalize() throws Throwable {
        // super.finalize();
        System.out.println("Object is destroyed");
    }
}