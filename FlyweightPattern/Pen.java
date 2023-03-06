package FlyweightPattern;

/*
 * pen interface has two method setColor and 
 */

public interface Pen {
    public void setColor(String color);

    public void draw(String content);
}

enum BrushSize {
    THIN, MEDIUM, THICK
}

class ThickPen implements Pen {

    final BrushSize brushSize = BrushSize.THICK; // intrinsic state - shareable
    private String color = null; // extrinsic state - supplied by client

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing THICK content in color : " + color);
    }
}

class ThinPen implements Pen {

    final BrushSize brushSize = BrushSize.THIN;
    private String color = null;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing THIN content in color : " + color);
    }
}

class MediumPen implements Pen {

    final BrushSize brushSize = BrushSize.MEDIUM;
    private String color = null;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing MEDIUM content in color : " + color);
    }
}