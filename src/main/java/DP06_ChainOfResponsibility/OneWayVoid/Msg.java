package DP06_ChainOfResponsibility.OneWayVoid;

public class Msg {
    private String msg;

    public Msg() {
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
