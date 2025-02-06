package samples;

import java.util.*;

public class Floor {
    //int[10] parkingSlots = new int[];
    //List<String> parkingSlot = new ArrayList<>();
    String number;
    //int[] parkingSlot = new int[10];
    Map<String, List<String>> floorparking = new HashMap<>();
    public void Floor() {
        floorparking.put("Floor1", new ArrayList<>());
        floorparking.put("Floor2", new ArrayList<>());
    }


    public void addVehicle( String floorNumber,String number) {
        //long count = parkingSlot.size();
        if(floorparking.isEmpty()) {
            floorparking.get.add(number);
            floorparking.put(floorNumber, parkingSlot);
        }

        for(Map.Entry<String, List<String>> entry:floorparking.entrySet()) {
            int size = entry.getValue().size();
            if(size==10) {
                System.out.println("Parking is full");
            } else {
                entry.getValue().add(number);
                floorparking.put(entry.getKey(), entry.getValue());
                System.out.println("Parking is alloted");
            }
        }
    }

    public Integer getParkingSlotSize() {
        return parkingSlot.size();
    }



}
