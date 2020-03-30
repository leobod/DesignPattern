package DP06_ChainOfResponsibility.OneWayVoid;

public class RunChain {

    static void oneChain() {
        Msg msg = new Msg();
        msg.setMsg("<h1>Hello,World!,still 996</h1>");
        System.out.println(msg.toString());

        FilterChain fc = new FilterChain();
        fc.add(new HtmlFilter());
        fc.add(new SensitiveFilter());
        fc.doFilter(msg);

        System.out.println(msg.toString());
    }

    static void twoChain() {
        Msg msg = new Msg();
        msg.setMsg("<h1>Hello,World!,still 996</h1>");

        FilterChain fc = new FilterChain();
        fc.add(new HtmlFilter());
        fc.add(new SensitiveFilter());
        FilterChain fc2 = new FilterChain();
        fc2.add(new OFilter());

        fc.add(fc2);
        fc.doFilter(msg);

        fc.doFilter(msg);

        System.out.println(msg.toString());
    }

    public static void main(String[] args) {
        oneChain();
        twoChain();

    }
}
