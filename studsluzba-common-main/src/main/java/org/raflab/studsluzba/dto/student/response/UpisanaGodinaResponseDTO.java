package org.raflab.studsluzba.dto.student.response;

import java.time.LocalDate;

public class UpisanaGodinaResponseDTO {
    private String skolskaGodina;
    private Integer godinaKojaSeUpisuje;
    private LocalDate datumUpisa;
    private String tip; // "Upis" ili "Obnova"

    public String getSkolskaGodina() {
        return skolskaGodina;
    }

    public void setSkolskaGodina(String skolskaGodina) {
        this.skolskaGodina = skolskaGodina;
    }

    public Integer getGodinaKojaSeUpisuje() {
        return godinaKojaSeUpisuje;
    }

    public void setGodinaKojaSeUpisuje(Integer godinaKojaSeUpisuje) {
        this.godinaKojaSeUpisuje = godinaKojaSeUpisuje;
    }

    public LocalDate getDatumUpisa() {
        return datumUpisa;
    }

    public void setDatumUpisa(LocalDate datumUpisa) {
        this.datumUpisa = datumUpisa;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}