package com.mycompany.agency;

    // TODO 1: Make TempEmploee a child of StaffEmploee --DONE

public class TempEmploee extends StaffEmployee
{
    private int hoursWorked;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this hourly employee using the specified
    //  information.
    //-----------------------------------------------------------------
    public TempEmploee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        hoursWorked = 0;
    }

    //-----------------------------------------------------------------
    // TODO2: Adds the specified number of hours to this employee's
    //  accumulated hours. --DONE
    //-----------------------------------------------------------------
    public void addHours(int moreHours)
    {
        hoursWorked += moreHours;
    }

    //-----------------------------------------------------------------
    // TODO3: Computes and returns the pay for this hourly employee. --DONE
    //-----------------------------------------------------------------
    @Override
    public double pay()
    {
        //Calculate the amount this employee is owed.
        double pay = hoursWorked * payRate;
        //Reset hoursWorked so that they aren't paid for the same hours a second time.
        hoursWorked = 0;
        
        return pay;

    }

    //-----------------------------------------------------------------
    // TODO4: Returns information about this hourly employee as a string. --DONE
    //-----------------------------------------------------------------

    @Override
    public String toString() {
        return String.format("Name: %s Address: %s Phone: %s Social Security Number: %s Pay Rate: %f Hours Worked: %d", super.name, super.address, super.phone, socialSecurityNumber, payRate, hoursWorked);
    }
    
}
