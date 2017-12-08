package com.box.colbert.model;

/**
 * Created by Aidan on 12/5/2017.
 */
public class RecurringTask extends Task {
    private int streak;
    public CalendarWeek week= new CalendarWeek();
    public RecurringTask(String description,int complexity){
        super(description, complexity);
    }

    public int getSreak(){
        return streak;
    }
    public void incrementStreak(){
        streak++;
    }

    @Override
    public String toString() {

        return super.toString()+"[streak: "+streak+"] [days: "+week.toString();
    }

}
