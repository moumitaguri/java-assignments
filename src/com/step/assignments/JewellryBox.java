package com.step.assignments;

public class JewellryBox {

    private Jewellry jewellry;
    private JewellryBox box;

    public JewellryBox(Jewellry jewellry, JewellryBox box) {
        this.jewellry = jewellry;
        this.box = box;
    }

    public JewellryBox(Jewellry jewellry) {
        this(jewellry,null);

    }

    public JewellryBox(JewellryBox box) {
        this(null,box);
    }

    public JewellryBox() {
    }

    
    public boolean hasJewellry() {
        return this.jewellry != null;
    }

    public boolean hasjewellryBox(){
        return this.box != null;
    }


    public int getjewellryCount() {
        int jewellryCount = 0;

        if (hasJewellry()) {
            jewellryCount += 1;
        }
        if(hasjewellryBox()){
            jewellryCount += this.box.getjewellryCount();
        }
        return jewellryCount;
    }

}



