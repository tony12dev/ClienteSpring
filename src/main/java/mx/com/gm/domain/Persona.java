package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.*;

@Entity
@Table(name = "persona")
@ToString @EqualsAndHashCode
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id 
    @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private Long idPersona;
     
    @Getter @Setter @NotEmpty @Column(name = "nombre")
    private String nombre;
    
    @Getter @Setter @NotEmpty @Column(name = "apellido")
    private String apellido;
    
    @Getter @Setter @NotEmpty @Column(name = "email")
    private String email;
    
    @Getter @Setter @Column(name = "telefono")
    private String telefono;
    
    @Getter @Setter @Column(name = "saldo")
    private Double saldo; 
}
