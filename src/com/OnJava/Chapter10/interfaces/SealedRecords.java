package com.OnJava.Chapter10.interfaces;

sealed interface Employee permits CLevel, Programmer {}

record CLevel() implements Employee {}
record Programmer() implements Employee {}

public class SealedRecords {
}
