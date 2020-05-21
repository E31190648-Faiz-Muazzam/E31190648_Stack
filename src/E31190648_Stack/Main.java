/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E31190648_Stack;
import java.util.*;//memamnggil class java
/**
 *
 * @author Faiz-Muazzam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //identifikasi variabel
        int pilihan;
        int data;
        //memanggil class stack
        Stack result = new Stack();
        //melakukan looping
        do{
            System.out.println("1. PUSH");
            System.out.println("2. POP ITEM");
            System.out.println("3. LIHAT ISI DATA");
            System.out.println("0. KELUAR");
            System.out.println("Masukkan Pilihan : ");
            //memanggil scanner
            Scanner input=new Scanner(System.in);
            //membuat scanner dengan nama input
            pilihan=input.nextInt();
            
            //Buat kondisi untuk setiap inputan yang sesuai dengan keterangan
            //kondisi jika memlih push
            if (pilihan==1) {
                System.out.println("Data yang ditambahkan : ");
                data=input.nextInt();//menginput nilai yang di push
                result.push(data);//memanggil method push
            }else if(pilihan==2){//kondisi jika memilih pop
                result.pop();//memanggil fungsi pop
            }else if (pilihan==3) {//kondisi jika memilih Lihat Isi Data
                result.display();//memanggil method display
            }else if (pilihan==0) {//kondisi k=jika memilih keluar
                System.exit(0);//memanggil method java untuk keluar system
            }else{//jika user menginput yang ti dak sesuai dengan keterangan
                System.out.println("Pilihan Tidak Ada");
            }
        }while(pilihan !=0);//berhenti ketika user memilih angka 0 atau keluar
    }
    
}
