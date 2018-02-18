package Lecture.CourseObjectives;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество подъездов в многоквартирном доме:");
        int totalEntrances = scanner.nextInt();

        System.out.println("Введите количество этажей в многоквартирном доме:");
        int totalFloors = scanner.nextInt();

        System.out.println("Введите номер искомой квартиры в многоквартирном доме:");
        int enteredApartmentNumber = scanner.nextInt();

        int apartmentsOnFloor = 4;

        int countOfApartments;
        countOfApartments = totalEntrances * totalFloors * apartmentsOnFloor;

        if (enteredApartmentNumber <= 0 || enteredApartmentNumber > countOfApartments) {
            System.out.println("Квартиры с введённым вами номером в этом доме нет!");
            return;
        }

//TODO переделать алгоритм расчёта расположения искомой квартиры
//        if (enteredApartmentNumber % apartmentsInEntrance != 0) {
//            entrance++;
//        }
//        if (enteredApartmentNumber % apartmentsInEntrance == 0) {
//            floor = totalFloors;
//        } else {
//            floor = (enteredApartmentNumber % apartmentsInEntrance) / apartmentsOnFloor;
//            if (enteredApartmentNumber % apartmentsOnFloor != 0) {
//                floor++;
//            }
//        }
//
        int entrance = (enteredApartmentNumber - 1) / (totalFloors * apartmentsOnFloor) + 1;
        int floor = ((enteredApartmentNumber - 1) % (totalFloors * apartmentsOnFloor)) / apartmentsOnFloor + 1;

        String decodingLocation;
        int location = (enteredApartmentNumber - 1) % apartmentsOnFloor;

        if (location == 0) {
            decodingLocation = "ближняя слева.";
        } else if (location == 1) {
            decodingLocation = "дальняя слева.";
        } else if (location == 2) {
            decodingLocation = "дальняя справа.";
        } else {
            decodingLocation = "ближняя справа.";
        }
        System.out.printf("Искомая квартира находится в подъезде №%d на %d-м этаже, %s", entrance, floor, decodingLocation);
    }
}