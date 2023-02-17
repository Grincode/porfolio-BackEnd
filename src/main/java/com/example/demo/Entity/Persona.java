
package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Setter;
import lombok.Getter;

/**
 *
 * @author Grincode
 */
@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    @NotNull
    @Size(min = 1, max = 100,message = "No cumple con los requisitos")
    private String nombre;
    @NotNull
    @Size(min = 1, max = 100,message = "No cumple con los requisitos")
    private String apellido;
    
    @Size(min = 1, max = 100,message = "No cumple con los requisitos")
    private String img;   
    
}
