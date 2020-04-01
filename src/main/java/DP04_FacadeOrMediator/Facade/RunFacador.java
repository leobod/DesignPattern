package DP04_FacadeOrMediator.Facade;

import DP04_FacadeOrMediator.Facade.HomeDeviceImp.DVD;
import DP04_FacadeOrMediator.Facade.Interface.HomeDevice;

/**
 *  通过使用Facador实现HomeDevice来进一步实现，对于设备的接口的隐藏
 *  比如定义DVD设备时候，可能因为一些原因，导致，DVD有除了通用定义API的方法
 *  此时，对于使用人员来说，只能通过Facador来调用，所以不会让用户调用到自己的内部保留API
 *
 *  在Java中不需要在额外的加一个Facador,因为使用时候，使用的是基类，默认隐藏
 *  但是对于其他语言，可能可以借鉴
 */

public class RunFacador {

    public static void main(String[] args) {
        HomeDevice dvd = new DVD();
        Facador f = new Facador(dvd);
        f.play();
        f.pluse();
        f.other(HomeDevice.UP);
        f.close();

        System.out.println("");

        DVD d0 = (DVD) dvd;
        d0.getDVDInfo();

    }
}
