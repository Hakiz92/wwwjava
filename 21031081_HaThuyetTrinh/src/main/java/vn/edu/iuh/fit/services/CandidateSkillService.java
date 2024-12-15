package vn.edu.iuh.fit.services;

import java.util.List;
import vn.edu.iuh.fit.entities.CandidateSkill;
import vn.edu.iuh.fit.entities.CandidateSkillId;
import vn.edu.iuh.fit.entities.Candidate;
import vn.edu.iuh.fit.entities.Skill;
import vn.edu.iuh.fit.repository.CandidateSkillRepository;
import vn.edu.iuh.fit.repository.CandidateRepository;
import vn.edu.iuh.fit.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateSkillService {
    @Autowired
    private CandidateSkillRepository candidateSkillRepository;
    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private SkillRepository skillRepository;

    public List<CandidateSkill> getAllCandidateSkills() {
        return candidateSkillRepository.findAll();
    }

    public CandidateSkill getCandidateSkillById(CandidateSkillId id) {
        return candidateSkillRepository.findById(id).orElse(null);
    }

    public CandidateSkill saveCandidateSkill(CandidateSkill candidateSkill) {
        return candidateSkillRepository.save(candidateSkill);
    }

    public void deleteCandidateSkill(CandidateSkillId id) {
        candidateSkillRepository.deleteById(id);
    }

    public CandidateSkill addSkillToCandidate(Long candidateId, Long skillId, Byte skillLevel, String moreInfos) {
        Candidate candidate = candidateRepository.findById(candidateId).orElse(null);
        Skill skill = skillRepository.findById(skillId).orElse(null);

        if (candidate != null && skill != null) {
            CandidateSkillId id = new CandidateSkillId();
            id.setCanId(candidateId);
            id.setSkillId(skillId);

            CandidateSkill candidateSkill = new CandidateSkill();
            candidateSkill.setId(id);
            candidateSkill.setCandidate(candidate);
            candidateSkill.setSkill(skill);
            candidateSkill.setSkillLevel(skillLevel);
            candidateSkill.setMoreInfos(moreInfos);

            return candidateSkillRepository.save(candidateSkill);
        }
        return null;
    }
}