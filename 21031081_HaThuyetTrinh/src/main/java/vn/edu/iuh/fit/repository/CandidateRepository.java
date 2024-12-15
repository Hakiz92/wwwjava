package vn.edu.iuh.fit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import vn.edu.iuh.fit.entities.Candidate;
import vn.edu.iuh.fit.entities.Skill;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
//	  @Query("SELECT c FROM Candidate c JOIN CandidateSkill cs ON c.canId = cs.candidate.canId WHERE cs.skill = :skill")
//	    List<Candidate> findCandidatesBySkill(Skill skill);
	  
	   @Query("SELECT c FROM Candidate c JOIN CandidateSkill cs ON c.canId = cs.candidate.canId WHERE cs.skill = :skill")
	    List<Candidate> findCandidatesBySkill(Skill skill);
	   
	   
}