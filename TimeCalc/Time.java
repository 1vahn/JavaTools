package TimeCalc;

public class Time {
    private int hour;
    private int mins;
    private double secs;


    public Time(int hour, int mins, int secs, int milliseconds) {
        this.hour = hour;
        this.mins = mins;
        this.secs = secs;

    }

    public Time(int hour, int mins, double secs) {
        this.hour = hour;
        this.mins = mins;
        this.secs = secs;
    }

    public String toString()
    {
        if ((hour != 0) && (mins != 0))
        return (hour + " hours, " + mins + " minutes, and " + secs + " seconds.");

        else if ((hour == 0)&&(mins != 0))
        return (mins + " minutes, and " + secs + " seconds.");

        else if ((hour == 0)&&(mins == 0))
        return Double.toString(secs)+ " seconds.";

        else return (hour + " : " + mins + " : " + secs );
    }

    public Time addTime(Time timeIn)
    {
        double time1 = this.hour*3600 + this.mins*60 + this.secs;
        double time2 = timeIn.hour*3600 + timeIn.mins*60 + timeIn.secs;
        double totalSecs = time1+time2;
        double hours = ((int)totalSecs)/3600;
        totalSecs %= 3600;
        double mins = ((int)totalSecs)/60;
        totalSecs %= 60;
        double secs = Math.round(totalSecs*100);
        secs /= 100;
        return new Time((int)hours, (int)mins, secs);
    }

    public Time subtractTime(Time timeIn)
    {
        double time1 = this.hour*3600 + this.mins*60 + this.secs;
        double time2 = timeIn.hour*3600 + timeIn.mins*60 + timeIn.secs;
        double totalSecs = time1-time2;
        double hours = ((int)totalSecs)/3600;
        totalSecs %= 3600;
        double mins = ((int)totalSecs)/60;
        totalSecs %= 60;
        double secs = Math.round(totalSecs*100);
        secs /= 100;
        return new Time((int)hours, (int)mins, secs);
    }


    
}
