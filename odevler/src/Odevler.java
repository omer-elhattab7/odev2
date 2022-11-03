
import java.util.Scanner;


/*
 // pozitif veya ngatif algınan program
package odevler;

import java.util.Scanner;
public class Odevler {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            System.out.println("lütfen sayı giriniz");    
            int gir=scanner.nextInt();
            if(gir>0){
                System.out.println("pozitif sayıdır");
            }
            else{ 
                System.out.println("negatif sayıdır");
        }
    }
}
*/
 
//sayıya göre hangi hatfa gunu denk getiren program
/* başla 
*kulancıdıan ayı iste 
*o sayının 7 modu al
*cıkan sonuc hafta 7 gun göre algıla
*sonuç yazdır 
*bitii
public class Odevler{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir sayı griniz");
        int say=scanner.nextInt();
        int say1=say %7;
        switch (say1) {
            case 1:
                System.out.println(" hafta gunue göre pzartsi günüdür");
                break;
            case 2:
                System.out.println("hafta günune göre salı günüdür");
                break;
            case 3:
                System.out.println("hafta günune göre çarşampa günüdür");
                break;
            case 4:
                System.out.println("hafta günune göre perşembe günüdür");
                break;
            case 5:
                System.out.println("hafta günune göre cuma günüdür");
                break;
            case 6:
                System.out.println("hafta günune göre cumatesi günüdür");
                break;
            case 7:
                System.out.println("hafta günune göre pazar günüdür");
                break;
            default:
                break;
        }
      }
    }

 /*
   




/*
*ödev 3
*başla
sayısal sayi1,sayi2,sonuc=0
yaz "sayı 1 girin:"
oku sayi1
yaz "sayı 2 girin:"
oku sayi2
 
döngü sayac=0,sayac<sayi2, sayac=sayac+1 ise
   sonuc=sonuc+sayi1
döngü bitti
 
yaz "girdiğiniz iki sayının çarpımı:"+sonuc 
bitir
  
    
 public class Odevler{
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("lutfen 1 sayıyı giriniz");
         double say1=scanner.nextDouble();
         System.out.println("lutfen 2 sayıyı giriniz");
         double say2=scanner.nextDouble();
         
   int sayac=0;
   if(sayac<say2   );{
      
      
         
         
     }
    
     } 
 }
*/

/*// sistemden alınan sayı o syıy kadar tk sayıların toplamı
ödev 4
systemden n sayısı al
osayaıya kadar tek sayıların toplamı laçtır

public class Odevler {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        int sayı=scanner.nextInt();
        int toplam =0;
       for (int i=1; i<=sayı; i++){
           if(i%2!=0){
     toplam += i;
           }
    }
        System.out.println("sonuç   "+toplam);
    }
} 
     

*/
//a/b den birilik basmağındaki sayı bulduran program;
/* ÖDEV 5
BAŞLA 
KAVYEDEN İKİ SAYI AL 
A=PAY,B=BAYDA
C=A/B
C%10 ALARAK BİRLER BASMAĞINDAKİ SAYIYI BUL
BİTİR


import java.util.Scanner;
public class Odevler {
{

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen lutfen pay giriniz giriniz");
        int say1=scanner.nextInt();
        System.out.println("lütfen paydayı  giriniz");
        int say2 =scanner.nextInt();
        double sonuc=say1/say2;
        System.out.println(sonuc%10);
}
}
*/ 

/* //bir sayının sayıları toplamı...
ÖDEV 6
sadece birler basmağındaki toplamı 
kulancıdan sayı al
 osayı %10 al
toplam =0;
%10 ondan cıkan sonuc toplapalama ekle 
sayı 10 bolerek azalt 
sonuc yazdır 
bitir


import java.util.Scanner;

public class Odevler /*
 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("ltfen sayı giriniz ");
        int sayı=scanner.nextInt();
        int toplam =0;
        
        
        while (sayı>0) {            
            int yenis=sayı%10;
            sayı=sayı/10;
            toplam+=yenis;

        }
        System.out.println("sonucunuz: "+toplam);   
    }
}
*/



//metreden istenen brime çevirmek
/* ÖDEV 7
BAŞLA 
8 TANE İŞLEM TANIMLA 
KULANCDAN SAYUI AL
KULANCIYA YAPTIRMAK İSTEDİ İŞLEMİ SSOR VE YAP 
CIKAN SONUCU YAZDIR 
BİTİR

*/
/*
import java.util.Scanner;

public class Odevler {

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       String islemler="1)metreden santimetre\n "+
               "2)işlem disi metreye\n"  +"3)işlem dika metreye\n"+
               "4)işlem hikto metreye\n"+    "5)işlem metreden mili metreye\n"+
               "6 işlem metreden kilo metreye\n"  +"7 işlem işlemler için\n"+
                "8 harfi cıkmak icin\n";         
        System.out.println(" *********************************");
        System.out.println(islemler);
         System.out.println(" *********************************");
         System.out.println("ltfen metre olarak değrinizi girin:  ");
         int met=scanner.nextInt();
          
        while (true) { 
            System.out.println("lütfen işlem giriniz :  ");
            int ıslem=scanner.nextInt();
            if(ıslem==8)
            {
                System.out.println("cıkış yapılyor......");
                break;}

           else if (ıslem==1){
              met=met*100;
                System.out.println("girdiniz değer "+met+"cm");
           }
            else if(ıslem==2){
               met*=10;
                System.out.println("girdiniz değer "+met +"dc");

           }   
            else if(ıslem==3){
                met/=10;
                System.out.println("girdiniz değer "+met+"dk");  }    
                
            else if (ıslem==4){
                met/=100;
                 System.out.println("girdiniz değer "+met+"HK");

            }
            else if(ıslem==5){
                met*=1000;
                 System.out.println("girdiniz değer "+met+"ml");
               }
            else if (ıslem==6){
                met/=1000;
                
                 System.out.println("girdiniz değer "+met+"km");
            }
            else if(ıslem==7){
                
                System.out.println(islemler);
            }
                
            }    
          
        }

        }
       
  */    



// girilen sayının tam bölenleri

/*ÖDEV 8
BAŞLA 
x sayısı kavyeden al
x saysı n sayı bölumunden kalan 0 olanları bul 
n her daha 1 biratır
eğer koşul salandıysa n sayıları yazdır
bit

import java.util.Scanner;

public class Odevler {

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.print("bir sayı giriniz lütfen:   ");
       double x=scanner.nextInt();
       
       for(int i=1;i<=x;i++){
          if(x%i==0){
           System.out.println(i+" bir bölendir");}
 }
    }

    }
   */




//sayının tersi cözduren program
/*ÖDEV 9
KALVYEDEN BİR SAYI AL
sayı %10 alark bir basmağındaki rakamı bul
sayı 10 bölerek cıkart 
satıradımları değiştirerek coz



import java.util.Scanner;

public class Odevler{

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.print("bir sayı giriniz lütfen:   ");
        int sayi=scanner.nextInt();
        
                System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
        while(sayi > 0) {
            
            System.out.print(sayi % 10);
            sayi /= 10; 
        }
 }
            
        }
        
 */ 




//yıldızlar azarlarak cozduren program


// ödev 10




/*


public class Odevler {

    
    public static void main(String[] args) {
      
        
        int number = 4;
        for(int i=0;i<4;i++){// satır
            for(int k=number;k>0;k--){// sutun
                System.out.print("*");
            }
            number=number-1;
            System.out.println();
        }
    }
    
}
*/