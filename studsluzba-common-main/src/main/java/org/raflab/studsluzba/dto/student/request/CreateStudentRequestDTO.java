package org.raflab.studsluzba.dto.student.request;

import java.time.LocalDate;

public class CreateStudentRequestDTO {
    private String ime;
    private String prezime;
    private String srednjeIme;
    private String jmbg;
    private LocalDate datumRodjenja;
    private String mestoRodjenja;
    private String adresaStanovanja;
    private String email;
    private String emailPrivatni;
    private Double uspehSrednjaSkola;
    private Double uspehPrijemni;
    private Long idSrednjeSkole;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getSrednjeIme() {
        return srednjeIme;
    }

    public void setSrednjeIme(String srednjeIme) {
        this.srednjeIme = srednjeIme;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(LocalDate datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public String getMestoRodjenja() {
        return mestoRodjenja;
    }

    public void setMestoRodjenja(String mestoRodjenja) {
        this.mestoRodjenja = mestoRodjenja;
    }

    public String getAdresaStanovanja() {
        return adresaStanovanja;
    }

    public void setAdresaStanovanja(String adresaStanovanja) {
        this.adresaStanovanja = adresaStanovanja;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailPrivatni() {
        return emailPrivatni;
    }

    public void setEmailPrivatni(String emailPrivatni) {
        this.emailPrivatni = emailPrivatni;
    }

    public Double getUspehSrednjaSkola() {
        return uspehSrednjaSkola;
    }

    public void setUspehSrednjaSkola(Double uspehSrednjaSkola) {
        this.uspehSrednjaSkola = uspehSrednjaSkola;
    }

    public Double getUspehPrijemni() {
        return uspehPrijemni;
    }

    public void setUspehPrijemni(Double uspehPrijemni) {
        this.uspehPrijemni = uspehPrijemni;
    }

    public Long getIdSrednjeSkole() {
        return idSrednjeSkole;
    }

    public void setIdSrednjeSkole(Long idSrednjeSkole) {
        this.idSrednjeSkole = idSrednjeSkole;
    }
}