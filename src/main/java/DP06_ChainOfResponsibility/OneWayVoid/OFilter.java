package DP06_ChainOfResponsibility.OneWayVoid;

public class OFilter implements CustomFilter {
    @Override
    public void doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("o", "#");
        msg.setMsg(s);
    }
}
