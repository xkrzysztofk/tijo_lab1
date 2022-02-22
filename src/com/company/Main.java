package com.company;

public class Main {

    public static void printFigure(FigureInterface figureInterface){
        figureInterface.print(5);
    }


    public static void main(String[] args) {
        printFigure(new Triangle());
        printFigure(new Square());
        printFigure(new Rhombus());
    }
}
