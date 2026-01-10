package org.raflab.studsluzba.dto.student.response; // <--- NEMA VIŠE .client

import java.time.LocalDate;

public class StudentProfileResponseDTO {
    private Long id;
    private String ime;
    private String prezime;
    private String jmbg;
    private LocalDate datumRodjenja;
    private String email;
    private String aktivniIndeks; // npr. "123/2025"
    private String studijskiProgram;
    private String mestoRodjenja;
    private String adresaStanovanja;
    private Long indeksId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAktivniIndeks() {
        return aktivniIndeks;
    }

    public void setAktivniIndeks(String aktivniIndeks) {
        this.aktivniIndeks = aktivniIndeks;
    }

    public String getStudijskiProgram() {
        return studijskiProgram;
    }

    public void setStudijskiProgram(String studijskiProgram) {
        this.studijskiProgram = studijskiProgram;
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

    public Long getIndeksId() {
        return indeksId;
    }

    public void setIndeksId(Long indeksId) {
        this.indeksId = indeksId;
    }
}