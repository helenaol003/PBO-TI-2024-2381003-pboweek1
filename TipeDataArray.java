public class TipeDataArray {
    public static void main(String[] args) {
        //Array adalah sekumpulan data yang memiliki tipe data yang sama

        //Cara 1
        Object[] kumpulanNumber; // deklarasi
        kumpulanNumber = new Object [3]; // inisialisasi

        //Cara 2
      //  int [] kumpulanNumber2 = new int [3];

        //Cara 3
      //  int[] kumpulanNumber3 = new int[] {1, 3, 4, 5};

        //cara memasukkan value ke array
        kumpulanNumber[0] = 100;
        kumpulanNumber[1] = "Helena";
        kumpulanNumber[2] = 300;

        //cara mengakses
        System.out.println(kumpulanNumber[1]);

        //length
        System.out.println(kumpulanNumber[0]);
    }
}
