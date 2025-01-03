package com.mnzit.laptop.factory;

import com.mnzit.laptop.Laptop;
import com.mnzit.laptop.brand.acer.factory.AcerLaptopFactory;
import com.mnzit.laptop.brand.asus.factory.AsusLaptopFactory;
import com.mnzit.processor.Processor;
import com.mnzit.storage.Storage;

import java.util.List;

/**
 * @author Manjit Shakya
 */


public class LaptopFactory {

    public Laptop manufacture(String name, String model, int ram, double displaySize, Processor processor, List<Storage> storages) {
        BrandLaptopFactory laptopFactory = null;

        if (name.equals("asus")) {
            laptopFactory = new AsusLaptopFactory();
        } else if (name.equals("acer")) {
            laptopFactory = new AcerLaptopFactory();
        }

        if (laptopFactory != null) {
            return laptopFactory.manufacture(model, ram, displaySize, processor, storages);
        }

        throw new NullPointerException("BrandNotFound");
    }
}
