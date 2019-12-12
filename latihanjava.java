public class latihanjava{
    public static void main(String[] args) {
        //Tipe data primitif 
        char grade = 'A'; // tipe data char
        int angka1 = 7; // tipe data integer/bilangbulat
        double phi = 3.14; // tipe data double/desimal
        Boolean isRain = true;

        System.out.println(grade);
        System.out.println(angka1);
        System.out.println(phi);

        //Tipe data reference
        String nama = args[2];
        System.out.println("welcome,"+nama.toUpperCase()); 
        int a = Integer.parseInt(args[0]); //convert from string to integer
        int b = Integer.parseInt(args[1]);
        System.out.println(a+b);
    }
}        
