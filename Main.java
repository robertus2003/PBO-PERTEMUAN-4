public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan1 = new Perpustakaan();
        perpustakaan1.nama = "Perpusatakan";

        perpustakaan1.inputBuku("A1", "SEJARAH MU", 3);
        perpustakaan1.inputBuku("A2", "SIR A.ferguson documentery", 0);
        perpustakaan1.inputBuku("A4", "TRAGEDI MUNICH 1958", 1);

        perpustakaan1.cekBuku("A1");
        perpustakaan1.cekBuku("A2");
        perpustakaan1.cekBuku("A4");

        perpustakaan1.cekDataBukuAdaAtauTidak("A3");
        perpustakaan1.cekDataBukuAdaAtauTidak("A2");
        perpustakaan1.cekDataBukuAdaAtauTidak("A1");
        perpustakaan1.cekDataBukuAdaAtauTidak("A4");

        perpustakaan1.cariBuku("win");
        perpustakaan1.cariBuku("draw");
        perpustakaan1.cariBuku("lose");
    }
}
