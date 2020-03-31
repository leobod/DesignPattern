package DP06_ChainOfResponsibility.OneWayBoolean;

import DP06_ChainOfResponsibility.OneWayVoid.CustomFilter;

public class SensitiveFilter2 implements CustomFilter2 {
    @Override
    public boolean doFilter(Msg2 msg) {
        String s = msg.getMsg();
        s = s.replace("996", "955");
        msg.setMsg(s);
        return true;
    }
}
