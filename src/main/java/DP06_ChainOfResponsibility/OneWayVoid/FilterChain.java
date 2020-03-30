package DP06_ChainOfResponsibility.OneWayVoid;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements CustomFilter {
    public List<CustomFilter> filters = new ArrayList<>();

    public void add(CustomFilter filter) {
        filters.add(filter);
    }

    @Override
    public void doFilter(Msg msg) {
        for (CustomFilter filter : filters) {
            filter.doFilter(msg);
        }
    }
}
