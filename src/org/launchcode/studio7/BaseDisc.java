package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private String discType;
    private int remainingCapacity;
    private int capacityUsed;
    private ArrayList<String> contents;

    public BaseDisc(String name, int storageCapacity, String discType, int capacityUsed) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.discType = discType;
        this.remainingCapacity = spaceLeft();
        this.capacityUsed = checkCapacity(capacityUsed);

    }

    private int checkCapacity(int dataWritten) {
        if (storageCapacity < dataWritten) {
            return storageCapacity;
        }
        return dataWritten;
    }

    private int spaceLeft() {
        return storageCapacity - capacityUsed;
    }

    public String diskInfo() {
        String output = String.format("\nDisk name: %s\nMax capacity: %d" +
                "\nSpace used: %d" +
                "\nAvailable space: %d\n", name, storageCapacity, capacityUsed, remainingCapacity);
        return output;
    }

    public String writeData(int dataSize) {
        if (dataSize > remainingCapacity) {
            return "Not enough disk space";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;

        return "Data written to disc. Remaining space = " + remainingCapacity;
    }
}



