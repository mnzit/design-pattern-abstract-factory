package com.mnzit.laptop.brand.asus;

import com.mnzit.laptop.Laptop;
import com.mnzit.processor.Processor;
import com.mnzit.storage.Storage;

import java.util.List;

/**
 * @author Manjit Shakya
 */


public class Asus extends Laptop {

    public Asus() {
    }

    public Asus(int ram, Processor processor, List<Storage> storages) {
        super(ram, processor, storages);
    }

    public Asus(double displaySize, int ram, Processor processor, List<Storage> storages) {
        super(displaySize, ram, processor, storages);
    }
}
