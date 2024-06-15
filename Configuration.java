
public class Configuration  
{
    public static String jump = "space";
    
    public static double jumpForce = 16.0;
    public static double decraseFactor = 0.06;
    public static double gravitationalAcceleration = 9.81/10;
    
    public static int moveSpeed = 3;
    public static int moveSpeedIncreaseFactor = 1; // um ... ändern alle
    public static int ticksBetweenSpeedIncrease = 200; // Punkte
    
    public static int platformLength = 85;
    
    public static int minSamePlatformHeights = 4;
    public static int maxSamePlatformHeights = 8;
    
    public static int worldSizeX = 600;
    public static int worldSizeY = 400;
    
    public static int textPersistence = 300;
    
    public static int shieldProtectionDuration = 320;
    
    /*
       Good seeds to try:
       * 231713
       * 1
       * 4
       * 56
       */
    public static int seed = 56;
    
    public static String[] images = {
        "",
        "",
        "",
        "Abakus.png",
        "Charles_Babbage.png",
        "Analytical_Engine.png",
        "Ada_Lovelace.png",
        "Turing.png",
        "Zuse_Z4.png",
        "Intel_4004.png",
        "Apple_II.png",
        "IBM_PC.png",
        "Commodore_64.png",
        "ARM.png",
        "Linus_Torvalds.png",
        "Pentium.png",
        "Schweineunternehmen.png",
        "Google.png",
        "AMD_Athlon_K75.png",
        "iPhone.png",
        "Year_2024.png",
        "Seagate.png",
        "Ryzen_9_7950X3D.png",
        "Linux.png",
        "Google_neu.png",
        "",
        "",
        "",
    };
    
    public static String[] texts = {
        "Willkommen bei History Dash!",
        "Hier wirst Du eine Menge über die Geschichte der\nInformatik lernen!",
        "Pass auf, dass Du nicht herunterfällst oder gar\nin ein Schweineunternehmen rast.",
        "Angefangen hat alles beim Abakus, einem primitiven\nRechengerät. Man bediente ihn per Hand.",
        "1820 begann der Forscher Charles Babbage dann mit dem Bau\neiner komplexeren mechanischen Maschine, ...",
        "der Analytical Engine. Sie konnte bereits grundlegende\nmathematische Operationen durchführen.",
        "An dieser arbeitete u.A. Ada Lovelace, die allererste\nProgrammiererin der Geschichte.",
        "Im zweiten Weltkrieg knackte Alan Turing mit\neinem selbstgebauten Vorgänger des Computers die Enigma-\nVerschlüsselung der Nationalsozialisten.",
        "1945 entwickelte zugleich der deutsche Erfinder\nKonrad Zuse den Zuse Z4, von dem viele behaupten,\ner sei der erste richtige Computer der Welt.",
        "Einige Jahre später entwickelte die Firma Intel\n mit dem Intel 4004 den ersten Mikroprozessor. Er besaß\nnur eine 4-bit-Architektur.",
        "1977 kam der Apple II auf den Markt, ein revolutionärer\nHeimcomputer für jedermann.",
        "Mit dem PC entwickelte IBM 1981 das Gerät, das\nden Einzug in die Heime der Menschen und Büros schaffte.",
        "Ein Jahr später krempelte der Commodore 64, kurz C64,\nals beliebte Spielekonsole den Markt um.",
        "Sophie Wilson und Steve Furber arbeiteten in dieser Zeit an\nder ARM-Prozessorarchitekur, die heute\nin jedem Smartphone steckt.\nARM-CPUs sind die meistverkauftesten der Welt.",
        "1991 veröffentlichte der Finne Linus Torvalds den Kernel \"Linux\",\nmit dem er noch groß herauskommen sollte.",
        "Der Meilenstein der Prozessoren, der Intel Pentium, kam nur\nzwei Jahre später auf den Markt und brachte viele\nneue, einzigartige Funktionen.",
        "Zugleich wurde NVIDIA gegründet, ein Unternehmen, dass bis\nheute seine Treiber nicht in den Griff kriegt.",
        "1997 ging Google online - und sollte die beliebteste Suchmaschine\nder Welt werden.",
        "Im Jahr 2000 knackt der AMD Athlon K75\ndas erste Mal einen Takt von\n1GHz.",
        "Bereits 2007 erscheint dann das iPhone.\nDie Welt ist begeistert.",
        "Nun haben wir 2024.",
        "Auf eine Festplatte passen inzwischen 32 TB.",
        "Prozessoren erreichen einen Takt von bis zu 6GHz\nund werden in 3nm gefertigt.",
        "Linux ist der verbreiteteste Kernel der\nWelt und läuft auf 55% aller Geräte.",
        "Google hat 8,5 Mrd. Anfragen - jeden Tag.",
        "Noch besser: Die Leute verschenken ihr Grundrecht\nauf Privatsphäre - und das sogar ganz\nohne dafür Geld zu bekommen.",
        "Seien wir gespannt darauf, wie es weitergeht!",
        "Jetzt heißt es erst einmal: Noch viel Spaß beim\nWeiterspielen!"
    };
}
