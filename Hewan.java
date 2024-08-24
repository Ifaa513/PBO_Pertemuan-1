/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugassatu;

/**
 *
 * @author USER
 */
public class Hewan extends MakhlukHidup {

    private String kingdom;
    private String namaIlmiah;
    private String habitat;

    public void setkingdom(String animalia) {
        this.kingdom = animalia;
    }

    public String getkingdom() {
        return this.kingdom;
    }

    public void setnamaIlmiah(String unik) {
        this.namaIlmiah = unik;
    }

    public String getnamaIlmiah() {
        return this.namaIlmiah;
    }

    public void sethabitat(String habitat) {
        this.habitat = habitat;
    }

    public String gethabitat() {
        return this.habitat;
    }
}
