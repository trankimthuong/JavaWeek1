package stopwatch;

import java.util.Date;

public class StopWatch {
    private double startTime, endTime;

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void start(){
        this.startTime = new Date().getTime();
    }
    public void stop(){
        this.endTime = new Date().getTime();
    }

    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
