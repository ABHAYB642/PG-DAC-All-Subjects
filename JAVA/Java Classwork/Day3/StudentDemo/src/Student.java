
public class Student {
  private int id;
  private String name;
  private int m1,m2,m3;
  public Student() {
	  this(0,null,0,0,0);
  }
  public Student(int id,String name,int m1,int m2,int m3) {
	  this.id=id;
	  this.name=name;
	  this.m1=m1;
	  this.m2=m2;
	  this.m3=m3; 
  }
  public int getId() {
	return id;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getM1() {
	return m1;
}
public void setM1(int m1) {
	this.m1 = m1;
}
public int getM2() {
	return m2;
}
public void setM2(int m2) {
	this.m2 = m2;
}
public int getM3() {
	return m3;
}
public void setM3(int m3) {
	this.m3 = m3;
}

  
}
