package com.tts.scores;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Scores {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String sfId;
    @Column(nullable = true)
    private String score;
    

	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getSfId() {
		return sfId;
	}
	public void setSfId(String sfId) {
		this.sfId = sfId;
	}
}
