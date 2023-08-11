package schoolPack;

public class Student {
    private int stdId;
    private String name;
    private double marks;
    
    Student(){
    	
    }

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", marks=" + marks + "]";
	}
    
    
}
