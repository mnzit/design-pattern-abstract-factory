package com.mnzit.laptop.factory;

import com.mnzit.laptop.Laptop;
import com.mnzit.processor.Processor;
import com.mnzit.storage.Storage;

import java.util.List;

/**
 * @author Manjit Shakya
 */


public interface BrandLaptopFactory {

     Laptop manufacture(String model, int ram, double displaySize, Processor processor, List<Storage> storages);
}
