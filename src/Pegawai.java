abstract class Pegawai {
    private String nama;
    private int NIP;
    private String Pendidikan;
    private String Gender;

    public Pegawai(String nama, int NIP, String Pendidikan, String Gender) {
        this.nama = nama;
        this.NIP = NIP;
        this.Pendidikan = Pendidikan;
        this.Gender = Gender;
    }

    public abstract void kerja();

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public String getPendidikan() {
        return Pendidikan;
    }

    public void setPendidikan(String Pendidikan) {
        this.Pendidikan = Pendidikan;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gener) {
        this.Gender = Gender;
    }
}
