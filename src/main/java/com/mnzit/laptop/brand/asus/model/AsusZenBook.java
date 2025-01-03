package com.mnzit.laptop.brand.asus.model;

import com.mnzit.laptop.brand.asus.Asus;
import com.mnzit.processor.Processor;
import com.mnzit.storage.Storage;

import java.util.List;

/**
 * @author Manjit Shakya
 */


public class AsusZenBook extends Asus {


    public AsusZenBook(double displaySize, int ram, Processor processor, List<Storage> storages) {
        super(displaySize, ram, processor, storages);
        this.doubleScreen = true;
    }

    private boolean doubleScreen;

    public boolean isDoubleScreen() {
        return doubleScreen;
    }

    public void setDoubleScreen(boolean doubleScreen) {
        this.doubleScreen = doubleScreen;
    }
}
