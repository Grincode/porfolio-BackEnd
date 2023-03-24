package com.example.demo.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Grincode
 */
public class dtoProyecto {

    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String imagenP;
    @NotBlank
    private String fechaP;
    @NotBlank
    private String linkP;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String imagenP, String fechaP, String linkP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.imagenP = imagenP;
        this.fechaP = fechaP;
        this.linkP = linkP;

    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getImagenP() {
        return imagenP;
    }

    public void setImagenP(String imagenP) {
        this.imagenP = imagenP;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    public String getLinkP() {
        return linkP;
    }

    public void setLinkP(String linkP) {
        this.linkP = linkP;
    }

}
