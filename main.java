import java.io.*;
import java.util.Scanner;
 
class GFG {
// kovaryans hesaplayan fonksiyon.
static float covariance(float arr1[],
                    float arr2[], int n)
{
    float sonuc1 = 0;
     
    for(int i = 0; i < n; i++)
        sonuc1 = sonuc1 + (arr1[i] - orta(arr1, n)) *
                        (arr2[i] - orta(arr2, n));
    return sonuc1 / (n - 1);
}
// ortalama bulan fonksiyon.
 static float orta(float arr[], int c)
{
    float sonuc = 0;
     
    for(int i = 0; i < c; i++)
        sonuc = sonuc + arr[i];
     
    return sonuc / c;
}

 static float correlationCoefficient(int X[],
                                    int Y[], int n)
    {
      
        int sonuc_X = 0, sonuc_Y = 0, sonuc_XY = 0;
        int squareSum_X = 0, squareSum_Y = 0;
      
        for (int i = 0; i < n; i++)
        {
            // X dizisinin elemanları toplamı
            sonuc_X = sonuc_X + X[i];
      
            // Y dizisinin elemanları toplamı
            sonuc_Y = sonuc_Y + Y[i];
      
            // X[i] * Y[i] toplamı.
            sonuc_XY = sonuc_XY + X[i] * Y[i];
      
            // array elementlerinin kareleri toplamı.
            squareSum_X = squareSum_X + X[i] * X[i];
            squareSum_Y = squareSum_Y + Y[i] * Y[i];
        }
      
        // korelasyon katsayısı bulma formülü.
        float corr = (float)(n * sonuc_XY - sonuc_X * sonuc_Y)/
                     (float)(Math.sqrt((n * squareSum_X -
                     sonuc_X * sonuc_X) * (n * squareSum_Y -
                     sonuc_Y * sonuc_Y)));
      
        return corr;
    }
      
    public static void main (String[] args) {
        System.out.println("Covariance hesabı için 1; correlation coefficient hesabı için 2ye basın... \n");
        Scanner myObj2 = new Scanner(System.in); 
        int deger=myObj2.nextInt();
        if(deger==1){
        System.out.println("Lutfen ilk diziyi giriniz...\n Kac elemanlı dizi gireceksiniz?");
        Scanner myObj = new Scanner(System.in); 
        int sayi=myObj.nextInt();
        float[] arr1=new float[sayi];
        
        for(int i=0;i<sayi;i++){
            System.out.println("Lutfen ilk dizinin "+ i + ". elemanını gir.");   
        arr1[i]=myObj.nextFloat();
            System.out.println("\n");
        
        }
       
        System.out.println("Lutfen ikinci diziyi giriniz...\n Kac elemanlı dizi gireceksiniz?");
        
        int sayi2=myObj.nextInt();
        float[] arr2=new float[sayi2];
        
        for(int i=0;i<sayi;i++){
            System.out.println("Lutfen ikinci dizinin "+ i + ". elemanını gir.");
        arr2[i]=myObj.nextFloat();
        System.out.println("\n");
        
        }
        

    if (sayi == sayi2)
    System.out.println(covariance(arr1, arr2, sayi2));
        
        } //korelasyon katsayısı:
        else if(deger==2)
        {
        System.out.println("Lutfen ilk diziyi giriniz...\n Kac elemanlı dizi gireceksiniz?");
        Scanner myObj = new Scanner(System.in); 
        int sayi=myObj.nextInt();
        int[] arr1=new int[sayi];
        
        for(int i=0;i<sayi;i++){
            System.out.println("Lutfen ilk dizinin "+ i + ". elemanını gir.");   
        arr1[i]=myObj.nextInt();
        System.out.println("\n");
        
        }
       
        System.out.println("Lutfen ikinci diziyi giriniz...\n Kac elemanlı dizi gireceksiniz?");
        
        int sayi2=myObj.nextInt();
        int[] arr2=new int[sayi2];
        
        for(int i=0;i<sayi;i++){
            System.out.println("Lutfen ikinci dizinin "+ i + ". elemanını gir.");
        arr2[i]=myObj.nextInt();
        System.out.println("\n");
        
        }
        
            
            System.out.printf("%6f",
                 correlationCoefficient(arr1, arr2, sayi));
        }
     
    }
}
