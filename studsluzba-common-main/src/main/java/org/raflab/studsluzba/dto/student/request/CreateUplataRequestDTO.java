package org.raflab.studsluzba.dto.student.request;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreateUplataRequestDTO {
    private Long studentIndeksId;
    private BigDecimal iznos;
    private LocalDate datumUplate;
    private String svrha;

    public Long getStudentIndeksId() {
        return studentIndeksId;
    }

    public void setStudentIndeksId(Long studentIndeksId) {
        this.studentIndeksId = studentIndeksId;
    }

    public BigDecimal getIznos() {
        return iznos;
    }

    public void setIznos(BigDecimal iznos) {
        this.iznos = iznos;
    }

    public LocalDate getDatumUplate() {
        return datumUplate;
    }

    public void setDatumUplate(LocalDate datumUplate) {
        this.datumUplate = datumUplate;
    }

    public String getSvrha() {
        return svrha;
    }

    public void setSvrha(String svrha) {
        this.svrha = svrha;
    }
}