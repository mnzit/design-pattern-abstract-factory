package com.mnzit.laptop.brand.acer.model;

import com.mnzit.laptop.brand.acer.Acer;
import com.mnzit.processor.Processor;
import com.mnzit.storage.Storage;

import java.util.List;

/**
 * @author Manjit Shakya
 */


public class AcerNitro7 extends Acer {
    private boolean gameMode;

    private boolean nitrogenCooled;

    public AcerNitro7(double displaySize, int ram, Processor processor, List<Storage> storages) {
        super(displaySize, ram, processor, storages);
        this.gameMode = true;
        this.nitrogenCooled = true;
    }

    @Override
    public String toString() {
        return super.toString() + "AcerNitro7{" +
                "gameMode=" + gameMode +
                ", nitrogenCooled=" + nitrogenCooled +
                '}';
    }
}
