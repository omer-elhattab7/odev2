
import java.util.Scanner;

  /* ÖDEV 1 
BAŞLA 
KAVYEDEN İKİ SAYI AL 
A=PAY,B=BAYDA
C=A/B
C%10 ALARAK BİRLER BASMAĞINDAKİ SAYIYI BUL
BİTİR


import java.util.Scanner;
public class odev3 {

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








/* 
ÖDEV 2
sadece birler basmağındaki toplamı 
kulancıdan sayı al
 osayı %10 al
toplam =0;
%10 ondan cıkan sonuc toplapalama ekle 
sayı 10 bolerek azalt 
sonuc yazdır 
bitir


import java.util.Scanner;

public class odev3 {

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


/* ÖDEV 3
BAŞLA 
8 TANE İŞLEM TANIMLA 
KULANCDAN SAYUI AL
KULANCIYA YAPTIRMAK İSTEDİ İŞLEMİ SSOR VE YAP 
CIKAN SONUCU YAZDIR 
BİTİR

*/
/*
import java.util.Scanner;

public class odev3 {

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
    





/*ÖDEV 4
BAŞLA 
x sayısı kavyeden al
x saysı n sayı bölumunden kalan 0 olanları bul 
n her daha 1 biratır
eğer koşul salandıysa n sayıları yazdır
bit

import java.util.Scanner;

public class odev3 {

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





/*ÖDEV 5
KALVYEDEN BİR SAYI AL
sayı %10 alark bir basmağındaki rakamı bul
sayı 10 bölerek cıkart 
satıradımları değiştirerek coz



import java.util.Scanner;

public class odev3 {

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
        
 /*ÖDEV 6
BAŞLA KULANCIDN BİR SAYI AL 
İÇ İÇE DONGULERLE KULAN 
HER 1 SATIR AALDI ZAMAN SUTUNU BİR AZALT
SONUC YADIR 
BİTİR
****
***
**
*

*/
    
 public class odev3{
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("lütfen sayı giriniz:    ");
                int x=scanner.nextInt();
                
         for(int i=x;i>=0;i++){
             for(int j=x;j>=i;j++){
                 System.out.print("*");
             
             
             
         }System.out.println("");
         
         
         
         
     }
     
     
     
     }
 }
        
    
