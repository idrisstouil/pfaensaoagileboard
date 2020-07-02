package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Userstories implements Serializable {
private String userstory;
@Id @GeneratedValue
private Long userstoryid;
private String userstoryname;
private String userstorytitle;
private String userstoryvelocity;
private Long userstorypriority;
private String userstorystatus;
private long userstorysprintid=0;
private String userstorytodolist;
public String getUserstory() {
	return userstory;
}
public void setUserstory(String userstory) {
	this.userstory = userstory;
}
public Long getUserstoryid() {
	return userstoryid;
}
public void setUserstoryid(Long userstoryid) {
	this.userstoryid = userstoryid;
}
public String getUserstoryname() {
	return userstoryname;
}
public void setUserstoryname(String userstoryname) {
	this.userstoryname = userstoryname;
}
public String getUserstorytitle() {
	return userstorytitle;
}
public void setUserstorytitle(String userstorytitle) {
	this.userstorytitle = userstorytitle;
}
public String getUserstoryvelocity() {
	return userstoryvelocity;
}
public void setUserstoryvelocity(String userstoryvelocity) {
	this.userstoryvelocity = userstoryvelocity;
}
public Long getUserstorypriority() {
	return userstorypriority;
}
public void setUserstorypriority(Long userstorypriority) {
	this.userstorypriority = userstorypriority;
}
public String getUserstorystatus() {
	return userstorystatus;
}
public void setUserstorystatus(String userstorystatus) {
	this.userstorystatus = userstorystatus;
}
public long getUserstorysprintid() {
	return userstorysprintid;
}
public void setUserstorysprintid(long userstorysprintid) {
	this.userstorysprintid = userstorysprintid;
}
public String getUserstorytodolist() {
	return userstorytodolist;
}
public Userstories() {
	super();
	// TODO Auto-generated constructor stub
}
public void setUserstorytodolist(String userstorytodolist) {
	this.userstorytodolist = userstorytodolist;
}
public Userstories(String userstory, String userstoryname, String userstorytitle, String userstoryvelocity,
		Long userstorypriority, String userstorystatus) {
	super();
	this.userstory = userstory;
	this.userstoryname = userstoryname;
	this.userstorytitle = userstorytitle;
	this.userstoryvelocity = userstoryvelocity;
	this.userstorypriority = userstorypriority;
	this.userstorystatus = userstorystatus;
}

}
