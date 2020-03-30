package DP06_ChainOfResponsibility.OneWayVoid;

public class HtmlFilter implements CustomFilter {
    @Override
    public void doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("<", "[");
        s = s.replace(">", "]");
        msg.setMsg(s);
    }
}
