package DP06_ChainOfResponsibility.TwoWayCOR.Interface;

import DP06_ChainOfResponsibility.OneWayVoid.Msg;

public interface EeFilter {
    public void doFilter(Msg request, Msg response, EeFilter chain);
}
