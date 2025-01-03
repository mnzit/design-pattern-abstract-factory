package com.mnzit.laptop.brand.acer.factory;

import com.mnzit.laptop.Laptop;
import com.mnzit.laptop.brand.acer.model.AcerNitro7;
import com.mnzit.laptop.factory.BrandLaptopFactory;
import com.mnzit.processor.Processor;
import com.mnzit.storage.Storage;

import java.util.List;

/**
 * @author Manjit Shakya
 */


public class AcerLaptopFactory implements BrandLaptopFactory {

    @Override
    public Laptop manufacture(String model, int ram, double displaySize, Processor processor, List<Storage> storages) {

        if (model.equals("Nitro7")) {
            return new AcerNitro7(displaySize, ram, processor, storages);
        }

        return null;
    }
}
