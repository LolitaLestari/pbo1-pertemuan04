public class Main {
    public static void main (String[] args){
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("Isi gelas sekarang : " + isiGelas + "m1");
        System.out.println("isi gelas ketika penuh : " + penuh + "m1");

        while (isiGelas != penuh){
            isiGelas++;
            System.out.println("Sedang mengisi gelas.. ");
            System.out.println("isi gelas sekarang : " + isiGelas + "m1");
        }
    }
}
