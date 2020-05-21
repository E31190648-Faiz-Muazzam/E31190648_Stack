/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Struktur_Data;

/**
 *
 * @author Faiz-Muazzam
 */
public class Stack {
    //Identifikasi Variabel
    private boolean kosong,penuh;
    private int pos;
    private int max_data=5;
    private int item[]=new int[max_data];//berarti jumlah data yang di simpan di stack adalah 5 data
    
    //Constructor
    //Berfungsi untuk inisialisasi variable
    public void Stack(){
        penuh=false;//Nilai variabel false
        kosong=true;//Nilai variable True
        pos=0;//Nilai variabel pos
    }
    
    //Berfungsi untuk mengembalikan nilai boolean penuh dalam setiap proses pop maupun push
    public boolean isPenuh (){
        return (penuh);
    }
    //Berfungsi untuk mengembalikan nilai boolean kosong dalam setiap proses pop maupun push
    public boolean isKosong (){
        return (kosong);
    }
    //Proses Push (Menambahkan data)
    public void push (int data){
        System.out.print("Hasil : ");
        if(!isPenuh()){//Jika Stack belum penuh maka akan melakukan proses sebagai berikut
            item[pos++]=data;//setiap data yang di inputkan akan tersimpan di dalam array dan index array akan bergeser sampai stack penuh
            kosong=false;//merubah boolean kosong menjadi false agar dapat menambah data
            if(pos==max_data){//jika data sudah penuh
                penuh=true;//maka boolean penuh menjadi true dan kondisi pertama sudah tidak terpenuhi, lalu proses push berhenti
            }
            //Output jika sudah menambahkan data
            System.out.println("Data Sudah Ditambahkan");
        }else{
            //Output jika stack sudah penuh
            System.out.println("Stack Sudah Penuh");
        }
        System.out.println("==================================================");
        return; //untuk mengembalikan hasil setiap proses yang terjadi
    }
    
    //Proses Pop (Mengambil data)
    public int pop(){
        int x=0;//identifikasi variabel x
        System.out.println("Hasil : ");
        if (!isKosong()) {//jika data tidak kosong maka akan melakukan proses berikut ini
            x=item[--pos];//setiap mekakukan pop, nilai index akan berkurang, dan selalu mengambil data yang terakhir
            penuh=false;
            System.out.println("Data yang di Pop adalah "+item[pos]);
            System.out.println("Keterangan : ");
            item[pos]=0;//mengkosong kan data yang sudah di ambil
            if(pos==0){//kondisi jika stuck sudah kosong
                kosong=true;//merubah bolean kosong menjadi true agar kondisi yang di atas menjadi tidak terpenuhi
                System.out.println("Stack Kosong");
            }else{
                //tampilan jika stuck belum kosong
                System.out.println("Data sudah di ambil");
            }
        }else{
            //tampilan jika belumada data sama sekali
            System.out.println("Stack Masih Kosong : \n");
        }
        System.out.println("==================================================");
        return(x); //mengembalikan setiap nilai x
    }
    
    //Untuk menammpilkan data di dalam stack
    public void display(){
        System.out.println("Isi stuck adalah");
        for (int i = 0; i < pos; i++) {
            System.out.println("Node"+(1+i)+" : "+item[i]+"");
        }
        System.out.println("==================================================");
        System.out.println("\n");     
    }
}
