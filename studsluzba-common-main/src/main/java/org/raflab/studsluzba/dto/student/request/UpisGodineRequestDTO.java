package org.raflab.studsluzba.dto.student.request;

import java.util.List;

public class UpisGodineRequestDTO {
    private Long studentIndeksId;
    private Long skolskaGodinaId;
    private List<Long> predmetiKojeUpisujeIds;
    private Integer godinaKojaSeUpisuje;

    public Long getStudentIndeksId() {
        return studentIndeksId;
    }

    public void setStudentIndeksId(Long studentIndeksId) {
        this.studentIndeksId = studentIndeksId;
    }

    public Long getSkolskaGodinaId() {
        return skolskaGodinaId;
    }

    public void setSkolskaGodinaId(Long skolskaGodinaId) {
        this.skolskaGodinaId = skolskaGodinaId;
    }

    public List<Long> getPredmetiKojeUpisujeIds() {
        return predmetiKojeUpisujeIds;
    }

    public void setPredmetiKojeUpisujeIds(List<Long> predmetiKojeUpisujeIds) {
        this.predmetiKojeUpisujeIds = predmetiKojeUpisujeIds;
    }

    public Integer getGodinaKojaSeUpisuje() {
        return godinaKojaSeUpisuje;
    }

    public void setGodinaKojaSeUpisuje(Integer godinaKojaSeUpisuje) {
        this.godinaKojaSeUpisuje = godinaKojaSeUpisuje;
    }
}