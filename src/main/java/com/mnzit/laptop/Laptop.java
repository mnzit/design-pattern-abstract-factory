package com.mnzit.laptop;

import com.mnzit.processor.Processor;
import com.mnzit.storage.Storage;

import java.util.List;

/**
 * @author Manjit Shakya
 */

public class Laptop {

    private double displaySize;
    private int ram;
    private Processor processor;
    private List<Storage> storages;

    public Laptop() {
    }

    public Laptop(int ram, Processor processor, List<Storage> storages) {
        this.ram = ram;
        this.processor = processor;
        this.storages = storages;
    }

    public Laptop(double displaySize, int ram, Processor processor, List<Storage> storages) {
        this.displaySize = displaySize;
        this.ram = ram;
        this.processor = processor;
        this.storages = storages;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public List<Storage> getStorages() {
        return storages;
    }

    public void setStorages(List<Storage> storages) {
        this.storages = storages;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "displaySize=" + displaySize +
                ", ram=" + ram +
                ", processor=" + processor +
                ", storages=" + storages +
                '}';
    }
}
