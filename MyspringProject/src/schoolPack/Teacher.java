package schoolPack;

public class Teacher {
   private int Id;
   private String name;
   private double salary;
   private int age;
   
   Teacher(){
	   
   }

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Teacher [Id=" + Id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
}
   
}
