package BridgePattern;

import BridgePattern.Device.Radio;
import BridgePattern.Device.Tv;
import BridgePattern.Remote.AdvanceRemote;
import BridgePattern.Remote.BasicRemote;

public class BridgePattern {

    public static void main(String[] args) {

        // Tv Remote

        Tv tv = new Tv();
        BasicRemote tbasicRemote = new BasicRemote(tv);
        tbasicRemote.power();
        tv.printStatus();
        // Tv Advance Remote
        AdvanceRemote tadvanceRemote = new AdvanceRemote(tv);
        tadvanceRemote.mute();
        tv.printStatus();

        // Radio Remote

        Radio radio = new Radio();

        BasicRemote rbasicRemote = new BasicRemote(radio);
        rbasicRemote.power();
        radio.printStatus();

        // Advance Radio Remote

        AdvanceRemote radvanceRemote = new AdvanceRemote(radio);
        radvanceRemote.mute();
        radio.printStatus();

    }

}
