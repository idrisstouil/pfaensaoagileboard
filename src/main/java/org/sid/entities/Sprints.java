package org.sid.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Sprints implements Serializable{
@Id @GeneratedValue
private long sprint_id;
private String sprint_size;
private int sprint_progress;
private String sprint_etat;	
private long id_backlog;

public String getSprint_size() {
	return sprint_size;
}
public void setSprint_size(String sprint_size) {
	this.sprint_size = sprint_size;
}
public int getSprint_progress() {
	return sprint_progress;
}
public void setSprint_progress(int sprint_progress) {
	this.sprint_progress = sprint_progress;
}
public String getSprint_etat() {
	return sprint_etat;
}
public void setSprint_etat(String sprint_etat) {
	this.sprint_etat = sprint_etat;
}
public long getId_backlog() {
	return id_backlog;
}
public void setId_backlog(int id_backlog) {
	this.id_backlog = id_backlog;
}

public Sprints( String sprint_size, int sprint_progress, String sprint_etat, int id_backlog) {
	super();
	this.sprint_size = sprint_size;
	this.sprint_progress = sprint_progress;
	this.sprint_etat = sprint_etat;
	this.id_backlog = id_backlog;
}
public Sprints() {
	super();
	// TODO Auto-generated constructor stub
}

}
