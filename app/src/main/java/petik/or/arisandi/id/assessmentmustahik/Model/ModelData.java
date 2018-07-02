package petik.or.arisandi.id.assessmentmustahik.Model;

/**
 * Created by PeTIK on 02/07/2018.
 */

public class ModelData {
    String no_identitas, nama, tmp_lahir,tgl_lahir,pekerjaan,pendidikan,alamat,desa,kecamatan,kabupaten,provinsi;

    public ModelData(){}

    public ModelData(String no_identitas, String nama, String tmp_lahir, String tgl_lahir, String pekerjaan, String pendidikan, String alamat, String desa, String kecamatan, String kabupaten, String provinsi) {

        this.no_identitas = no_identitas;
        this.nama = nama;
        this.tmp_lahir = tmp_lahir;
        this.tgl_lahir = tgl_lahir;
        this.pekerjaan = pekerjaan;
        this.pendidikan = pendidikan;
        this.alamat = alamat;
        this.desa = desa;
        this.kecamatan = kecamatan;
        this.kabupaten = kabupaten;
        this.provinsi = provinsi;
    }

    public String getNo_identitas() {
        return no_identitas;
    }

    public void setNo_identitas(String no_identitas) {
        this.no_identitas = no_identitas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTmp_lahir() {
        return tmp_lahir;
    }

    public void setTmp_lahir(String tmp_lahir) {
        this.tmp_lahir = tmp_lahir;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }
}
