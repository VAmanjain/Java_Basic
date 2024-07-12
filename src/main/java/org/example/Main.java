package org.example;

import org.example.java_overview.FirstOverview;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FirstOverview firstOverview = new FirstOverview();
        int res = firstOverview.sum(10, 5);
        System.out.println(res);
    }
}