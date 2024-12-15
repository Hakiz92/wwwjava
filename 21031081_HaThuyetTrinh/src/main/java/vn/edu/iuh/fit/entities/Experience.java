package vn.edu.iuh.fit.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expId;
    private Date fromDate;
    private Date toDate;
    private String company;
    private String workDesc;

    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    // getters and setters
    
    
}