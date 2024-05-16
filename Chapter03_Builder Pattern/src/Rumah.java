class Rumah {
    private String tipe;
    private int kamarTidur;
    private int kamarMandi;
    private boolean punyaGarasi;
    private boolean punyaTaman;

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setKamarTidur(int kamarTidur) {
        this.kamarTidur = kamarTidur;
    }

    public void setKamarMandi(int kamarMandi) {
        this.kamarMandi = kamarMandi;
    }

    public void setPunyaGarasi(boolean punyaGarasi) {
        this.punyaGarasi = punyaGarasi;
    }

    public void setPunyaTaman(boolean punyaTaman) {
        this.punyaTaman = punyaTaman;
    }

    @Override
    public String toString() {
        return "Rumah{" +
                "tipe='" + tipe + '\'' +
                ", kamarTidur=" + kamarTidur +
                ", kamarMandi=" + kamarMandi +
                ", punyaGarasi=" + punyaGarasi +
                ", punyaTaman=" + punyaTaman +
                '}';
    }
}

// Kelas RumahBuilder
class RumahBuilder {
    private Rumah rumah;

    public RumahBuilder() {
        this.rumah = new Rumah();
    }

    public RumahBuilder setTipe(String tipe) {
        rumah.setTipe(tipe);
        return this;
    }

    public RumahBuilder setKamarTidur(int kamarTidur) {
        rumah.setKamarTidur(kamarTidur);
        return this;
    }

    public RumahBuilder setKamarMandi(int kamarMandi) {
        rumah.setKamarMandi(kamarMandi);
        return this;
    }

    public RumahBuilder setPunyaGarasi(boolean punyaGarasi) {
        rumah.setPunyaGarasi(punyaGarasi);
        return this;
    }

    public RumahBuilder setPunyaTaman(boolean punyaTaman) {
        rumah.setPunyaTaman(punyaTaman);
        return this;
    }

    public Rumah build() {
        return this.rumah;
    }
}