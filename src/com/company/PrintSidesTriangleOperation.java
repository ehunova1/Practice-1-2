package com.company;

public class PrintSidesTriangleOperation implements TriangleOperation {

    @Override
    public String applyTo(Triangle triangle) {
        return triangle.printSides();
    }

    @Override
    public String printName() {
        return "Определение значения сторон.";
    }

}
