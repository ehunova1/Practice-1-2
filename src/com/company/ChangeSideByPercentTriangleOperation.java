package com.company;

import java.util.Scanner;

public class ChangeSideByPercentTriangleOperation implements TriangleOperation {
    private Scanner scanner;

    public ChangeSideByPercentTriangleOperation(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String applyTo(Triangle triangle) {
        System.out.println("Введите процент. (50/-50)");
        int percent = scanner.nextInt();
        System.out.println("Введите сторону. (A/B/C)");
        String side = scanner.next();
        triangle.changeSide(side, percent);
        return triangle.printSides();
    }

    @Override
    public String printName() {
        return "Увеличение/уменьшение размера любой стороны (из свойств) на заданный процент ";
    }
}
