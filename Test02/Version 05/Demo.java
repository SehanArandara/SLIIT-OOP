package TEST02;

class InvalidITNumberException extends Exception{
	
	public InvalidITNumberException(String msg) {
		super(msg);
	}
}

class Student {
	String StudentID;
	String StudentName;
	
	public Student(String studentID, String studentName){
		this.StudentID = studentID;
		this.StudentName = studentName;
	}
	
	public void display() throws InvalidITNumberException {
		if(this.StudentID.startsWith("IT") && this.StudentID.length()==10 && this.chechkInt()==true) {
			System.out.println("Student ID :"+this.StudentID);
			System.out.println("Student Name :"+this.StudentName);
		}
		else {
			throw new InvalidITNumberException("Invalid ID number");
		}
	
		
	}
	public boolean chechkInt() {
		Integer z = Integer.parseInt(this.StudentID.substring(2, 9));
		
		
		if(z.getClass().getSimpleName().equals("Integer")) {
			return true;
		}
		else {
			return false;
		}
	}
	 
	
}
public class Demo {
	public static void main(String[] args) {
		
		Student s = new Student("IT21164330", "Sehan");
		try {
			s.display();
		} catch (InvalidITNumberException e) {
			System.out.println(e);
		}
		
		
		
	}
}
