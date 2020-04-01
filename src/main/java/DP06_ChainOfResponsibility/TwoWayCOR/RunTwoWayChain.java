package DP06_ChainOfResponsibility.TwoWayCOR;

/**
 * 通过借助递归操作来，实现双向Filter
 * 入方向过滤 1 2 3
 * 出方向过滤 3 2 1
 */

import DP06_ChainOfResponsibility.OneWayVoid.Msg;
import DP06_ChainOfResponsibility.TwoWayCOR.FilterImp.MyFilterChain;
import DP06_ChainOfResponsibility.TwoWayCOR.FilterImp.MyHtmlFilter;
import DP06_ChainOfResponsibility.TwoWayCOR.FilterImp.MySensitiveFilter;

public class RunTwoWayChain {

    public static void main(String[] args) {

        Msg request = new Msg();
        request.setMsg("<h1>Hello,World!,still 996</h1>");
        Msg response = new Msg();
        response.setMsg("");

        System.out.println(request);
        System.out.println(response);

        MyFilterChain fc = new MyFilterChain();
        fc.add(new MyHtmlFilter());
        fc.add(new MySensitiveFilter());

        fc.doFilter(request, response, fc);

        System.out.println();
        System.out.println(request);
        System.out.println(response);
    }
}
