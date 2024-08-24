/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugassatu;

/**
 *
 * @author USER
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamalia Sapi = new Mamalia();
        Sapi.setkingdom("Animalia");
        Sapi.setnamaIlmiah("Bos taurus");
        Sapi.sethabitat("padang rumput");
        Sapi.setperawatanAnak("menyusui");
        Sapi.setadaptasiFisik("sistem pencernaan perut berkamar empat");
        System.out.println("Jenis mamalia ini adalah sapi");
        Sapi.bereproduksi();
        Sapi.bernafas();
        Sapi.tumbuh();
        System.out.println("Sapi termasuk dalam kingdom " + Sapi.getkingdom());
        System.out.println("Nama ilmiah sapi secara umum adalah " + Sapi.getnamaIlmiah());
        System.out.println("Habitat ideal bagi sapi adalah " + Sapi.gethabitat());
        System.out.println("Salah satu cara sapi merawat anaknya, adalah dengan " + Sapi.getperawatanAnak());
        System.out.println("Salah satu adaptasi fisik yang dmiliki sapi adalah " + Sapi.getadaptasiFisik());

        Reptil Komodo = new Reptil();
        Komodo.setkingdom("Animalia");
        Komodo.setnamaIlmiah("Varanus komodoensis");
        Komodo.sethabitat("Pulau Komodo dan pulau-pulau kecil di sekitar Nusa Tenggara Timur");
        Komodo.setsusunanSisik("sisiknya tebal, kasar, dan berbintil-bintil");
        Komodo.setperilaku("Karnivora, soliter, dan bersifat kanibal");
        System.out.println(" ");
        System.out.println("Jenis reptil ini adalah Komodo");
        Komodo.bereproduksi();
        Komodo.bernafas();
        Komodo.tumbuh();
        System.out.println("Komodo termasuk dalam kingdom " + Komodo.getkingdom());
        System.out.println("Nama ilmiah komodo adalah " + Komodo.getnamaIlmiah());
        System.out.println("Habitat ideal bagi komodo adalah " + Komodo.gethabitat());
        System.out.println("Susunan sisik komodo adalah " + Komodo.getsusunanSisik());
        System.out.println("Komodo berperilaku " + Komodo.getperilaku());

        Pisces IkanKoi = new Pisces();
        IkanKoi.setkingdom("Animalia");
        IkanKoi.setnamaIlmiah("Cyprinus carpio");
        IkanKoi.sethabitat("kolam, danau, dan sungai yang airnya tenang");
        IkanKoi.setjenisSirip("sirip punggung, sirip dubur, sirip perut, sirip dada, dan sirip ekor");
        IkanKoi.setfungsiSirip("untuk menjaga keseimbangan, memungkinkan manuver yang lincah, serta menghasilkan tenaga dorong untuk pergerakan di dalam air");
        System.out.println(" ");
        System.out.println("Jenis pisces ini adalah Ikan Koi");
        IkanKoi.bereproduksi();
        IkanKoi.bernafas();
        IkanKoi.tumbuh();
        System.out.println("Ikan koi termasuk dalam kingdom " + IkanKoi.getkingdom());
        System.out.println("Nama ilmiah ikan koi adalah " + IkanKoi.getnamaIlmiah());
        System.out.println("Habitat ideal bagi ikan koi adalah " + IkanKoi.gethabitat());
        System.out.println("Ikan koi memiliki " + IkanKoi.getjenisSirip());
        System.out.println("Sirip ikan koi ini berfungsi " + IkanKoi.getfungsiSirip());

        Aves Elang = new Aves();
        Elang.setkingdom("Animalia");
        Elang.setnamaIlmiah("Famili Accipitridae");
        Elang.sethabitat("beragam, mulai dari hutan, padang rumput, hingga daerah pegunungan");
        Elang.setwarnaBulu("umumnya berwarna coklat atau hitam");
        Elang.setpolaMigrasi("Beberapa spesies elang melakukan migrasi jarak jauh, sementara yang lainnya bersifat residen");
        System.out.println(" ");
        System.out.println("Jenis aves ini adalah elang");
        Elang.bereproduksi();
        Elang.bernafas();
        Elang.tumbuh();
        System.out.println("Elang termasuk dalam kingdom " + Elang.getkingdom());
        System.out.println("Nama ilmiah elang adalah " + Elang.getnamaIlmiah());
        System.out.println("Habitat ideal bagi elang adalah " + Elang.gethabitat());
        System.out.println("Bulu elang " + Elang.getwarnaBulu());
        System.out.println(Elang.getpolaMigrasi());

        Amfibi KodokBanteng = new Amfibi();
        KodokBanteng.setkingdom("Animalia");
        KodokBanteng.setnamaIlmiah("Rana catesbeiana");
        KodokBanteng.sethabitat("rawa, danau, dan sungai di Amerika Utara");
        KodokBanteng.setbentukTubuh("tubuh besar dan kekar, kepala lebar, dan kaki belakang kuat untuk melompat.");
        KodokBanteng.setpolaKulit("Kulit berbintil-bintil kasar, berwarna hijau zaitun atau coklat");
        System.out.println(" ");
        System.out.println("Jenis amfibi ini adalah kodok banteng");
        KodokBanteng.bereproduksi();
        KodokBanteng.bernafas();
        KodokBanteng.tumbuh();
        System.out.println("Kodok banteng termasuk dalam kingdom " + KodokBanteng.getkingdom());
        System.out.println("Nama ilmiah kodok banteng adalah " + KodokBanteng.getnamaIlmiah());
        System.out.println("Habitat ideal bagi kodok banteng adalah " + KodokBanteng.gethabitat());
        System.out.println("Kodok banteng memiliki " + KodokBanteng.getbentukTubuh());
        System.out.println("Kodok banteng memiliki " + KodokBanteng.getpolaKulit());

        Monokotil Anggrek = new Monokotil();
        Anggrek.setjenisAkar("serabut, seringkali dilengkapi dengan velamen untuk menyerap air");
        Anggrek.setjenisBatang("beragam, ada yang memanjat, epifit, atau terrestrial");
        Anggrek.setjumlahBagianBunga("bunga tunggal, memiliki bagian-bagian bunga yang khas dan menarik");
        System.out.println(" ");
        System.out.println("Tumbuhan monokotil ini adalah anggrek");
        Anggrek.bereproduksi();
        Anggrek.bernafas();
        Anggrek.tumbuh();
        System.out.println("Anggrek memiliki akar " + Anggrek.getjenisAkar());
        System.out.println("Anggrek memiliki batang " + Anggrek.getjenisBatang());
        System.out.println("Anggrek memiliki " + Anggrek.getjumlahBagianBunga());

        Dikotil Mangga = new Dikotil();
        Mangga.setjenisAkar("tunggang");
        Mangga.setjenisBatang("keras, berkayu, dan bercabang");
        Mangga.setjenisBuah("drupa (berbiji keras)");
        System.out.println(" ");
        System.out.println("Tumbuhan dikotil ini adalah mangga");
        Mangga.bereproduksi();
        Mangga.bernafas();
        Mangga.tumbuh();
        System.out.println("Mangga  memiliki akar " + Mangga.getjenisAkar());
        System.out.println("Mangga  memiliki batang " + Mangga.getjenisBatang());
        System.out.println("Mangga  memiliki buah berjenis " + Mangga.getjenisBuah());
    }

}
