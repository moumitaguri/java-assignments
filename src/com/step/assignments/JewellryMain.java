package com.step.assignments;

public class JewellryMain {

    public static void main(String[] args) {

        Jewellry jewellry1 = new Jewellry("Golden Ring");

        Jewellry jewellry2 = new Jewellry("Diamond Ring");
        Jewellry jewellry3 = new Jewellry("Diamond necklace");
        Jewellry jewellry4 = new Jewellry("Golden Pendant");


        JewellryBox jewellryBox1 = new JewellryBox(jewellry1);
        JewellryBox jewellryBox2 = new JewellryBox(jewellry2,jewellryBox1);
        JewellryBox jewellryBox3 = new JewellryBox(jewellry3, jewellryBox2);
        JewellryBox jewellryBox4 = new JewellryBox(jewellry4, jewellryBox3);

        JewellryBox jewellryBox5 = new JewellryBox(jewellryBox4);
        JewellryBox jewellryBox6 = new JewellryBox();


        System.out.println("jewellryBox1.getjewellryCount() = " + jewellryBox1.getjewellryCount());
        System.out.println("jewellryBox2.getjewellryCount() = " + jewellryBox2.getjewellryCount());
        System.out.println("jewellryBox3.getjewellryCount() = " + jewellryBox3.getjewellryCount());
        System.out.println("jewellryBox4.getjewellryCount() = " + jewellryBox4.getjewellryCount());
        System.out.println("jewellryBox5.getjewellryCount() = " + jewellryBox5.getjewellryCount());
        System.out.println("jewellryBox6.getjewellryCount() = " + jewellryBox6.getjewellryCount());

    }
}
