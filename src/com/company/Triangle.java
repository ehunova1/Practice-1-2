package com.company;

abstract class Triangle {
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected int angleA;
    protected int angleB;
    protected int angleC;

    public Triangle(double sideA, double sideB, double sideC, int angleA, int angleB, int angleC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = angleC;
    }

    public void changeSide(String side, int percent) {
        switch (side) {
            case "A" -> changeSideA(percent);
            case "B" -> changeSideB(percent);
            case "C" -> changeSideC(percent);
        }
    }

    public void changeSideA(int percent) {
        sideA = sideA + (sideA / 100 * percent);
    }

    public void changeSideB(int percent) {
        sideB = sideB + (sideB / 100 * percent);
    }

    public void changeSideC(int percent) {
        sideC = sideC + (sideC / 100 * percent);
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public int getAngleA() {
        return angleA;
    }

    public int getAngleB() {
        return angleB;
    }

    public int getAngleC() {
        return angleC;
    }

    public String print() {
        return printSides() + " Угол A: " + this.getAngleA() + " Угол B: " + this.getAngleB() + " Угол C: " + this.getAngleC();
    }

    public String printSides() {
        return "Сторона A: " + Math.floor(this.getSideA()) + " Сторона B: " + Math.floor(this.getSideB()) + " Сторона С: " + Math.floor(this.getSideC());
    }
}
