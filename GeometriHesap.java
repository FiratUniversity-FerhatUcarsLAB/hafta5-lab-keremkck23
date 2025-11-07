/*
 * Ad Soyad: [Mehmet Kerem Küçük]
 * Ogrenci No: [250541097]
 * Tarih: [7.11.2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class GeometriHesap {

    // METOT 1: Kare alani
    public static double calculateSquareArea(double side) {
        // Alan = kenar * kenar

        return side * side;
    }

    // METOT 2: Kare cevresi
    public static double calculateSquarePerimeter(double side) {
        // Cevre = 4 * kenar

        return 4 * side;
    }

    // METOT 3: Dikdortgen alani
    public static double calculateRectangleArea(double width, double height) {
        // Alan = genislik * yukseklik

        return width * height;
    }

    // METOT 4: Dikdortgen cevresi
    public static double calculateRectanglePerimeter(double width, double height) {
        // Cevre = 2 * (genislik + yukseklik)

        return 2 * (width + height);
    }

    // METOT 5: Daire alani
    public static double calculateCircleArea(double radius) {
        // Alan = PI * r * r
        // Math.PI kullanabilirsiniz

        return Math.PI * Math.pow(radius, 2);
    }

    // METOT 6: Daire cevresi
    public static double calculateCircleCircumference(double radius) {
        // Cevre = 2 * PI * r

        return 2 * Math.PI * radius;
    }

    // METOT 7: Ucgen alani (taban ve yukseklik ile)
    public static double calculateTriangleArea(double base, double height) {
        // Alan = (taban * yukseklik) / 2

        return base * height / 2;
    }

    // METOT 8: Ucgen cevresi
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        // Cevre = a + b + c

        return (a+b+c) ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");
        System.out.println();

        // KARE bilgileri
        System.out.println("KARE: ");
        System.out.print("Kenar uzunlugu (cm): ");
        double squareSide = input.nextDouble();

        // DIKDORTGEN bilgileri
        System.out.println("\nDIKDORTGEN:");
        System.out.print("Kisa kenar (cm): ");
        double rectWidth = input.nextDouble();
        System.out.print("Uzun kenar (cm): ");
        double rectHeight = input.nextDouble();

        // DAIRE bilgileri
        System.out.println("\nDAIRE:");
        System.out.print("Yaricap (cm): ");
        double radius = input.nextDouble();

        // UCGEN bilgileri
        System.out.println("\nUCGEN:");
        System.out.print("Taban (cm): ");
        double base = input.nextDouble();
        System.out.print("Yukseklik (cm): ");
        double height = input.nextDouble();
        System.out.print("1. kenar (cm): ");
        double side1 = input.nextDouble();
        System.out.print("2. kenar (cm): ");
        double side2 = input.nextDouble();
        System.out.print("3. kenar (cm): ");
        double side3 = input.nextDouble();

        // HESAPLAMALARI YAP - Metotlari cagir
        double kare_alani=calculateSquareArea(squareSide);
        double kare_cevresi=calculateSquarePerimeter(squareSide);
        double dikdortgen_alani=calculateRectangleArea(rectWidth, rectHeight);
        double dikdortgen_cevresi=calculateRectanglePerimeter(rectWidth, rectHeight);
        double daire_alani=calculateCircleArea(radius);
        double daire_cevresi=calculateCircleCircumference(radius);
        double ucgen_alani=calculateTriangleArea(base, height);
        double ucgen_cevresi=calculateTrianglePerimeter(side1, side2, side3);



        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUCLARI");
        System.out.println("========================================");

        System.out.printf("\nKARE (kenar: %.1f cm):\n", squareSide);
        System.out.printf("Kare Alanı(cm): %.2f%n",kare_alani);
        System.out.printf("Kare Çevre(cm): %.2f%n",calculateSquarePerimeter(squareSide));


        System.out.printf("\nDIKDORTGEN (%.1f x %.1f cm):\n", rectWidth, rectHeight);
        System.out.printf("Dikdörtgen Alanı(cm): %.2f%n",dikdortgen_alani);
        System.out.printf("Dikdörtgen Çevresi(cm): %.2f%n",dikdortgen_cevresi);


        System.out.printf("\nDAIRE (yaricap: %.1f cm):\n", radius);
        System.out.printf("Daire Alanı(cm):  %.2f%n",daire_alani);
        System.out.printf("Daire Çevre(cm): %.2f%n",daire_cevresi);

        System.out.printf("\nUCGEN (taban: %.1f, yukseklik: %.1f cm):\n", base, height);
        System.out.printf("Üçgen Alanı(cm): %.2f%n",ucgen_alani);
        System.out.printf("Üçgen Çevresi(cm): %.2f%n",ucgen_cevresi);




        System.out.println("========================================");

        input.close();
    }
}

