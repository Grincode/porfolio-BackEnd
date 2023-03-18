
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
    private String img;

    public dtoProyecto() {
    }

    public dtoProyecto (String nombreP, String descripcionP, String img) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.img = img;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    

}