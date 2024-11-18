class labrpl{
    String nama;
    String alamat;
    int tinggi;
    int umur;

    labrpl(String nama,String alamat,int tinggi,int umur){
        this.nama = nama;
        this.alamat = alamat;
        this.tinggi = tinggi;
        this.umur = umur;
    }
    void display(){
        System.out.println("Nama : "+this.nama);
        System.out.println("Alamat :"+this.alamat);
        System.out.println("Tinggi : "+this.tinggi);
        System.out.println("Umur : "+this.umur);
        System.out.println("");
    }

}

class HelloWorld {
    public static void main(String[] args) {
      labrpl rasyid = new labrpl("Rasyid ridho" , "bojong sirna" , 167 ,17);
        rasyid.display();
        
        labrpl Risman = new labrpl("Risman Maulana" , "panyaweuyan", 169,16);
        Risman.display();
        
        labrpl Akbar = new labrpl("Akbar maulana" ," sampiren",  170, 17);
        Akbar.display();

    }
}
