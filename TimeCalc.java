// This doesn't work yet, but I'm trying to make a class that can add and subtract time in hours, minutes, and seconds.
public Class TimeCalc
{
    private int hour;
    private int mins;
    private int secs;
    private int totalSecs;

    public TimeCalc(int hour, int mins, int secs)
    {
        this.hour = hour;
        this.mins = mins;
        this.secs = secs;
    }

    

    public int 

    public void addTime(int hour, int mins, int secs)
    {
        this.hour += hour;
        this.mins += mins;
        this.secs += secs;
    }

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


}