
package com.example.demo.Repository;

import com.example.demo.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Grincode
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
