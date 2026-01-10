package org.raflab.studsluzba.dto.kurikulum.request;

public class CreatePredispitnaObavezaRequestDTO {
    private Long predmetId;
    private Long skolskaGodinaId;
    private String vrsta; // npr. "kolokvijum", "test", "domaći"
    private Double maxPoena;

    public Long getPredmetId() {
        return predmetId;
    }

    public void setPredmetId(Long predmetId) {
        this.predmetId = predmetId;
    }

    public Long getSkolskaGodinaId() {
        return skolskaGodinaId;
    }

    public void setSkolskaGodinaId(Long skolskaGodinaId) {
        this.skolskaGodinaId = skolskaGodinaId;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public Double getMaxPoena() {
        return maxPoena;
    }

    public void setMaxPoena(Double maxPoena) {
        this.maxPoena = maxPoena;
    }
}