import java.util.Scanner;

class HitungBangunRuang{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int ulang;
        boolean menu = true;

        do {

            Rumus.menu();

            System.out.println("Apakah Ingin Mengulang ?(ketik 1 untuk ulang)");
            ulang = input.nextInt();
            if(ulang != 1){
                menu = false;
            }
        } while ( menu == true);
    }

}

class Rumus{
    public static void print(String s){
        System.out.println(s);
    }
    public static void menu(){
        print("Menu Hitung Bangun Ruang");
        print("1. Luas Segitiga");
        print("2. Volume Balok");
        print("3. Volume Prisma Segitiga"); 
        print("4. Volume Kerucut");
        print("5. Exit");

        Scanner input = new Scanner(System.in);
        print("Masukan Pilihan anda : ");
        int masukan = input.nextInt();
        
        switch(masukan){
            case 1 : 
                try{
                    print("Masukan Alas : ");
                    int alas = input.nextInt();
                    print("Masukan Tinggi : ");
                    int tinggi = input.nextInt();
                    System.out.println(LuasSegitiga(alas, tinggi));
                    
                } catch (Exception e) {
                    print("angka Yang Anda Masukan Salah");
                }
                break;  
        
            case 2 :
                try {
                    print("Masukan Panjang : ");
                    int p = input.nextInt();
                    print("Masukan Lebar : ");
                    int l = input.nextInt();
                    print("Masukan Tinggi : ");
                    int t = input.nextInt();
                    LuasBalok(p, l, t);
                } catch (Exception e) {
                    print("angka Yang Anda Masukan Salah");
                }
                break;
            case 3 :
                try {
                    print("Masukan Alas Segitiga : ");
                    int alasSg = input.nextInt();
                    print("Masukan tinggi Segitiga : ");
                    int tinggiSg = input.nextInt();
                    print("Masukan tinggi prisma : ");
                    int tinggiPrisma = input.nextInt();
                    VolumePrismaSegitiga(alasSg, tinggiSg, tinggiPrisma);     
                } catch (Exception e) {
                    print("angka Yang Anda Masukan Salah");
                }
                break;
            case 4 :
                try {
                    print("Masukan jari-jari : ");
                    double  r = input.nextDouble();
                    print("Masukan tinggi : ");
                    double tng = input.nextDouble();
                    LuasLingkaran(r);
                    VolumeKerucut(r, tng);
                } catch (Exception e) {
                    print("angka Yang Anda Masukan Salah");
                }
                break;
            case 5 :
                System.exit(1);
        }
    }
    public static double LuasSegitiga(int alas, int tinggi){
        double luas = alas * tinggi * 0.5;
        return luas;
    }
    public static void LuasBalok(int p , int l , int t){
        double volume = p*l*t;
        print(Double.toString(volume));
    }
    public static void VolumePrismaSegitiga(int alassg, int tinggisg, int tinggiprisma){
        double luasalas = LuasSegitiga(alassg, tinggisg);
        double volume = luasalas * tinggiprisma;
        print(Double.toString(volume));
    }
    public static double LuasLingkaran(double r){
        final double pi = 3.14;
        double luas = r*r*pi;
        return luas;
    }
    public static void VolumeKerucut(double r, double tinggi){
        double luasalas = LuasLingkaran(r);
        double volume = luasalas * tinggi / 3;
        print(Double.toString(volume));
    }
}
