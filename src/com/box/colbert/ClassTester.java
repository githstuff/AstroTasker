package com.box.colbert;


import com.box.colbert.model.RecurringTask;
import com.box.colbert.model.Task;

/**
 * Created by Aidan on 12/5/2017.
 */
public class ClassTester {
    public static void main(String[] args){
        Task myTask = new Task("Do Something",1);
        System.out.println(myTask.toString());
        RecurringTask myRecurring = new RecurringTask("Make Bed",2);
        System.out.println(myRecurring);
        System.out.println("Sunday was: "+myRecurring.week.isDayTrue("Sunday"));
        myRecurring.week.toggleDay("Sunday");
        System.out.println("Sunday is now "+ myRecurring.week.isDayTrue("Sunday"));
        System.out.println("Should cause error: "+myRecurring.week.isDayTrue("day"));

    }
}
