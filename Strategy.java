public class Strategy {

    public static void main(String[] args) {
        /*
         * this object output is created by conditional statement
         */
        // condition
        BadPaintBrush bbrush = new BadPaintBrush();
        bbrush.doPaint(1);

        //
        /*
         * this object output is created by class
         */
        GoodPaintBrush gbrush = new GoodPaintBrush();
        gbrush.paint = new RedPaint();
        gbrush.doPaint();
    }
}

class BadPaintBrush {
    public void doPaint(int i) {
        if (i == 1) {
            System.out.println("red colour...");
        } else if (i == 2) {
            System.out.println("blue colour...");
        } else if (i == 3) {
            System.out.println("green colour...");
        }
    }
}

/*
 * steps to remove if-else-if
 * 1. delete the if-else-if ladder
 * 2. convert the condition to classes
 * 3. Group them under a hierarchy
 * 4. Create a association between the hierarchial class and the using class
 */
class GoodPaintBrush {
    Paint paint;

    public void doPaint() {
        paint.colour();
    }
}

interface Paint {
    public abstract void colour();
}

class RedPaint implements Paint {
    @Override
    public void colour() {
        System.out.println("red colour...");
    }
}

class BluePaint implements Paint {
    @Override
    public void colour() {
        System.out.println("blue colour...");
    }
}

class GreenPaint implements Paint {
    @Override
    public void colour() {
        System.out.println("green colour..");
    }
}
