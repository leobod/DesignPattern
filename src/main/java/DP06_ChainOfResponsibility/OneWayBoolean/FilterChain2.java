package DP06_ChainOfResponsibility.OneWayBoolean;


import java.util.ArrayList;
import java.util.List;

public class FilterChain2 implements CustomFilter2 {
    public List<CustomFilter2> filters = new ArrayList<>();

    public void add(CustomFilter2 filter) {
        filters.add(filter);
    }

    @Override
    public boolean doFilter(Msg2 msg) {
        for (CustomFilter2 filter : filters) {
            if (!filter.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }
}
