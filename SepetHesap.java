/*
 * Ad Soyad: [Mehmet Kerem Küçük]
 * Ogrenci No: [250541097]
 * Tarih: [10.11.2025]
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */
import java.util.Scanner;

public class SepetHesap {

    // Sabitler
    final static double VAT_RATE = 0.18;      // KDV Oranı (%18)
    final static double SHIPPING_FEE = 29.99; // Sabit kargo ücreti (TL)

    // METOT 1: Bir urunun toplam fiyatini hesaplar (fiyat * adet)
    public static double calculateLineTotal(double price, int quantity) {
        // Satir Toplami = fiyat * adet
        return price * quantity;
    }

    // METOT 2: Sepetteki 3 urunun ara toplamini hesaplar
    public static double calculateSubtotal(double line1, double line2, double line3) {
        // Ara Toplam = urun1 + urun2 + urun3
        return  line1 + line2 + line3;
    }

    // METOT 3: Indirim tutarini hesaplar
    public static double calculateDiscountAmount(double subtotal, double discountPercentage) {
        // Indirim Tutari = araToplam * (indirimYuzdesi / 100)
        return subtotal * (discountPercentage/100);
    }

    // METOT 4: Indirimli fiyati hesaplar (araToplam - indirimTutari)
    public static double applyDiscount(double subtotal, double discountAmount) {
        // Indirimli Toplam = araToplam - indirimTutari
        return subtotal - discountAmount;
    }

    // METOT 5: KDV tutarini hesaplar (indirimliTutar * kdvOrani)
    public static double calculateVAT(double discountedTotal, double vatRate) {
        // KDV Tutari = indirimliTutar * VAT_RATE
        return discountedTotal * vatRate;
    }

    // METOT 6: Genel toplami hesaplar (indirimliTutar + kdv + kargo)
    public static double calculateGrandTotal(double discountedTotal, double vatAmount, double shippingFee) {
        // Genel Toplam = indirimliTutar + kdvTutari + kargoUcreti
        return discountedTotal + vatAmount + shippingFee;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== E-TICARET SEPET HESAPLAYICI ===");
        System.out.println("\nLutfen 3 urunun bilgilerini girin:");

        // URUN 1 Bilgileri
        System.out.println("\nURUN 1:");
        System.out.print("  Birim Fiyat (TL): ");
        double price1 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty1 = input.nextInt();

        // URUN 2 Bilgileri
        System.out.println("\nURUN 2:");
        System.out.print("  Birim Fiyat (TL): ");
        double price2 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty2 = input.nextInt();

        // URUN 3 Bilgileri
        System.out.println("\nURUN 3:");
        System.out.print("  Birim Fiyat (TL): ");
        double price3 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty3 = input.nextInt();

        // Indirim Bilgisi
        System.out.println("\nIndirim Kuponu Yuzdesi (%): ");
        double discountPercent = input.nextDouble();

        // HESAPLAMALARI YAP - Metotlari cagir
        // 1. Urunlerin satis toplamlarini hesapla
        double Satis_1 = calculateLineTotal(price1, qty1);
        double Satis_2 = calculateLineTotal(price2, qty2);
        double Satis_3 = calculateLineTotal(price3, qty3);


        // 2. Ara toplami hesapla
        double Ara_toplam = Satis_1 + Satis_2 + Satis_3;

        // 3. Indirim tutarini hesapla
        double Indirim_tutari = Ara_toplam * 1/100;


        // 4. Indirimli toplami hesapla
        double Indirim_toplami = Ara_toplam - Indirim_tutari;


        // 5. KDV tutarini hesapla (Indirimli toplam uzerinden)
        double KDV = Indirim_toplami * VAT_RATE;


        // 6. Genel toplami hesapla
        double Genel_toplam = Indirim_toplami + KDV + SHIPPING_FEE;


        // SONUCLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("           SIPARIS OZETI");
        System.out.println("========================================");

        System.out.printf("Urun 1 Toplam (%.2f TL x %d): %.2f TL\n", price1, qty1, Satis_1);
        System.out.printf("Urun 2 Toplam (%.2f TL x %d): %.2f TL\n", price2, qty2, Satis_2);
        System.out.printf("Urun 3 Toplam (%.2f TL x %d): %.2f TL\n", price3, qty3, Satis_3);
        System.out.println("----------------------------------------");
        System.out.printf("Ara Toplam                   : %.2f TL\n", Ara_toplam);

        System.out.printf("\nIndirim Tutari (%%%.0f)         : -%.2f TL\n", discountPercent, Indirim_tutari);
        System.out.printf("Indirimli Toplam             : %.2f TL\n", Indirim_toplami);

        System.out.printf("\nKDV Tutari (%%%.0f)             : +%.2f TL\n", (VAT_RATE * 100), KDV);
        System.out.printf("Kargo Ucreti                 : +%.2f TL\n", SHIPPING_FEE);
        System.out.println("----------------------------------------");
        System.out.printf("GENEL TOPLAM                 : %.2f TL\n", Genel_toplam);
        System.out.println("========================================");

        input.close();
    }
}

