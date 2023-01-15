// This doesn't work yet, but I'm trying to make a class that can add and subtract time in hours, minutes, and seconds.
public class TimeCalc
{

    public static String addTime(int h1, int m1, double s1, int h2, int m2, double s2)
    {
        double time1 = h1*3600 + m1*60 + s1;
        double time2 = h2*3600 + m2*60 + s2;
        double totalSecs = time1+time2;
        double hours = ((int)totalSecs)/3600;
        totalSecs %= 3600;
        double mins = ((int)totalSecs)/60;
        totalSecs %= 60;
        double secs = Math.round(totalSecs*100);
        secs /= 100;
        return ((int)hours + " hours, " + (int)mins + " minutes, and " + secs + " seconds.");
    }

    /* 
    public void subtractTime(int hour, int mins, int secs)
    {
        this.hour -= hour;
        this.mins -= mins;
        this.secs -= secs;
    }

    private int toSeconds()
    {
        totalSecs = (hour * 3600) + (mins * 60) + secs;
        return totalSecs;
    }
    */

}