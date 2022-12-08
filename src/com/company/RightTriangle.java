package com.company;

public class RightTriangle extends Triangle {
    public static RightTriangle fromSideAAndAngleB(double sideA, int angleB) {
        int angleC = 90;
        int angleA = 180 - angleC - angleB;
        double sideC = sideA / Math.cos(Math.toRadians(angleB));
        double sideB = Math.sqrt(Math.pow(sideC, 2) - Math.pow(sideA, 2));
        return new RightTriangle(sideA, sideB, sideC, angleA, angleB, angleC);
    }

    private RightTriangle(double sideA, double sideB, double sideC, int angleA, int angleB, int angleC) {
        super(sideA, sideB, sideC, angleA, angleB, angleC);
    }
}
