/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Programming_18
 */
public class uts_fotokopi {
    public static void main(String[] args) throws IOException{
        BufferedReader data= new BufferedReader( new InputStreamReader(System.in));
        String pelanggan;
        int jumlahfotokopi;
        int harga;
        
        System.out.println("Apakah pelanggan? (y/t)");
        pelanggan= data.readLine();
        
        System.out.println("Masukkan jumlah fotokopi");
        jumlahfotokopi= Integer.parseInt(data.readLine());
        
        if(pelanggan.equals("y")){
            harga=75;
            int totall=jumlahfotokopi*harga;
            System.out.println("Total: "+totall);
        }else if(pelanggan.equals("t")){
            if(jumlahfotokopi<=150){
                harga=150;
                int total=jumlahfotokopi*harga;
                System.out.println("Jumlah fotokopi: "+jumlahfotokopi);
                System.out.println("Total: "+total);
            }else if(jumlahfotokopi>150 && jumlahfotokopi<=200){
                harga=100;
                int total1=jumlahfotokopi*harga;
                System.out.println("Jumlah fotokopi: "+jumlahfotokopi);
                System.out.println("Total: "+total1);
            }else{
                harga=80;
                int total2=jumlahfotokopi*harga;
                System.out.println("Jumlah fotokopi: "+jumlahfotokopi);
                System.out.println("Total: "+total2);
            }
        }
        
    }
}
