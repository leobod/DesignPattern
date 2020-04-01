package DP04_FacadeOrMediator.Facade;


import DP04_FacadeOrMediator.Facade.Interface.HomeDevice;

public class Facador implements HomeDevice {
    private HomeDevice device;

    public Facador(HomeDevice device) {
        this.device = device;
    }

    @Override
    public void play() {
        this.device.play();
    }

    @Override
    public void pluse() {
        this.device.pluse();
    }

    @Override
    public void close() {
        this.device.close();
    }

    @Override
    public void other(int type) {
        this.device.other(type);
    }
}
