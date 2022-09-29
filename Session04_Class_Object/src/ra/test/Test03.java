package ra.test;

import ra.dev.Student;

public class Test03 extends Student {
    public static void main(String[] args) {
        Test03 t3 = new Test03();
        t3.studentId = "abc";

    }

    public void displayData(){
        System.out.println("Thong tin sinh vien da bi ghi de");
    }

    public final void inputData(){

    }
}
