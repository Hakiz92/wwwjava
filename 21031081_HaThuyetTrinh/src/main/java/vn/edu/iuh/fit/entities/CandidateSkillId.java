package vn.edu.iuh.fit.entities;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class CandidateSkillId implements Serializable {
    private Long canId;
    private Long skillId;
    // getters and setters, equals() and hashCode()
	public CandidateSkillId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCanId() {
		return canId;
	}
	public void setCanId(Long canId) {
		this.canId = canId;
	}
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
    
    
}