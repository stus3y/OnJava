package com.OnJava.Chapter10.interfaces;

/**
 * 密封类和密封接口
 * 用于限制自己派生的类
 */
sealed class Base permits D1, D2{}

final class D1 extends Base {}
final class D2 extends Base {}
