package Lecture.CourseObjectives;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) throws java.lang.Exception {
        int wsegoKvartirWdome, wsegoPodesdov, wsegoEtagey, iskomajaKvartira, kvartirWpodesde, kvartirNaEtage, podesd, etag, raspologenie;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество подъездов в многоквартирном доме:");
        wsegoPodesdov = scanner.nextInt();

        System.out.println("Введите количество этажей в многоквартирном доме:");
        wsegoEtagey = scanner.nextInt();

        System.out.println("Введите номер искомой квартиры в многоквартирном доме:");
        iskomajaKvartira = scanner.nextInt();

        raspologenie = (iskomajaKvartira - 1) % 4;
        wsegoKvartirWdome = wsegoPodesdov * wsegoEtagey * 4;

        if (iskomajaKvartira <= 0 || iskomajaKvartira > wsegoKvartirWdome) {
            System.out.println("Квартиры с введённым вами номером в этом доме нет!");
        } else {
            kvartirWpodesde = wsegoKvartirWdome / wsegoPodesdov;
            kvartirNaEtage = wsegoKvartirWdome / wsegoPodesdov / wsegoEtagey;
            podesd = iskomajaKvartira / kvartirWpodesde;
            if (iskomajaKvartira % kvartirWpodesde != 0) {
                podesd++;
            }
            if (iskomajaKvartira % kvartirWpodesde == 0) {
                etag = wsegoEtagey;
            } else {
                etag = (iskomajaKvartira % kvartirWpodesde) / kvartirNaEtage;
                if (iskomajaKvartira % kvartirNaEtage != 0) {
                    etag++;
                }
            }
            System.out.printf("Искомая квартира находится в подъезде №%d на %d-м этаже,", podesd, etag);
        }
        if (raspologenie == 0) {
            System.out.println(" ближняя слева.");
        } else if (raspologenie == 1) {
            System.out.println(" дальняя слева.");
        } else if (raspologenie == 2) {
            System.out.println(" дальняя справа.");
        } else {
            System.out.println(" ближняя справа.");
        }
    }
}