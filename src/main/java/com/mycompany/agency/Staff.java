package com.mycompany.agency;

public class Staff {

    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff() {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList --DONE
        staffList[0] = new Executive("Jayson", "CSC325", "000-000-0001", "000-00-0001", 1.00);
        ((Executive) staffList[0]).awardBonus(500.00);
        staffList[1] = new Intern("Nick", "CSC325", "000-000-0000");
        ((Intern) staffList[1]).pay();
        staffList[2] = new StaffEmployee("Crain", "CSC325", "000-000-0002", "000-00-0002", 2.00);
        ((StaffEmployee) staffList[2]).pay();
        staffList[3] = new TempEmploee("Vasquez", "CSC325", "000-000-0003", "000-00-0003", 1.25);
        ((TempEmploee) staffList[3]).addHours(40);
        staffList[4] = new StaffEmployee("Steve", "CSC325", "000-000-0004", "000-00-0004", 9999.99);
        ((StaffEmployee) staffList[4]).pay();
        staffList[5] = new StaffEmployee("Mazen", "CSC325", "000-000-0005", "000-00-0005", 0.50);
        ((StaffEmployee) staffList[5]).pay();
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
