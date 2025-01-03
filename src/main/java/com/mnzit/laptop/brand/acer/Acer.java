package com.mnzit.laptop.brand.acer;

import com.mnzit.laptop.Laptop;
import com.mnzit.processor.Processor;
import com.mnzit.storage.Storage;

import java.util.List;

/**
 * @author Manjit Shakya
 */


public class Acer extends Laptop {

    public Acer() {
    }

    public Acer(int ram, Processor processor, List<Storage> storages) {
        super(ram, processor, storages);
    }

    public Acer(double displaySize, int ram, Processor processor, List<Storage> storages) {
        super(displaySize, ram, processor, storages);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
