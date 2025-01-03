package com.mnzit;

import com.mnzit.laptop.Laptop;
import com.mnzit.laptop.factory.LaptopFactory;
import com.mnzit.processor.intel.version.IntelI5;
import com.mnzit.processor.intel.version.IntelI7;
import com.mnzit.storage.Hdd;
import com.mnzit.storage.Ssd;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        LaptopFactory laptopFactory = new LaptopFactory();

        Laptop laptop = laptopFactory.manufacture("acer", "Nitro7", 32, 15.6, new IntelI7(), List.of(new Ssd(1024)));
        System.out.println(laptop);
        Laptop laptop2 = laptopFactory.manufacture("asus", "ZenBook", 16, 14, new IntelI5(), List.of(new Hdd(1024), new Ssd(128)));
        System.out.println(laptop2);
    }
}
