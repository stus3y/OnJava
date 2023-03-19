package com.OnJava.Chapter10.interfaces;

sealed class Super permits Sub1, Sub2, Sub3 {}

non-sealed class Sub3 extends Super {}
final class Sub1 extends Super {}
final class Sub2 extends Super {}

class Any extends Sub3 {}

public class NonSealed {
}
