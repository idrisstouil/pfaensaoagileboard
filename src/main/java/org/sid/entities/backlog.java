package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class backlog implements Serializable {
	public long getBacklog_id() {
		return backlog_id;
	}
	public void setBacklog_id(int backlog_id) {
		this.backlog_id = backlog_id;
	}
	public String getProjet_id() {
		return projet_id;
	}
	public void setProjet_id(String projet_id) {
		this.projet_id = projet_id;
	}
	public String getBacklog_titre() {
		return backlog_titre;
	}
	public void setBacklog_titre(String backlog_titre) {
		this.backlog_titre = backlog_titre;
	}
	@Id @GeneratedValue
	private long backlog_id;
	private String projet_id;
	private String backlog_titre;
	private String backlog_desc;
	public backlog(int backlog_id, String projet_id, String backlog_titre,String backlog_desc)
 {
		super();
		this.backlog_id = backlog_id;
		this.projet_id = projet_id;
		this.backlog_titre = backlog_titre;
		this.setBacklog_desc(backlog_desc);
;

	}
	public backlog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBacklog_desc() {
		return backlog_desc;
	}
	public void setBacklog_desc(String backlog_desc) {
		this.backlog_desc = backlog_desc;
	}
	

}