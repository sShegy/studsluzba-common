package org.raflab.studsluzba.dto.ispit.request;

public class PrijavaIspitaRequestDTO {

    private Long studentIndeksId;
    private Long ispitId;

    public PrijavaIspitaRequestDTO() {
    }

    public PrijavaIspitaRequestDTO(Long studentIndeksId, Long ispitId) {
        this.studentIndeksId = studentIndeksId;
        this.ispitId = ispitId;
    }

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
}