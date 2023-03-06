package BridgePattern.Remote;

import BridgePattern.Device.Device;

public class AdvanceRemote extends BasicRemote {

    public AdvanceRemote(Device device) {
        super.device = device;
    }

    public void mute() {

        System.out.println("Mute");
        device.setVolume(0);

    }

}
