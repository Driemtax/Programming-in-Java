package Ex6;

import java.time.LocalTime;

public class Airplane {
    private String flightNumber;
    private String destination;
    private Time departureTime;

    public Airplane(String fn, String dest, String time){
        int hh = Integer.parseInt(time.substring(0, 2));
        int mm = Integer.parseInt(time.substring(3));

        this.departureTime = new Time(hh, mm);
        this.flightNumber = fn;
        this.destination = dest;
    }

    public void checkStatus(){
        if (checkDelay() == true) {
            System.out.printf("The Flight %s will start at %s to %s.\n", this.flightNumber, this.departureTime.Get_T(), this.destination);
        }
        else {
            System.out.printf("The Flight %s to %s is delayed.\n", this.flightNumber, this.destination);
        }
    }

    public boolean checkDelay(){
        LocalTime currentTime = LocalTime.now();

        return this.departureTime.Get_H() >= currentTime.getHour();
    }
}
