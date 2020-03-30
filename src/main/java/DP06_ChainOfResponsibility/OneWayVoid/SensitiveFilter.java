package DP06_ChainOfResponsibility.OneWayVoid;

public class SensitiveFilter implements CustomFilter {
    @Override
    public void doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("996", "955");
        msg.setMsg(s);
    }
}
