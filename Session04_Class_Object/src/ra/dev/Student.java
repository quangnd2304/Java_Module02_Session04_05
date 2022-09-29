package ra.dev;

import java.util.Scanner;

public class Student {
    //1. Attributes/Fields: Access Modifiers + DataType + attName: The hien dac diem cua doi tuong;
    //Toàn cục
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;

    public static final String NATIONAL = "Viet Nam";

    //2. Constructors: Cac ham tao de khoi tao doi tuong: Access Modifier + ClassName(params)
    //Alt + Insert
    //Default
    public Student() {
    }

    public Student(String studentId, String studentName) {
        //this: thuoc tinh cua lop nay
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public Student(String studentId, String studentName, int age, boolean sex, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public Student(String studentId, String studentName, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
    }

    //3. Methods: Access Modifier + ReturnData + MethodName(params)
    //3.1. Getter/Setter

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //3.2. Cac phuong thuc the hien hanh vi cua doi tuong
    public void hello() {
        System.out.println("Hello");
    }

    public int add(int num1, int num2) {
        //Cuc bo
        int sum = num1 + num2;
        return sum;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma sinh vien: ");
        this.studentId = sc.nextLine();
        System.out.println("Nhap vao ten sinh vien: ");
        this.studentName = sc.nextLine();
        System.out.println("Nhap vao tuoi sinh vien: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao gioi tinh sinh vien: ");
        this.sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhap vao dia chi sinh vien: ");
        this.address = sc.nextLine();
    }

    public void displayData() {
        System.out.println("Thong tin sinh vien da bi ghi de");
    }
}
