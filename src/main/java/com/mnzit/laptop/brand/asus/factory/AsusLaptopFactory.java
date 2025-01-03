package com.mnzit.laptop.brand.asus.factory;

import com.mnzit.laptop.Laptop;
import com.mnzit.laptop.brand.asus.model.AsusZenBook;
import com.mnzit.laptop.factory.BrandLaptopFactory;
import com.mnzit.processor.Processor;
import com.mnzit.storage.Storage;

import java.util.List;

/**
 * @author Manjit Shakya
 */


public class AsusLaptopFactory implements BrandLaptopFactory {

    @Override
    public Laptop manufacture(String model, int ram, double displaySize, Processor processor, List<Storage> storages) {

        if (model.equals("ZenBook")) {
            return new AsusZenBook(displaySize, ram, processor, storages);
        }

        return null;
    }
}
