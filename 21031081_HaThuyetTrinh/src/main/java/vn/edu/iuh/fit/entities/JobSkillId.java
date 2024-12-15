package vn.edu.iuh.fit.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class JobSkillId implements Serializable {
    private Long jobId;
    private Long skillId;

    // Constructor mặc định
    public JobSkillId() {}

    // Constructor có tham số
    public JobSkillId(Long jobId, Long skillId) {
        this.jobId = jobId;
        this.skillId = skillId;
    }

    // Getters and setters
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    // equals() và hashCode() dựa trên jobId và skillId
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobSkillId that = (JobSkillId) o;
        return Objects.equals(jobId, that.jobId) && Objects.equals(skillId, that.skillId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, skillId);
    }
}
