package com.mycompany.agency;

public class Staff {

    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff() {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        ((Executive) staffList[0]).awardBonus(500.00);
        ((Intern) staffList[1]).pay(0.00);
        ((StaffEmployee) staffList[2]).pay(7.25);
        ((TempEmploee) staffList[3]).addHours(40);
        ((StaffEmployee) staffList[4]).pay(10.50);
        ((StaffEmployee) staffList[5]).pay(12.75);
        ((StaffEmployee) staffList[6]).pay(15.00);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0) {
                System.out.println("Thanks!");
            } else {
                System.out.println("Paid: " + amount);
            }

            System.out.println("-----------------------------------");
        }
    }
}
