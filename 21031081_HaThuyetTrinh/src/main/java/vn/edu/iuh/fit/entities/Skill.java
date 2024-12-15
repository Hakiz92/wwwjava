package vn.edu.iuh.fit.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillId;
    private Byte skillType;
    private String skillName;
    private String skillDesc;
    // getters and setters
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(Long skillId, Byte skillType, String skillName, String skillDesc) {
		super();
		this.skillId = skillId;
		this.skillType = skillType;
		this.skillName = skillName;
		this.skillDesc = skillDesc;
	}
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public Byte getSkillType() {
		return skillType;
	}
	public void setSkillType(Byte skillType) {
		this.skillType = skillType;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public String getSkillDesc() {
		return skillDesc;
	}
	public void setSkillDesc(String skillDesc) {
		this.skillDesc = skillDesc;
	}
	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillType=" + skillType + ", skillName=" + skillName + ", skillDesc="
				+ skillDesc + "]";
	}
    
    
}
