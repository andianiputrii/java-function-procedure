class Intro{
    public static void main(String[] args) {
        
        HitungBangunRuang.HitungLuasSegitiga(40, 59);
        System.out.println(HitungBangunRuang.LuasLingkaran(7));
        HitungBangunRuang.HitungLuasTabung(7, 9);
        
    }
}

class HitungBangunRuang{
        
    public static void HitungLuasSegitiga(double alas, double tinggi){
        Double luas = alas * tinggi /2;
        System.out.println(luas);
    }

    public static double LuasLingkaran(double r){
        final double pi = 3.14;
        double luas = r*r*pi;
        return luas;
    }

    public static void HitungLuasTabung(double r, double tinggi){
        double volume = LuasLingkaran(r) * tinggi;
        System.out.println(volume);
    }

}

