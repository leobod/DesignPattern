package DP04_FacadeOrMediator.Facade.Interface;

public interface HomeDevice {
    final static int UP = 0;
    final static int DOWN = 1;

    public void play();

    public void pluse();

    public void close();

    public void other(int type);
}
