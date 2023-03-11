package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;
import cz.czechitas.lekce5.model.Telefon;


/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        //TODO tady bude náš kód

        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");

        Telefon rumcajsuvTelefon = new Telefon();
        rumcajsuvTelefon.setPredcisli("+420");
        rumcajsuvTelefon.setTelefonniCislo("123456789");

        Adresa adresaRumcajsova = new Adresa();
        adresaRumcajsova.setUlice("Jicinska 254");
        adresaRumcajsova.setObec("Jicin");
        adresaRumcajsova.setCastObce("Raholecky les");
        adresaRumcajsova.setPsc("46895");

        Osoba rumcajs = new Osoba();
        rumcajs.setJmeno("Rumcajs");
        rumcajs.setPrijmeni("Raholecky");
        rumcajs.setZena(false);
        rumcajs.setRodneCislo("800701/1564");
        rumcajs.setTelefon(rumcajsuvTelefon);
        rumcajs.setPracovniEmail("rumcajs.pracovni@gmail.com");
        rumcajs.setSoukromyEmail("rumcajs.soukromy@gmail.com");
        rumcajs.setAdresa(adresaRumcajsova);

        System.out.println(rumcajs.getCeleJmeno());
        System.out.println("Telefon: " + rumcajs.getTelefon());
        System.out.println("Rodne cislo: " + rumcajs.getRodneCislo());
        System.out.println("Pracovni email: " + rumcajs.getPracovniEmail());
        System.out.println("Soukromy email: " + rumcajs.getSoukromyEmail());
        System.out.println("Adresa: " + adresaRumcajsova.getUlice() + ", " + adresaRumcajsova.getObec() + ", " + adresaRumcajsova.getCastObce() + ", " + adresaRumcajsova.getPsc());



    }
}
