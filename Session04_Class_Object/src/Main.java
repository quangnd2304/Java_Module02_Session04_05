import ra.dev.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ClassName objectName = new Constructor
        //1. Khoi tao doi tuong sinh vien 1 ma khong khoi tao bat cu thong tin gi
        Student st1 = new Student();
        //2. KHoi tao doi tuong sinh vien 2 va khoi tao thong tin ma sinh vien va ten sinh vien
        Student st2 = new Student("SV002","Nguyen Van B");
        //3. Khoi tao doi tuong sinh vien 3 va khoi tao tat ca thong tin sinh vien
        Student st3 = new Student("SV003","Nguyen Van C",22,true,"TP HCM");
        //4. Khoi tao doi tuong sinh vien 4 va khoi tao cac thong tin ma sinh vien, ten sinh vien, tuoi
        Student st4 = new Student("SV004","Nguyen Van D",25);
        //6. Nhap thong tin cho sinh vien 1
        System.out.println("NHAP THONG TIN SINH VIEN 1: ");
        st1.inputData();
        //7. Nhap thong tin cho sinh vien 2 su dung cac phuong thuc set
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP THONG TIN CON LAI CUA SINH VIEN 2: ");
        System.out.println("Nhap vao tuoi sinh vien: ");
        st2.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap vao gioi tinh sinh vien:");
        st2.setSex(Boolean.parseBoolean(sc.nextLine()));
        System.out.println("Nhap vao dia chi sinh vien: ");
        st2.setAddress(sc.nextLine());
        //8. In ra ten sinh vien 2 - su dung phuong thuc get
        System.out.println("Ten sinh vien 2 la: "+st2.getStudentName());

        //5. In ra thong tin cac sinh vien
        //Goi phuong thuc cua cac doi tuong: ObjectName.methodName(Argument)
        System.out.println("THONG TIN SINH VIEN 1: ");
        st1.displayData();
        System.out.println("THONG TIN SINH VIEN 2: ");
        st2.displayData();
        System.out.println("THONG TIN SINH VIEN 3: ");
        st3.displayData();
        System.out.println("THONG TIN SINH VIEN 4: ");
        st4.displayData();
    }
}