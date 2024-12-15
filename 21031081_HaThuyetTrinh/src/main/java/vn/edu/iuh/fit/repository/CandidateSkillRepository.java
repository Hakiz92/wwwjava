package vn.edu.iuh.fit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.edu.iuh.fit.entities.CandidateSkill;
import vn.edu.iuh.fit.entities.CandidateSkillId;
@Repository
public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, CandidateSkillId> {
	List<CandidateSkill> findByCandidateCanId(Long candidateId);
}