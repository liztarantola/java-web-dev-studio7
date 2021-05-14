package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String aName, int aStorageCapacity, String aDiskType, int aCapacityUsed) {
        super(aName, aStorageCapacity, aDiskType, aCapacityUsed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at the rate of 200-500 RPM.");
    }

    @Override
    public void readData() {
        System.out.println("Your time is gonna come");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
