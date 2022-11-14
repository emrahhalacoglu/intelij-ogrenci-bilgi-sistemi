public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double quiz;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        double note=0;
        double quiz=0;

    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;


        }else{
            System.out.println("for "+ this.name +" course " + teacher.branch+" and "+this.prefix+" parameters are not match!");
        }
    }

    void courseInfoPrint(){
        System.out.println();
    }

}
