public class app{
    public static void main (String[] args){
        System.out.println("Selamat datang di aplikasi ini !");
        Mobil objMobil = new Mobil ();
        objMobil.merk = "Toyota Avanza Anjay";
        objMobil.nyalakanMesin();
        objMobil.maju(); 
    
        Mobil bmw = new Mobil ();
        bmw.merk = "bmw 3301";
        bmw.maju();
        
         Segitiga segitigaA = new Segitiga();
        segitigaA.alas = 10;
        segitigaA.tinggi = 15;
        segitigaA.hitungluas();

        Segitiga segitigaB = new Segitiga();
        segitigaB.alas = 5;
        segitigaB.tinggi = 20;
        segitigaB.hitungluas();
        }
    }    
    
class Mobil{
    String merk;
    int jumlahRoda;
    String warna;

    public void maju (){
        System.out.println("Mobil "+this.merk+" maju. ngenggggg !!!!");
    }

    public void nyalakanMesin(){
        System.out.println("Mesin menyala");
    }    
}

     class Segitiga{
         //attribut / ciri-ciri
         int alas;
         int tinggi;

         //method / perilaku
         public void hitungluas(){
            double luas = this.alas = this.tinggi / 2;
            System.out.println(luas);
         }
    }            