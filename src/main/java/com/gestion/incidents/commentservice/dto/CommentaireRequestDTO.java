package com.gestion.incidents.commentservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

public class CommentaireRequestDTO {
    @NotNull(message = "L'identifiant de l'incident est obligatoire")
    private Long incidentId;

    @NotBlank(message = "Le contenu ne peut pas être vide")
    private String contenu;

    private UUID commentaireParentId;
    private Boolean estSolution = false;
    private Boolean estInterne = false;
    private UUID auteurId;
    private String auteurNom;
    private String auteurEmail;

    public CommentaireRequestDTO() {}
    public Long getIncidentId() { return incidentId; }
    public String getContenu() { return contenu; }
    public UUID getCommentaireParentId() { return commentaireParentId; }
    public Boolean getEstSolution() { return estSolution; }
    public Boolean getEstInterne() { return estInterne; }
    public UUID getAuteurId() { return auteurId; }
    public String getAuteurNom() { return auteurNom; }
    public String getAuteurEmail() { return auteurEmail; }
    public void setIncidentId(Long v) { this.incidentId = v; }
    public void setAuteurId(UUID v) { this.auteurId = v; }
    public void setAuteurNom(String v) { this.auteurNom = v; }
    public void setAuteurEmail(String v) { this.auteurEmail = v; }
    public void setContenu(String v) { this.contenu = v; }
    public void setCommentaireParentId(UUID v) { this.commentaireParentId = v; }
    public void setEstSolution(Boolean v) { this.estSolution = v; }
    public void setEstInterne(Boolean v) { this.estInterne = v; }
}
