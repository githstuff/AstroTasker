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

    @Override
    public String toString() {

        return super.toString()+"[streak: "+streak+"] [days: "+week.toString();
    }

}
