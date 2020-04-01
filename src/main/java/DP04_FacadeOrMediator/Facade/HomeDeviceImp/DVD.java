package DP04_FacadeOrMediator.Facade.HomeDeviceImp;

import DP04_FacadeOrMediator.Facade.Interface.HomeDevice;

public class DVD implements HomeDevice {
    private int volume = 10;

    @Override
    public void play() {
        System.out.println("DVD Playing ...");
    }

    @Override
    public void pluse() {
        System.out.println("DVD Pluse!");
    }

    @Override
    public void close() {
        System.out.println("DVD Close!");
    }

    @Override
    public void other(int type) {
        if (type == HomeDevice.UP) {
            this.volume++;
            System.out.println("DVD Current Volume : " + this.volume);
        } else {
            if (this.volume <= 0) {

            } else {
                this.volume--;
            }
            System.out.println("DVD Current Volume : " + this.volume);
        }
    }

    public void getDVDInfo() {
        System.out.println("Show DVD Info");
    }
}
