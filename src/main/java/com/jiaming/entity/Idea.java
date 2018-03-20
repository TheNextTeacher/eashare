package com.jiaming.entity;

import java.util.Date;

public class Idea {
	
	private String ideaID;

	private String ideaName;
	
	private Date ideaDate;
	
	private String ideaContent;
	
	private String deaCreaterID;
	
	public String getIdeaID() {
		return ideaID;
	}

	public void setIdeaID(String ideaID) {
		this.ideaID = ideaID;
	}

	public String getIdeaName() {
		return ideaName;
	}

	public void setIdeaName(String ideaName) {
		this.ideaName = ideaName;
	}

	public Date getIdeaDate() {
		return ideaDate;
	}

	public void setIdeaDate(Date ideaDate) {
		this.ideaDate = ideaDate;
	}

	public String getIdeaContent() {
		return ideaContent;
	}

	public void setIdeaContent(String ideaContent) {
		this.ideaContent = ideaContent;
	}

	public String getDeaCreaterID() {
		return deaCreaterID;
	}

	public void setDeaCreaterID(String deaCreaterID) {
		this.deaCreaterID = deaCreaterID;
	}
}
