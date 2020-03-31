package DP06_ChainOfResponsibility.OneWayBoolean;

import DP06_ChainOfResponsibility.OneWayVoid.CustomFilter;

public class HtmlFilter2 implements CustomFilter2 {
    @Override
    public boolean doFilter(Msg2 msg) {
        String s = msg.getMsg();
        s = s.replace("<", "[");
        s = s.replace(">", "]");
        msg.setMsg(s);
        return true;
    }
}
