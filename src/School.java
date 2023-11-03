public class School {
    private String School;
    private String Derektor;
    private byte Student;

    public School(){

    }


    public School(String School,String Derektor, byte Student){
     this.School = School;
     this.Derektor = Derektor;
     this.Student = Student;

    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
       this.School = school;
    }

    public String getDerektor() {
        return Derektor;
    }

    public void setDerektor(String derektor) {
        this.Derektor = derektor;
    }

    public byte getStudent() {
        return Student;
    }

    public void setStudent(byte student) {
        this.Student = student;
    }
}