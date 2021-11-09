package com.company;

public class ClothesAdapterFromCheckeredClothes extends CheckeredClothes implements ClothesInterface {
    public void putOnSweater() {
        putOnCheckeredSweater();
    }

    public void putOnScarf() {
        putOnCheckeredScarf();
    }
}
