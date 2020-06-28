package DP32_EffectiveMethod.P01_CreateAndDestoryObject;

/*
    @名称: 通过私有构造器强化不可实例化的能力
    @描述: 避免不小心在类的内部调用构造器。它保证该类在任何情况下都不会被实例化。

 */
public class T04_UsePrivateNoninstantiability {
    static class UtilityClass {
        // Suppress default constructor for noninstantiability
        private UtilityClass() {
            throw new AssertionError();
        }

        // Remainder omitted
    }
}
