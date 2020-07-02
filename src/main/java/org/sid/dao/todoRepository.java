package org.sid.dao;
import org.sid.entities.Userstories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface todoRepository extends JpaRepository<Userstories,Long>{


}
