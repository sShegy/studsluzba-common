package org.raflab.studsluzba.dto.student.request;

import java.util.List;

public class ObnovaGodineRequestDTO {
    private Long studentIndeksId;
    private Long skolskaGodinaId;
    private List<Long> predmetiIzNaredneGodineIds;
    private Integer godinaKojaSeObnavlja;

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

    public List<Long> getPredmetiIzNaredneGodineIds() {
        return predmetiIzNaredneGodineIds;
    }

    public void setPredmetiIzNaredneGodineIds(List<Long> predmetiIzNaredneGodineIds) {
        this.predmetiIzNaredneGodineIds = predmetiIzNaredneGodineIds;
    }

    public Integer getGodinaKojaSeObnavlja() {
        return godinaKojaSeObnavlja;
    }

    public void setGodinaKojaSeObnavlja(Integer godinaKojaSeObnavlja) {
        this.godinaKojaSeObnavlja = godinaKojaSeObnavlja;
    }
}