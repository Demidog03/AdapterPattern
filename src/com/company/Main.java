package com.company;

public class Main {

    public static void main(String[] args) {
        ClothesInterface clothes1 = new ClothesAdapterFromCheckeredClothes();
        ClothesInterface clothes2 = new ClothesAdapterFromPottedClothes();

        clothes1.putOnSweater();
        clothes1.putOnScarf();
        clothes2.putOnSweater();
        clothes2.putOnScarf();
    }
}
