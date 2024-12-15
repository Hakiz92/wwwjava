package vn.edu.iuh.fit.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.entities.Job;
import vn.edu.iuh.fit.entities.Skill;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
//    @Query("SELECT j FROM Job j JOIN JobSkill js ON j.jobId = js.job.jobId WHERE js.skill = :skill")
//    List<Job> findJobsBySkill(Skill skill);
    
    // Truy vấn tìm Job theo Skill
    @Query("SELECT j FROM Job j JOIN JobSkill js ON j.jobId = js.job.jobId WHERE js.skill = :skill")
    List<Job> findJobsBySkill(Skill skill);
}
