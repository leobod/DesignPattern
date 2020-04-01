package DP06_ChainOfResponsibility.TwoWayCOR.FilterImp;

import DP06_ChainOfResponsibility.OneWayVoid.Msg;
import DP06_ChainOfResponsibility.TwoWayCOR.Interface.EeFilter;

import java.util.ArrayList;
import java.util.List;

public class MyFilterChain implements EeFilter {
    private List<EeFilter> filters = new ArrayList<>();
    private int current = -1;

    public MyFilterChain() {}

    public void add(EeFilter filter) {
        filters.add(filter);
    }

    @Override
    public void doFilter(Msg request, Msg response, EeFilter chain) {
        current++;
        if (current >= filters.size()) {

        } else {
            filters.get(current).doFilter(request, response, chain);
        }
    }
}
