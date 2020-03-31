package DP06_ChainOfResponsibility.OneWayBoolean;

public class OFilter2 implements CustomFilter2 {
    @Override
    public boolean doFilter(Msg2 msg) {
        String s = msg.getMsg();
        s = s.replace("o", "#");
        msg.setMsg(s);
        return false;
    }
}
