import java.util.Scanner;

public class latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("+++ APLIKASI KALKULATOR SEDERHANA +++");
        System.out.println("=====================================");
        System.out.println("Pilihan operator Aritmatika : ");
        System.out.println("1.Penjumlahan [+] ");
        System.out.println("2.Pegurangan  [-] ");
        System.out.println("3.Perkalian   [x] ");
        System.out.println("4.Pembagian   [/] ");

        System.out.println("Mangga pilih menu  operatorna : ");
        int pilihan = input.nextInt();
        System.out.println( "Lebetkeun angka nu ka Hiji : ");
        int a = input.nextInt();
        System.out.println("Lebetkeun angka nu ka Dua : ");
        int b = input.nextInt();
        int hasil;



        if(pilihan ==1 ){
            System.out.println("Anjeun milih Pertambahan");
            hasil = a+b;
            System.out.println("Lajeng jumlahna : "+hasil);
        }else if(pilihan ==2 ){
            System.out.println("Anjeun milih pengurangan ");
            hasil = a-b;
            System.out.println("Lajeng hasilna ngurangan : "+hasil);
        }else if (pilihan ==3){
            System.out.println("Anjeun milih perkalian ");
            hasil = a*b;
            System.out.println("Lajeng hasil multiplication na : "+hasil);
        }else if (pilihan ==4){
            System.out.println("Anjeun milih Pembagian ");
            hasil = a/b;
            System.out.println("Lajeng hasil babagi na: "+hasil);
        }else{
            System.out.println("PILIH OPERATOR NURUT PILIHAN NU DI ATAS!!!");
        }

    }
    
}
