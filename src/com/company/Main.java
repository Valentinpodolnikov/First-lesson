package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	   final double STEPS_IN_SPAN = 10;
	   final double SPANS_IN_FLOOR = 2;

	   double floor, liveInStep;
	   double result;

	   Scanner input = new Scanner(System.in);

	   System.out.println("Эта программа рассчитывае сколько вы получилите доп. секунд жизни, поднявшись на определенный этаж");

	   System.out.print("Введите этаж, на который ходите забраться");
	   floor = input.nextDouble();

	   System.out.print("Сколько секунд дает одна ступенька");
	   liveInStep = input.nextDouble();

	   result = liveInStep * STEPS_IN_SPAN * SPANS_IN_FLOOR * floor;

	   System.out.println("Ваша жизнь увеличилась на: "+result+" сек");
    }
}
