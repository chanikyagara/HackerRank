

import java.util.ArrayList;
import java.util.List;

public class PetrolPump {
    public static void main(String[] args) {
        List<List<Integer>> petrolPump = new ArrayList<>();
        petrolPump.add(List.of(1,5));
        petrolPump.add(List.of(10,3));
        petrolPump.add(List.of(7,4));
        System.out.println("pp: "+ petrolPump);
        int tank = petrolPumpImpl(petrolPump);
        System.out.println(tank);
    }
    public static int petrolPumpImpl(List<List<Integer>> petrolpumps){
        final int size = petrolpumps.size();
    
    for (int start = 0; start < size; start++) {
        if (petrolpumps.get(start).get(0) < petrolpumps.get(start).get(1)) continue;
        
        long tank = 0;
        int position = start;
        int pumpCount = 0;
        
        while (true) {
            if (pumpCount == size) return start; // all pumps has been visited
            if (tank < 0) break;                 // not enough petrol to move further

            tank += petrolpumps.get(position % size).get(0) - petrolpumps.get(position % size).get(1);
            
            position++;
            pumpCount++;
        }
    }
    return -1;
    }
}
