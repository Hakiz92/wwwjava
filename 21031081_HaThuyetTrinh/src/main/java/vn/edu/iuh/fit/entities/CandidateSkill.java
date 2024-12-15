package vn.edu.iuh.fit.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class CandidateSkill {
    @EmbeddedId
    private CandidateSkillId id;

    @ManyToOne
    @MapsId("canId")
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    @ManyToOne
    @MapsId("skillId")
    @JoinColumn(name = "skill_id")
    private Skill skill;

    private Byte skillLevel;
    private String moreInfos;
    // getters and setters
	public CandidateSkill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CandidateSkillId getId() {
		return id;
	}
	public void setId(CandidateSkillId id) {
		this.id = id;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public Byte getSkillLevel() {
		return skillLevel;
	}
	public void setSkillLevel(Byte skillLevel) {
		this.skillLevel = skillLevel;
	}
	public String getMoreInfos() {
		return moreInfos;
	}
	public void setMoreInfos(String moreInfos) {
		this.moreInfos = moreInfos;
	}
    
    
}