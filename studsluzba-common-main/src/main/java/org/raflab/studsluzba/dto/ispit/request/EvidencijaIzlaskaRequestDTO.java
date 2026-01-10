package org.raflab.studsluzba.dto.ispit.request;

public class EvidencijaIzlaskaRequestDTO {
    private Long studentIndeksId;
    private Long ispitId;
    private Double poeniSaIspita;
    private String napomena;

    public Long getStudentIndeksId() {
        return studentIndeksId;
    }

    public void setStudentIndeksId(Long studentIndeksId) {
        this.studentIndeksId = studentIndeksId;
    }

    public Long getIspitId() {
        return ispitId;
    }

    public void setIspitId(Long ispitId) {
        this.ispitId = ispitId;
    }

    public Double getPoeniSaIspita() {
        return poeniSaIspita;
    }

    public void setPoeniSaIspita(Double poeniSaIspita) {
        this.poeniSaIspita = poeniSaIspita;
    }

    public String getNapomena() {
        return napomena;
    }

    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }
}