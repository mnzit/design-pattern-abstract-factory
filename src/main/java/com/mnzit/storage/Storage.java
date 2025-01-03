package com.mnzit.storage;

/**
 * @author Manjit Shakya
 */


public class Storage {

    private int size;

    public Storage(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "size=" + size +
                '}';
    }
}
