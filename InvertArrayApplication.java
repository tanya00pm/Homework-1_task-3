package ru.levelup.tatiana_nesterova.qa.homework1.task3;

public class InvertArrayApplication {
    // Tatiana Nesterova, homework #1, task #3

    public static void main(String[] args) {

        InvertArrayApplication app = new InvertArrayApplication();
        app.startApplication();
    }

    public void printArray(int a[]) {
        // print array on console method

        for (int i=0; i< a.length; i++)
            System.out.println(Integer.toString(a[i]));
    }

    public void startApplication() {

        InvertClass cl = new InvertClass(20, 55, 7);
        System.out.println("Initial array:");
        cl.printArray();

        System.out.println("\nResult array:");

        int mas[] =  cl.runInvert();
        this.printArray(mas);
    }
}
