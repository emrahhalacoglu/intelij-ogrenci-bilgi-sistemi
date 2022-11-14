public class Teacher {
    String name;
    String mpNo;
    String branch;

    Teacher(String name,String mpNo,String branch){
        this.name=name;
        this.mpNo=mpNo;
        this.branch=branch;

    }
    void teacherInfoPrint(){
        System.out.println("Name : "+name);
        System.out.println("Mobile Phone Number : "+mpNo);
        System.out.println("Branch : "+branch);
    }


}
