class Guru extends Pegawai {
    private String Mapel;

    public Guru(String nama, int NIP, String Pendidikan, String Gender, String Mapel) {
        super(nama, NIP, Pendidikan, Gender);
        this.Mapel = Mapel;
    }

    @Override
    public void kerja() {
        System.out.println("Mengajar " + Mapel + "...");
    }

    public String getMapel() {
        return Mapel;
    }

    public void setMapel(String Mapel) {
        this.Mapel = Mapel;
    }
}
