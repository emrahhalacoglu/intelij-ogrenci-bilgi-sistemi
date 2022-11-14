public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(double note1,double quiz1,double note2,double quiz2,double note3,double quiz3){
        if(note1>=0&&note1<=100){
            this.c1.note=note1;
        }
        if(note2>=0&&note2<=100){
            this.c2.note=note2;
        }
        if(note3>=0&&note3<=100){
            this.c3.note=note3;
        }
        if(note1>=0&&note1<=100){
            this.c1.quiz=quiz1;
        }
        if(note2>=0&&note2<=100){
            this.c2.quiz=quiz2;
        }
        if(note3>=0&&note3<=100){
            this.c3.quiz=quiz3;
        }
    }

    void printNote(){
        System.out.println(this.c1.name+" notu\t"+this.c1.note);
        System.out.println(this.c2.name+" notu\t"+this.c2.note);
        System.out.println(this.c3.name+" notu\t"+this.c3.note);
        System.out.println("*******************************************");
    }

    void isPass(){
        this.avarage=((this.c1.note*0.8+this.c1.quiz*0.2)+(this.c2.note*0.8+this.c2.quiz*0.2)+(this.c3.note*0.8+this.c3.quiz*0.2))/3.0;
        System.out.println("*******************************************");
        if(this.avarage>=55){
            System.out.println("Avarage : "+this.avarage+" => PASSED!");
            this.isPass=true;
        }else{
            System.out.println("Avarage : "+this.avarage+" =>FAILLED!");
            this.isPass=false;
        }
    }

}
