package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriangleOperationsApplication {
    private Scanner scanner;
    private ArrayList<TriangleOperation> operations;

    public TriangleOperationsApplication(Scanner scanner) {
        this.scanner = scanner;
        this.operations = new ArrayList<>(List.of(
                new PrintSidesTriangleOperation(),
                new ChangeSideByPercentTriangleOperation(scanner)
        ));
    }

    public void run() {
        var triangles = retrieveTriangles();
        var triangle = selectTriangle(triangles);
        var operation = selectOperation();
        var result = operation.applyTo(triangle);
        System.out.println(result);
    }

    private ArrayList<RightTriangle> retrieveTriangles() {
        boolean continueInsert;
        ArrayList<RightTriangle> triangles = new ArrayList<>();
        do {
            System.out.println("Введите сторону: ");
            double side = scanner.nextDouble();
            System.out.println("Введите прилежащий угол: ");
            int corner = scanner.nextInt();
            triangles.add(RightTriangle.fromSideAAndAngleB(side, corner));
            System.out.println("Продолжить ввод? (true/false)");
            continueInsert = scanner.nextBoolean();
        } while (continueInsert);


        return triangles;
    }

    private RightTriangle selectTriangle(ArrayList<RightTriangle> triangles) {
        System.out.println("Вы ввели следующие треугольники: ");
        for (int i = 0; i < triangles.size(); i++) {
            var triangle = triangles.get(i);
            System.out.println(i + ". " + triangle.print());
        }
        System.out.println("Выберите треугольник: ");
        int index = scanner.nextInt();
        var triangle = triangles.get(index);
        System.out.println(index + ". " + triangle.print());

        return triangle;
    }

    private TriangleOperation selectOperation() {
        System.out.println("Выберите операцию: ");
        for (int i = 0; i < operations.size(); i++) {
            var operation = operations.get(i);
            System.out.println(i + ". " + operation.printName());
        }
        int index = scanner.nextInt();
        var operation = operations.get(index);

        return operation;
    }
}
