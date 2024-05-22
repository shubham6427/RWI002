package maven.hiber.demo.MavenHiberDemo;

import javax.persistence.Embeddable;

@Embeddable

public class Certificate {
private String course;
private String duration;
private String teachBy;
public Certificate(String course, String duration, String teachBy) {
	super();
	this.course = course;
	this.duration = duration;
	this.teachBy = teachBy;
}
public Certificate() {
	super();
	// TODO Auto-generated constructor stub
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public String getTeachBy() {
	return teachBy;
}
public void setTeachBy(String teachBy) {
	this.teachBy = teachBy;
}



}
