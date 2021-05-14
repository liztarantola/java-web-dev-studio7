package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD cd = new CD("Led Zeppelin", 700, "CD-RW", 350);
        DVD dvd = new DVD("The Breakfast Club", 5000, "DVD-R", 1450);

        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        System.out.println(cd.writeData(275));
        System.out.println(cd.diskInfo());

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
