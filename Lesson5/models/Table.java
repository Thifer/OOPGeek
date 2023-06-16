package Lesson5.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private static int counter = 100;

    public int getNo() {
        return no;
    }


    private final int no;

    private final Collection<Reservation> reservations = new ArrayList<>();

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    {
        no = ++counter;
    }

    public void deleteOldReservation(int resId){
        for (Reservation res: reservations) {
            if(resId==res.getId()){
                reservations.remove(res);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Столик #%d", no);
    }
}
