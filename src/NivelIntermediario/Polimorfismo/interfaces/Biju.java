package NivelIntermediario.Polimorfismo.interfaces;

public enum Biju {
    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI( "Matatabi", "Yugito Nii",2),
    ISOBU( "Isobu", "Yagura", 3),
    SON_GOKU( "Son Goku", "Roshi", 4),
    KOKUO( "Kokuo", "Han",5),
    SAIKEN( "Saiken", "Utakata",6),
    CHOMEI( "Chomei", "Fuu",7),
    GYUKI( "Gyuki", "Killer Bee" , 8),
    KURAMA( "Kurama", "Naruto Uzumaki", 9);

    String nomeBiju;
    String jinchuriki;
    int numeroDeCaudas;

    /*No ARMS*/
    Biju() {
    }

    /*ALL ARMS*/
    Biju(String nomeBiju, String jinchuriki, int numeroDeCaudas) {
        this.nomeBiju = nomeBiju;
        this.jinchuriki = jinchuriki;
        this.numeroDeCaudas = numeroDeCaudas;
    }
    
}
