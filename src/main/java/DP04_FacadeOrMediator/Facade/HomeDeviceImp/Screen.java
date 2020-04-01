package DP04_FacadeOrMediator.Facade.HomeDeviceImp;

import DP04_FacadeOrMediator.Facade.Interface.HomeDevice;

public class Screen implements HomeDevice {
    private int bright = 10;

    @Override
    public void play() {
        System.out.println("Screen Playing ...");
    }

    @Override
    public void pluse() {
        System.out.println("Screen Pluse!");
    }

    @Override
    public void close() {
        System.out.println("Screen Close!");
    }

    @Override
    public void other(int type) {
        if (type == HomeDevice.UP) {
            this.bright++;
            System.out.println("Screen Current Bright : " + this.bright);
        } else {
            if (this.bright <= 0) {

            } else {
                this.bright--;
            }
            System.out.println("Screen Current Bright : " + this.bright);
        }
    }
}
