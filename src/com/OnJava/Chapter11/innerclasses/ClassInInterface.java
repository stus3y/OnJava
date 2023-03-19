package com.OnJava.Chapter11.innerclasses;

public interface ClassInInterface {
    void howdy();

    /**
     * 接口中的嵌套类默认为public static
     * 置于接口的 namespace 中
     */
    class Test implements ClassInInterface {
        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
