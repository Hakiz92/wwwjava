package vn.edu.iuh.fit.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class JobSkill {
    @EmbeddedId
    private JobSkillId id;

    @ManyToOne
    @MapsId("jobId")
    @JoinColumn(name = "job_id")
    private Job job;

    @ManyToOne
    @MapsId("skillId")
    @JoinColumn(name = "skill_id")
    private Skill skill;

    private Byte skillLevel;
    private String moreInfos;
    // getters and setters
	public JobSkill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobSkillId getId() {
		return id;
	}
	public void setId(JobSkillId id) {
		this.id = id;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
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