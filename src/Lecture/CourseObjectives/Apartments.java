package Lecture.CourseObjectives;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) throws java.lang.Exception {
        int countOfApartments, totalEntraces, totalFloors, inputedApartment, apartmentsInEntrace, apartmentsOnFloor, entrace, floor;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество подъездов в многоквартирном доме:");
        totalEntraces = scanner.nextInt();

        System.out.println("Введите количество этажей в многоквартирном доме:");
        totalFloors = scanner.nextInt();

        System.out.println("Введите номер искомой квартиры в многоквартирном доме:");
        inputedApartment = scanner.nextInt();

        countOfApartments = totalEntraces * totalFloors * 4;
        if (inputedApartment <= 0 || inputedApartment > countOfApartments) {
            System.out.println("Квартиры с введённым вами номером в этом доме нет!");
            return;
        }

        apartmentsInEntrace = countOfApartments / totalEntraces;
        apartmentsOnFloor = countOfApartments / totalEntraces / totalFloors;
        entrace = inputedApartment / apartmentsInEntrace;
        if (inputedApartment % apartmentsInEntrace != 0) {
            entrace++;
        }
        if (inputedApartment % apartmentsInEntrace == 0) {
            floor = totalFloors;
        } else {
            floor = (inputedApartment % apartmentsInEntrace) / apartmentsOnFloor;
            if (inputedApartment % apartmentsOnFloor != 0) {
                floor++;
            }
        }
        int raspologenie = (inputedApartment - 1) % 4;
        String raschifrovkaRaspologenija;
        if (raspologenie == 0) {
            raschifrovkaRaspologenija = "ближняя слева.";
        } else if (raspologenie == 1) {
            raschifrovkaRaspologenija = "дальняя слева.";
        } else if (raspologenie == 2) {
            raschifrovkaRaspologenija = "дальняя справа.";
        } else {
            raschifrovkaRaspologenija = "ближняя справа.";
        }
        System.out.printf("Искомая квартира находится в подъезде №%d на %d-м этаже, %s", entrace, floor, raschifrovkaRaspologenija);
    }
}