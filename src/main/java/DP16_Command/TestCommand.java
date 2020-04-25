package DP16_Command;

import java.util.concurrent.locks.Condition;

/**
 * Command命令
 *
 * 记录Command，使得操作可撤销/重做的操作。
 *
 */

public class TestCommand {
    private Content c;
    private String nmsg = "BBBBBBBB";

    public TestCommand(Content c) {
        this.c = c;
    }

    public void doAction() {
        this.c.msg = this.c.msg + this.nmsg;
    }

    public void undoAction() {
        this.c.msg = this.c.msg.substring(0, this.c.msg.length() - this.nmsg.length());
    }


    public static void main(String[] args) {
        Content content = new Content();
        TestCommand testCommand = new TestCommand(content);

        System.out.println(content.msg);
        System.out.println("--------- 1 -------");

        testCommand.doAction();
        System.out.println(content.msg);
        System.out.println("--------- 2 -------");

        testCommand.undoAction();
        System.out.println(content.msg);
        System.out.println("--------- 3 -------");
    }

}
