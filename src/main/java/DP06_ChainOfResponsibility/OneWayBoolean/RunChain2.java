package DP06_ChainOfResponsibility.OneWayBoolean;

/**
 * 使用ChainOfResponsibility来改进无返回值的
 * 通过使用boolean来控制过滤过滤到哪一步
 */

public class RunChain2 {

    static void chain1() {
        Msg2 msg = new Msg2();
        msg.setMsg("<h1>Hello,World!,still 996</h1>");
        System.out.println(msg.toString());

        FilterChain2 fc = new FilterChain2();
        fc.add(new HtmlFilter2());
        fc.add(new SensitiveFilter2());
        fc.doFilter(msg);

        System.out.println(msg.toString());
    }

    static void chain2() {
        Msg2 msg = new Msg2();
        msg.setMsg("<h1>Hello,World!,still 996</h1>");
        System.out.println(msg.toString());

        FilterChain2 fc = new FilterChain2();
        fc.add(new HtmlFilter2());
        fc.add(new OFilter2());
        fc.add(new SensitiveFilter2());
        fc.doFilter(msg);

        System.out.println(msg.toString());
    }

    public static void main(String[] args) {
        chain1();

        System.out.println("");

        chain2();
    }
}
