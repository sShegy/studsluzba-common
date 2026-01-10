package org.raflab.studsluzba.dto.nastavnik.response;

import java.time.LocalDate;
import java.util.List;

public class NastavnikProfileResponseDTO {
    private Long id;
    private String ime;
    private String prezime;
    private String email;
    private LocalDate datumRodjenja;
    private ZvanjeResponseDTO aktivnoZvanje;
    private List<ZvanjeResponseDTO> istorijaZvanja;
    private List<ObrazovanjeResponseDTO> obrazovanja;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(LocalDate datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    public ZvanjeResponseDTO getAktivnoZvanje() {
        return aktivnoZvanje;
    }

    public void setAktivnoZvanje(ZvanjeResponseDTO aktivnoZvanje) {
        this.aktivnoZvanje = aktivnoZvanje;
    }

    public List<ZvanjeResponseDTO> getIstorijaZvanja() {
        return istorijaZvanja;
    }

    public void setIstorijaZvanja(List<ZvanjeResponseDTO> istorijaZvanja) {
        this.istorijaZvanja = istorijaZvanja;
    }

    public List<ObrazovanjeResponseDTO> getObrazovanja() {
        return obrazovanja;
    }

    public void setObrazovanja(List<ObrazovanjeResponseDTO> obrazovanja) {
        this.obrazovanja = obrazovanja;
    }
}