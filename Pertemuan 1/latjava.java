package com.mycompany.java;

import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class latjava {
    public String nama;
    public double n1;
    public int n2,n3;
    Scanner input = new Scanner  (System.in);
    
    public String getnama(){ 
        return nama;
    }
    public void inputScanner(){ 
        
        System.out.print("Masukan Nama Anda : ");
        nama = input.nextLine();
        System.out.print("Masukan Nilai 1 :");
        n1 = input.nextDouble();
        System.out.print("Masukan Nilai 2 ");
        n2 = input.nextInt(); 
    }
    public double rata(){ 
        
    return ((n1 + n2)/2);
    }
}
