package Ex6;

public class Time {
    private int hour;
    private int minutes;
    private String time;

    public Time(int hh, int mm){
        this.hour = hh;
        this.minutes = mm;
        this.time = Integer.toString(hh) + ":" + Integer.toString(mm);
    }

    public int Get_H(){
        return this.hour;
    }

    public int Get_M(){
        return this.minutes;
    }

    public String Get_T(){
        return this.time;
    }
}
