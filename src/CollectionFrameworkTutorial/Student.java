package CollectionFrameworkTutorial;

public class Student implements Comparable<Student> {
    private String studentname;
    private int rollno;
    private int studentage;

    public Student(int rollno, String studentname, int studentage) {
         this.rollno = rollno;
         this.studentname = studentname;
         this.studentage = studentage;
    }

    public String getStudentname() {
         return studentname;
    }
    public void setStudentname(String studentname) {
	this.studentname = studentname;
    }
    public int getRollno() {
	return rollno;
    }
    public void setRollno(int rollno) {
	this.rollno = rollno;
    }
    public int getStudentage() {
	return studentage;
    }
    public void setStudentage(int studentage) {
 	this.studentage = studentage;
    }

   // @Override
   /* public int compareTo(Object comparestu) {
		//int compareage=((Student)comparestu).getStudentage();
		int comparerollno=((Student)comparestu).getRollno();
        /* For Ascending order*/
        //return this.studentage-compareage;
		//return this.rollno-comparerollno;

        /* For Descending order do like this 
        //return compareage-this.studentage;
		//return comparerollno-this.rollno;
	}	*/
		
    		
	@Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }

	@Override
	public int compareTo(Student o) {
		if(this.studentage==o.studentage)
			return 0;
		else if (this.studentage>o.studentage)
			return 1;
		else
			return -1;
	}

}
