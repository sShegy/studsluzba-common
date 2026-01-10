package org.raflab.studsluzba.dto.nastavnik.response;

public class ObrazovanjeResponseDTO {
    private String nazivUstanove;
    private String vrstaStudija;
    private String stecenoZvanje;
    private Integer godinaZavrsetka;

    public String getNazivUstanove() {
        return nazivUstanove;
    }

    public void setNazivUstanove(String nazivUstanove) {
        this.nazivUstanove = nazivUstanove;
    }

    public String getVrstaStudija() {
        return vrstaStudija;
    }

    public void setVrstaStudija(String vrstaStudija) {
        this.vrstaStudija = vrstaStudija;
    }

    public String getStecenoZvanje() {
        return stecenoZvanje;
    }

    public void setStecenoZvanje(String stecenoZvanje) {
        this.stecenoZvanje = stecenoZvanje;
    }

    public Integer getGodinaZavrsetka() {
        return godinaZavrsetka;
    }

    public void setGodinaZavrsetka(Integer godinaZavrsetka) {
        this.godinaZavrsetka = godinaZavrsetka;
    }
}