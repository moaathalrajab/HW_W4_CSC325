package com.mycompany.agency;


    //TODO 1: Make StaffEmployee a child of StaffMember--DONE

public class StaffEmployee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    //  TODO 2: Sets up this staff employee with the specified
    //  information.--DONE
    //-----------------------------------------------------------------
    public StaffEmployee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone);

        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //-----------------------------------------------------------------
    // TODO 3: complete the implementation of toString to return information 
    //          about a staff employee as a string.--DONE
    //-----------------------------------------------------------------
    @Override    
    public String toString()
    {
        return "StaffEmployee{" + "socialSecurityNumber=" + socialSecurityNumber + ", payRate=" + payRate + '}';
       
    }

    //-----------------------------------------------------------------
    // TODO 4:  Returns the pay rate for this staff employee.--DONE
    //-----------------------------------------------------------------
    public double pay() {
        return payRate;
    }
}
