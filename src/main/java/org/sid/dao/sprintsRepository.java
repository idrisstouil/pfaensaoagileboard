package org.sid.dao;
import org.sid.entities.Sprints;
import org.sid.entities.Userstories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface sprintsRepository extends JpaRepository<Sprints,Long> {


}
