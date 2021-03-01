package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        List<Student> studentList = new ArrayList();
        while (true) {
            System.out.println(" chon 1: nhap sinh vien");
            System.out.println(" chon 2: hien thi sinh vien");
            System.out.println(" chon 3: sinh vien diem TB max&MIN");
            System.out.println(" chon 4: tim kiem sv theo masv");
            System.out.println(" chon 5: hien thi sinh vien theo a-z");
            System.out.println(" chon 6: Hiển thị tất cả các sinh viên được học bổng (cao-thap)");
            System.out.println(" chon 7: thoat");
            int choice = Integer.parseInt(scan.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhap so sinh vien can nhap");
                    int n = Integer.parseInt(scan.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("nhap sinh vien thu " + (i + 1));
                        System.out.println("nhap ten: ");
                        String ten = scan.nextLine();

                        System.out.println("nhap gioi tinh: ");
                        String gioitinh = scan.nextLine();

                        System.out.println("nhap ngay sinh: ");
                        String ngaysinh = scan.nextLine();

                        System.out.println("nhap dia chi");
                        String diachi = scan.nextLine();

                        System.out.println("nhap masv: ");
                        String maSV = scan.nextLine();
                        if (!(maSV.length() < 8)) {
                            System.out.println("Ma sinh vien phai it hon 8 ki tu");
                            break;
                        }

                        System.out.println("nhap diem trung binhh: ");
                        float diemTB = Float.parseFloat(scan.nextLine());
                        if (!(diemTB > 0 && diemTB <= 10)) {
                            System.out.println("diem trung binh lon hon 0 va nho hon 10");
                            break;
                        }

                        System.out.println("nhap email:");
                        String email = scan.nextLine();
                        if (!email.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")) {
                            System.out.println("phai co @ va khong dc khoang trang");
                            break;
                        }
                        student = new Student();
                        student.inputInfo(ten, gioitinh, ngaysinh, diachi, maSV, diemTB, email);
                        studentList.add(student);
                    }
                    break;
                case 2:
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfo();
                        System.out.println("----------------------");
                    }

                case 3:
                    Student max = new Student();
                    Student min = new Student();

                    for (int i = 0; i < studentList.size(); i++) {
                        for (int j = 0; j < studentList.size(); j++) {
                            if (studentList.get(i).getDiemTB() < studentList.get(j).getDiemTB()) {
                                max = studentList.get(j);
                            }

                            if (studentList.get(i).getDiemTB() < studentList.get(j).getDiemTB()) {
                                min = studentList.get(j);
                            }
                        }
                    }
                    System.out.println("sv co diem cao nhat: ");
                    max.showInfo();
                    System.out.println("sv co diem thap nhat: ");
                    min.showInfo();

                case 4:
                    System.out.println("nhap ma");
                    String ma = scan.nextLine();
                    Student student1 = new Student();
                    int j = 1;
                    for (int i = 0; i < studentList.size(); i++) {
                        if (ma.equals(studentList.get(i).getMaSV()) == true) {
                            j = 2;
                            student1 = studentList.get(i);
                        }

                    }
                    if (j == 1) {
                        System.out.println("khong ton tai ma");

                    } else {
                        student1.showInfo();
                    }

                case 5:
                    Collections.sort(studentList, new TenCompare());
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.get(i).showInfo();
                        System.out.println("------------------");
                    }
                    break;

                case 6:
                    System.out.println("ds sinh vien hoc bong");
                    List<Student> listStudent = new ArrayList<>();
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getDiemTB() >= 8) {
                            listStudent.add(studentList.get(i));
                        }

                    }
                    Collections.sort(listStudent, new DiemCompare());
                    for (int i = 0; i < listStudent.size(); i++) {
                        listStudent.get(i).showInfo();
                        System.out.println("------------------");
                    }
                    break;

                case 7:
                    return;


            }


        }

    }
}
