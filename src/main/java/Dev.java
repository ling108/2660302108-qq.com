public class Dev {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        System.out.println(4);
        System.out.println(5);
        Student student1;
        Student student = new Student();
        student.setName("12112");
        student1 = student;
        changeValue(student1);
        System.out.println(student.getName());

        String kk = "dssd";
        changeStringValue(kk);
        System.out.println(kk);


        System.out.println(1);
        System.out.println(2);
    }

    private static void changeValue(Student a) {
        a.setName("对对对");
    }

    private static void changeStringValue(String a) {
        a = "qwewe";
    }
}
