public class Main {
    public static void main(String[] args) {
        Guru GuruSIMDIG = new Guru("Muhammad Ustman Muzakki, S. Kom.", 111, "S1 Teknik Informatika", "Laki - laki", "Simulasi Digital");
        System.out.println("Nama: " + GuruSIMDIG.getNama());
        System.out.println("NIP: " + GuruSIMDIG.getNIP());
        System.out.println("Pendidikan: " + GuruSIMDIG.getPendidikan());
        System.out.println("Gender: " + GuruSIMDIG.getGender());
        System.out.println("Mata Pelajaran: " + GuruSIMDIG.getMapel());
        GuruSIMDIG.kerja();
        GuruSIMDIG = null;
        System.gc();
    }

}
