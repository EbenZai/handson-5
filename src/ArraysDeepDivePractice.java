import java.util.Arrays;
import java.util.Random;

public class ArraysDeepDivePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Arrays Deep Dive
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * array multidimensi, operasi lanjutan, parameter/return value, dan utility methods.
         */

        // ===== ARRAY MULTIDIMENSI DASAR =====
        System.out.println("=== ARRAY MULTIDIMENSI DASAR ===");

        // Latihan 1: Membuat dan mengisi array 2D (matriks)
        // - Buat array 2D integer dengan ukuran 3x4 (3 baris, 4 kolom)
        int[][] matrix=
            // - Isi array dengan nilai: baris 0: [1,2,3,4], baris 1: [5,6,7,8], baris 2: [9,10,11,12]
        {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // - Print seluruh matriks menggunakan nested loop dengan format yang rapi
        System.out.println("Menggunakan nesto for loop: ");
        for (int i=0; i<matrix.length; i++){
            for ( int j=0; j< matrix[i].length; j++){
                System.out.println(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        // Latihan 2: Array 2D dengan inisialisasi langsung
        // - Buat array 2D string yang merepresentasikan papan catur 3x3 dengan nilai awal "."
        String[][] papan= {
                {".", ".", "."},
                {".", ".", "."} ,
                {".", ".", "."}
            };

        // - Tempatkan "X" di posisi [0][0], [1][1], dan [2][2] (diagonal)
        papan[0][0] = "X";
        papan[1][1] = "X";
        papan[2][2] = "X";
        // - Tempatkan "O" di posisi [0][2], [1][0], dan [2][1]
        papan[0][2] = "0";
        papan[1][0] = "0";
        papan[2][1] = "0";

        // - Print papan dengan format grid yang rapi

        for (int i = 0; i < papan.length; i++) {
            for (int j = 0; j < papan[i].length; j++) {
                System.out.print(papan[i][j] + " ");
            }
            System.out.println();
        }


        // ===== ARRAY JAGGED (IRREGULAR) =====
        System.out.println("\\n=== ARRAY JAGGED (IRREGULAR) ===");

        // Latihan 3: Array dengan panjang baris yang berbeda
        // - Buat array 2D integer dengan 4 baris: baris 0 panjang 2, baris 1 panjang 4, baris 2 panjang 3, baris 3 panjang 5
        int[][] jaggedArray = new int[4][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[3];
        jaggedArray[3] = new int[5];


        // - Isi setiap baris dengan angka berurutan dimulai dari 1
        int angka = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = angka++;
            }
        }



        // - Print array jagged dengan menampilkan panjang setiap baris
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.print("Baris " + i + " (panjang " + jaggedArray[i].length + "): ");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }


        // ===== OPERASI LANJUTAN PADA ARRAY =====
        System.out.println("\\n=== OPERASI LANJUTAN PADA ARRAY ===");

        // Latihan 4: Operasi matematika pada array 2D
        // - Buat dua matriks 2x3 dengan nilai bebas
        int [][] matrix1= {
                {1,2,4},
                {2,3,4}
        };
        int [][] matrix2={
                {2,4,3},
                {3,4,5}
        };

        // - Implementasikan penjumlahan matriks (buat method addMatrices)
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);
        int[][] hasilTambah = addMatrices(matrix1, matrix2);
        System.out.println("\nHasil penjumlahan:");
        displayMatrix(hasilTambah);

        // - Implementasikan perkalian setiap elemen dengan scalar 2 (buat method multiplyByScalar)
        int[][] hasilKali = multiplyByScalar(matrix1, 2);
        System.out.println("Hasil kali scalar 2:");
        displayMatrix(hasilKali);
        // - Print hasil operasi


        // ===== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE =====
        System.out.println("\\n=== ARRAY SEBAGAI PARAMETER DAN RETURN VALUE ===");

        // Latihan 5: Method yang menerima dan mengembalikan array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // - Panggil method sortArray untuk mengurutkan array

        // (implementasikan method sortArray yang menerima array dan mengembalikan array yang sudah diurutkan)
        System.out.println("Array asli: " + Arrays.toString(numbers));
        int[] sorted = sortArray(numbers.clone());
        System.out.println("Setelah diurutkan: " + Arrays.toString(sorted));
        // - Panggil method reverseArray untuk membalik array
        // (implementasikan method reverseArray)
        int[] reversed = reverseArray(numbers.clone());
        System.out.println("Setelah dibalik: " + Arrays.toString(reversed));



        // - Panggil method findMinMax untuk mencari nilai minimum dan maksimum
        // (implementasikan method yang mengembalikan array int dengan 2 elemen: [min, max])
        int[] minmax = findMinMax(numbers);
        System.out.println("Nilai min: " + minmax[0] + ", max: " + minmax[1]);

        // ===== UTILITY METHODS JAVA.UTIL.ARRAYS =====
        System.out.println("\\n=== UTILITY METHODS JAVA.UTIL.ARRAYS ===");

        // Latihan 6: Eksplorasi utility methods Arrays
        int[] data = {5, 2, 8, 1, 9, 3};

        // - Gunakan Arrays.toString() untuk print array
        System.out.println("Array: "+Arrays.toString(data));

        // - Gunakan Arrays.sort() untuk mengurutkan array
        Arrays.sort(data);
        System.out.println("Setelah sort: " + Arrays.toString(data));

        // - Gunakan Arrays.binarySearch() untuk mencari elemen (array harus sudah diurutkan)
        int indexcari=Arrays.binarySearch(data,8);
        System.out.println("Index angka 8: "+ indexcari);


        // - Gunakan Arrays.fill() untuk mengisi array dengan nilai tertentu
        int[] array1 = new int[5];
        Arrays.fill(array1, 10);
        System.out.println("Array fill: "+ Arrays.toString(array1));

        // - Gunakan Arrays.equals() untuk membandingkan dua array
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        int[] a3 = {1, 2, 4};
        System.out.println("a1 sama dengan a2? " + Arrays.equals(a1, a2));
        System.out.println("a1 sama dengan a3? " + Arrays.equals(a1, a3));

        // - Gunakan Arrays.copyOf() untuk membuat copy array dengan ukuran berbeda
        int[] ori = {10, 20, 30, 40, 50};
        int[] copy1 = Arrays.copyOf(ori, 3);
        int[] copy2 = Arrays.copyOf(ori, 7);
        System.out.println("Original: " + Arrays.toString(ori));
        System.out.println("Copy ukuran 3: " + Arrays.toString(copy1));
        System.out.println("Copy ukuran 7: " + Arrays.toString(copy2));

        // ===== ARRAY 3D DAN KOMPLEKS =====
        System.out.println("\\n=== ARRAY 3D DAN KOMPLEKS ===");

        // Latihan 7: Array 3 dimensi
        // - Buat array 3D integer ukuran 2x3x4 (seperti 2 buah matriks 3x4)
        int [][] [] array3D= new int[2][3][4];

        // - Isi dengan nilai berurutan dari 1
        int nilai = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    array3D[i][j][k] = nilai;
                    nilai++;
                }
            }
        }

        // - Print menggunakan triple nested loop dengan format yang jelas
        for (int i = 0; i < 2; i++) {
            System.out.println("Matriks ke-" + (i+1) + ":");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // ===== SKENARIO APLIKASI NYATA =====
        System.out.println("\\n=== SKENARIO APLIKASI NYATA ===");

        // Latihan 8: Sistem nilai mahasiswa
        // - Buat array 2D untuk menyimpan nilai 5 mahasiswa, 4 mata kuliah
        String[] namaMahasiswa = {"Alice", "Bob", "Charlie", "Diana", "Eva"};
        String[] mataKuliah = {"Math", "Physics", "Chemistry", "Biology"};
        int [][] nilaimahasiswa=new int[5][4];

        // - Isi dengan nilai random antara 60-100
        fillRandomGrades(nilaimahasiswa,60,100);

        // - Hitung rata-rata per mahasiswa
        System.out.println("\nRata-rata per Mahasiswa:");
        for (int i = 0; i < namaMahasiswa.length; i++) {
            double total = 0;
            for (int j = 0; j < mataKuliah.length; j++) {
                total += nilaimahasiswa[i][j];
            }
            double rataRata = total / mataKuliah.length;
            System.out.printf("%s: %.2f\n", namaMahasiswa[i], rataRata);
        }
        // - Hitung rata-rata per mata kuliah
        System.out.println("\nRata-rata per Mata Kuliah:");
        for (int j = 0; j < mataKuliah.length; j++) {
            double total = 0;
            for (int i = 0; i < namaMahasiswa.length; i++) {
                total += nilaimahasiswa[i][j];
            }
            double rataRata = total / namaMahasiswa.length;
            System.out.printf("%s: %.2f\n", mataKuliah[j], rataRata);
        }


        // - Tentukan mahasiswa dengan nilai tertinggi
        double nilaiTertinggi = 0;
        String mahasiswaTerbaik = "";
        for (int i = 0; i < namaMahasiswa.length; i++) {
            double total = 0;
            for (int j = 0; j < mataKuliah.length; j++) {
                total += nilaimahasiswa[i][j];
            }
            double rataRata = total / mataKuliah.length;
            if (rataRata > nilaiTertinggi) {
                nilaiTertinggi = rataRata;
                mahasiswaTerbaik = namaMahasiswa[i];
            }
        }
        System.out.printf("\nMahasiswa dengan nilai tertinggi: %s (%.2f)\n",
                mahasiswaTerbaik, nilaiTertinggi);


        // - Print dalam format tabel yang rapi
        System.out.println("\n=== TABEL NILAI MAHASISWA ===");
        System.out.printf("%-10s", "Nama");
        for (String mk : mataKuliah) {
            System.out.printf("%-12s", mk);
        }
        System.out.printf("%-10s\n", "Rata-rata");
        System.out.println("=".repeat(70));

        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.printf("%-10s", namaMahasiswa[i]);
            double total = 0;
            for (int j = 0; j < mataKuliah.length; j++) {
                System.out.printf("%-12d", nilaimahasiswa[i][j]);
                total += nilaimahasiswa[i][j];
            }
            System.out.printf("%-10.2f\n", total / mataKuliah.length);
        }

        // Latihan 9: Game Tic-Tac-Toe sederhana
        System.out.println("\n=== GAME TIC-TAC-TOE ===");
        // - Buat array 2D char 3x3 untuk papan permainan
        char[][] papanTTT = new char[3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                papanTTT[i][j] = '-';
            }
        }

        // - Implementasikan method untuk menampilkan papan
        System.out.println("Papan awal:");
        tampilkanPapan(papanTTT);

        // - Implementasikan method untuk mengecek apakah ada pemenang
        papanTTT[0][0] = 'X';
        papanTTT[1][1] = 'O';
        papanTTT[0][1] = 'X';
        papanTTT[2][2] = 'O';
        papanTTT[0][2] = 'X';

        // - Simulasikan beberapa langkah permainan

        System.out.println("\nSetelah beberapa langkah:");
        tampilkanPapan(papanTTT);

        char pemenang = cekPemenang(papanTTT);
        if(pemenang != '-') {
            System.out.println("\nPemenangnya: " + pemenang + "!");
        } else {
            System.out.println("\nBelum ada yang menang");
        }
    }



    // ===== IMPLEMENTASI METHODS =====
    // TODO: Implementasikan method-method yang diperlukan di sini

    // Method untuk penjumlahan matriks
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // Implementasi penjumlahan matriks
        int baris = matrix1.length;
        int kolom = matrix1[0].length;
        int [][] hasil = new int [baris][kolom];
        for(int i=0; i<baris; i++) {
            for(int j=0; j<kolom; j++) {
                hasil[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return hasil;
    }

    // Method untuk perkalian scalar
    public static int[][] multiplyByScalar(int[][] matrix, int scalar) {
        // Implementasi perkalian scalar
        int baris = matrix.length;
        int kolom = matrix[0].length;
        int[][] hasil = new int[baris][kolom];


        for(int i=0; i<baris; i++) {
            for(int j=0; j<kolom; j++) {
                hasil[i][j] = matrix[i][j] * scalar;
            }
        }
        return hasil;
    }

    // Method untuk sorting array
    public static int[] sortArray(int[] arr) {
        // Implementasi sorting (bisa menggunakan Arrays.sort atau implementasi sendiri)
        Arrays.sort(arr);
        return arr; // Ganti dengan implementasi yang benar
    }

    // Method untuk reverse array
    public static int[] reverseArray(int[] arr) {
        // Implementasi reverse array
        int[] hasil = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            hasil[i] = arr[arr.length - 1 - i];
        }
        return hasil;// Ganti dengan implementasi yang benar
    }
    // Method untuk find min dan max
    public static int[] findMinMax(int[] arr) {
        // Return array dengan format [min, max]
        int min = arr[0];
        int max= arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        return new int[]{min,max} ; // Ganti dengan implementasi yang benar
    }

    // Method untuk display array 2D
    public static void displayMatrix(int[][] matrix) {
        // Implementasi untuk menampilkan matriks dengan format rapi
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }


    // Method untuk mengisi array 2D dengan nilai random

    public static void fillRandomGrades(int[][] grades, int min, int max) {
        // Implementasi untuk mengisi array dengan nilai random
        Random rand = new Random();
        for(int i=0; i<grades.length; i++) {
            for(int j=0; j<grades[i].length; j++) {
                grades[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
    }

    // Method untuk menghitung rata-rata array
    public static double calculateAverage(int[] values) {
        // Implementasi untuk menghitung rata-rata
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum/ values.length; // Ganti dengan implementasi yang benar
    }
// Method untuk menampilkan papan Tic-Tac-Toe
public static void tampilkanPapan(char[][] papan) {
    for(int i=0; i<papan.length; i++) {
        for(int j=0; j<papan[i].length; j++) {
            System.out.print(papan[i][j] + " ");
        }
        System.out.println();
    }
}

// Method untuk mengecek pemenang Tic-Tac-Toe
public static char cekPemenang(char[][] papan) {
    // Cek baris
    for(int i=0; i<3; i++) {
        if(papan[i][0] == papan[i][1] &&
                papan[i][1] == papan[i][2] &&
                papan[i][0] != '-') {
            return papan[i][0];
        }
    }

    // Cek kolom
    for(int j=0; j<3; j++) {
        if(papan[0][j] == papan[1][j] &&
                papan[1][j] == papan[2][j] &&
                papan[0][j] != '-') {
            return papan[0][j];
        }
    }

    // Cek diagonal utama
    if(papan[0][0] == papan[1][1] &&
            papan[1][1] == papan[2][2] &&
            papan[0][0] != '-') {
        return papan[0][0];
    }

    // Cek diagonal sekunder
    if(papan[0][2] == papan[1][1] &&
            papan[1][1] == papan[2][0] &&
            papan[0][2] != '-') {
        return papan[0][2];
    }

    return '-'; // Tidak ada pemenang
}
}


