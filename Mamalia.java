/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugassatu;

/**
 *
 * @author USER
 */
public class Mamalia extends Hewan {

    private String perawatanAnak;
    private String adaptasiFisik;

    public void setperawatanAnak(String caraMerawat) {
        this.perawatanAnak = caraMerawat;
    }

    public String getperawatanAnak() {
        return this.perawatanAnak;
    }

    public void setadaptasiFisik(String fisik) {
        this.adaptasiFisik = fisik;
    }

    public String getadaptasiFisik() {
        return this.adaptasiFisik;
    }
}
