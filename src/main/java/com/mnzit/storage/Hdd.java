package com.mnzit.storage;

/**
 * @author Manjit Shakya
 */


public class Hdd extends Storage {
    public Hdd(int size) {
        super(size);
    }

    @Override
    public String toString() {
        return "HDD: "+ super.toString();
    }
}
