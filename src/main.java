import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, tarih;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        int toplam = (mat + fizik + turkce + kimya + muzik + tarih);
        double sonuc = toplam/6;
        System.out.println(sonuc);

        boolean kosul = sonuc >=60;
        String sonuc1 = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc1);

    }







}




