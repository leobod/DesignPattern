package DP06_ChainOfResponsibility.TwoWayCOR.FilterImp;

import DP06_ChainOfResponsibility.OneWayVoid.Msg;
import DP06_ChainOfResponsibility.TwoWayCOR.Interface.EeFilter;

public class MySensitiveFilter implements EeFilter {
    @Override
    public void doFilter(Msg request, Msg response, EeFilter chain) {
        String req;
        req = request.getMsg();
        req = req.replace("996", "955");
        request.setMsg(req);
        chain.doFilter(request, response, chain);
        String res;
        res = response.getMsg();
        res += "--SensitiveFilter";
        response.setMsg(res);
    }
}
