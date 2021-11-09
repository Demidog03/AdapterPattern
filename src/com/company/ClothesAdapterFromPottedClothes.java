package com.company;

public class ClothesAdapterFromPottedClothes extends PottedClothes implements ClothesInterface{
    public void putOnSweater() {
        putOnPottedSweater();
    }

    public void putOnScarf() {
        putOnPottedScarf();
    }
}
