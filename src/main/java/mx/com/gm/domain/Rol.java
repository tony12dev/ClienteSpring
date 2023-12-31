
package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author tonny
 */
@Entity
@Data
@Table(name="rol")
public class Rol implements Serializable{
 
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;
    
    @NotEmpty
    private String nombre;
}
