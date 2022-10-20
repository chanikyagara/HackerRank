

public class GarbageCollector {
    public static void main(String[] args) {
        InnerGarbageCollector i = new InnerGarbageCollector();
    // 1st way: 
        // by unreferencing the object by assigning null. SO that it is available for garabage collection.
        i = null; 
    // 2nd way:
        // by assigning reference to another. so that i1 is available for GC.
        InnerGarbageCollector i1 = new InnerGarbageCollector();
        InnerGarbageCollector i2 = new InnerGarbageCollector();
        i1 = i2;
    // 3rd way:
        // by creating anonymous objevct. 
        new InnerGarbageCollector();
        System.gc(); // Forcing to execute garbage collection
        // InnerGarabageCollector class have finalize() method which will execute before the 
        //garabage collection for clean up process.
        System.out.println(i+""+i1);
    }
}

