package org.raflab.studsluzba.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KursnaListaResponseDTO {

    @JsonProperty("srednji_kurs")
    private BigDecimal srednjiKurs;

    public BigDecimal getSrednjiKurs() {
        return srednjiKurs;
    }

    public void setSrednjiKurs(BigDecimal srednjiKurs) {
        this.srednjiKurs = srednjiKurs;
    }
}