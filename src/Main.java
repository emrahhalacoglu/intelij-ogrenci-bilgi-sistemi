class Main {
    public static void main(String[] args) {


        Teacher t1= new Teacher("tarihçi","532","TRH");
        Teacher t2=new Teacher("fizikçi","542","FZK");
        Teacher t3=new Teacher("matematikçi","555","MAT");

        Course tarih=new Course("tarih","101","TRH");
        Course fizik=new Course("fizik","101","FZK");
        Course matematik=new Course("matematik","101","MAT");

        Student s1=new Student("s1","100","A",tarih,matematik,fizik);
        s1.addBulkExamNote(50,50,40,70,30,80);
        s1.isPass();
        s1.printNote();
        Student s2=new Student("s2","101","B",tarih,matematik,fizik);
        s2.addBulkExamNote(70,50,80,70,90,80);
        s2.isPass();
        s2.printNote();
        s2.isPass();
        s2.printNote();









    }
}