package org.raflab.studsluzba.dto.student.response;

import java.math.BigDecimal;

public class StanjeFinansijaResponseDTO {
    private BigDecimal ukupnoZaduzenje;
    private BigDecimal ukupnoUplaceno;
    private BigDecimal preostaloZaUplatu;

    public BigDecimal getUkupnoZaduzenje() {
        return ukupnoZaduzenje;
    }

    public void setUkupnoZaduzenje(BigDecimal ukupnoZaduzenje) {
        this.ukupnoZaduzenje = ukupnoZaduzenje;
    }

    public BigDecimal getUkupnoUplaceno() {
        return ukupnoUplaceno;
    }

    public void setUkupnoUplaceno(BigDecimal ukupnoUplaceno) {
        this.ukupnoUplaceno = ukupnoUplaceno;
    }

    public BigDecimal getPreostaloZaUplatu() {
        return preostaloZaUplatu;
    }

    public void setPreostaloZaUplatu(BigDecimal preostaloZaUplatu) {
        this.preostaloZaUplatu = preostaloZaUplatu;
    }
}