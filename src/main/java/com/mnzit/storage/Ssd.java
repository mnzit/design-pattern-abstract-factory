package com.mnzit.storage;

/**
 * @author Manjit Shakya
 */


public class Ssd extends Storage{
    public Ssd(int size) {
        super(size);
    }

    @Override
    public String toString() {
        return "SSD: "+super.toString();
    }
}
