package DP32_EffectiveMethod.P01_CreateAndDestoryObject;

/*
    @名称: 避免使用终结方法
    @注意: 不要被  System.gc  和  System.runFinalization  这两个方法所诱惑，
            它们确实增加了终结方法被执行的机会，但是它们并不保证终结方法一定会被执行。
            唯一保证终结方法被执行的方法是System.runFinalizersOnExit，
            以及它臭名昭著的孪生兄弟 Runtime.runFinalizersOnExit。
            这两个方法都有致命的缺陷,已经被废弃了

            延迟终结过程并不只是一个理论问题。在很少见的情况下，为类提供终结方法，可能会随意地延迟其实例的回收过程。

 */

public class T07_AvoidToUseFinalize {
}
