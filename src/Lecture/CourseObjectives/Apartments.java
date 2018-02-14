package Lecture.CourseObjectives;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        
        int countOfApartments, totalEntrances, totalFloors, enteredApartmentNumber, apartmentsInEntrance, apartmentsOnFloor, entrance, floor, location;
        String decodingLocation;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество подъездов в многоквартирном доме:");
        totalEntrances = scanner.nextInt();

        System.out.println("Введите количество этажей в многоквартирном доме:");
        totalFloors = scanner.nextInt();

        System.out.println("Введите номер искомой квартиры в многоквартирном доме:");
        enteredApartmentNumber = scanner.nextInt();

        apartmentsOnFloor = 4;

        countOfApartments = totalEntrances * totalFloors * apartmentsOnFloor;
        if (enteredApartmentNumber <= 0 || enteredApartmentNumber > countOfApartments) {
            System.out.println("Квартиры с введённым вами номером в этом доме нет!");
            return;
        }

        apartmentsInEntrance = countOfApartments / totalEntrances;
        entrance = enteredApartmentNumber / apartmentsInEntrance;

        if (enteredApartmentNumber % apartmentsInEntrance != 0) {
            entrance++;
        }
        if (enteredApartmentNumber % apartmentsInEntrance == 0) {
            floor = totalFloors;
        } else {
            floor = (enteredApartmentNumber % apartmentsInEntrance) / apartmentsOnFloor;
            if (enteredApartmentNumber % apartmentsOnFloor != 0) {
                floor++;
            }
        }

        location = (enteredApartmentNumber - 1) % apartmentsOnFloor;

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