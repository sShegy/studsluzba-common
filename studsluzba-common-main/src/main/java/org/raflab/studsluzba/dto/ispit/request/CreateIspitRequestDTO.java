package org.raflab.studsluzba.dto.ispit.request;

import java.time.LocalDate;
import java.time.LocalTime;

public class CreateIspitRequestDTO {
    private Long drziPredmetId;
    private Long ispitniRokId;
    private LocalDate datumOdrzavanja;
    private LocalTime vremePocetka;

    public Long getDrziPredmetId() {
        return drziPredmetId;
    }

    public void setDrziPredmetId(Long drziPredmetId) {
        this.drziPredmetId = drziPredmetId;
    }

    public Long getIspitniRokId() {
        return ispitniRokId;
    }

    public void setIspitniRokId(Long ispitniRokId) {
        this.ispitniRokId = ispitniRokId;
    }

    public LocalDate getDatumOdrzavanja() {
        return datumOdrzavanja;
    }

    public void setDatumOdrzavanja(LocalDate datumOdrzavanja) {
        this.datumOdrzavanja = datumOdrzavanja;
    }

    public LocalTime getVremePocetka() {
        return vremePocetka;
    }

    public void setVremePocetka(LocalTime vremePocetka) {
        this.vremePocetka = vremePocetka;
    }
}