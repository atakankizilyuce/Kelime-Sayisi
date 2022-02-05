package kelimesayisinibulanprogram;
import java.util.Scanner;
public class KelimeSayisiniBulanProgram {
 
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner girdi= new Scanner(System.in);
        System.out.println("kelime sayisini ogrenmek istediginiz metini giriniz :");
        String girilenMetin = girdi.nextLine();
        int sayac=0;
        for (int i = 0;i<=(girilenMetin.length()-1);i++)
        {
        	if(  ( (i>0)&& (girilenMetin.charAt(i)!=' ') &&(girilenMetin.charAt(i-1)==' ')) || ((girilenMetin.charAt(i)!=' ')&&(i==0)) )
        		sayac++;    
        }
         System.out.println("metindeki kelime sayisi :"+sayac);
         girdi.close();
}
 
}

