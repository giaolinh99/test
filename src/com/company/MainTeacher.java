package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTeacher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Teacher> arr = new ArrayList();

        while (true) {
            System.out.println("1.Nhap giang vien");
            System.out.println("2.Hien thi thong tin cac giang vien");
            System.out.println("3.Hien thi giang vien co luong cao nhat");
            System.out.println("4.Thoat");
            int choice = Integer.parseInt(scan.nextLine());

            switch (choice) {
                case 1:

                    System.out.println("Nhap vao so luong giang vien : ");
                    int n = Integer.parseInt(scan.nextLine());
                    for (int i = 0; i < n; i++) {
                        Teacher teacher = new Teacher();
                        System.out.println("Nhap thong tin giang vien " + (i + 1));
                        System.out.println("Nhap ten : ");
                        String ten = scan.nextLine();
                        System.out.println("Nhap gioi tinh : ");
                        String gioiTinh = scan.nextLine();
                        System.out.println("Nhap ngay sinh : ");
                        String ngaySinh = scan.nextLine();
                        System.out.println("Nhap dia chi : ");
                        String diaChi = scan.nextLine();
                        System.out.println("Nhap lop : ");
                        String regex = "^[a-zA-Z][0-9]{4}[a-zA-Z&&[ghiklmGHIKLM]]$";
                        String lop = scan.nextLine();
                        if (!lop.matches(regex)) {
                            System.out.println("VD: c1903l,C1907I,c1903H");
                            break;
                        }
                        System.out.println("Nhap luong mot gio : ");
                        float luong = Float.parseFloat(scan.nextLine());
                        System.out.println("Nhap so gio day trong thang : ");
                        float gioday = Float.parseFloat(scan.nextLine());
                        teacher.inputInfo(ten, gioiTinh, ngaySinh, diaChi);
                        teacher.inputInfo(lop, luong, gioday);
                        arr.add(teacher);
                    }
                    break;
                case 2:
                    for (int i = 0; i < arr.size(); i++) {
                        arr.get(i).showInfo();
                        System.out.println("............");
                    }
                    break;
                case 3:
                    Teacher teacherMax = new Teacher();
                    ArrayList<Teacher> Temp = new ArrayList();
                    for (int i = 0; i < arr.size(); i++) {
                        for (int j = 0; j < arr.size(); j++) {
                            if (arr.get(i).TinhLuong() < arr.get(j).TinhLuong()) {
                                teacherMax = arr.get(j);
                            }
                        }

                    }
                    teacherMax.showInfo();
                    break;
                case 4:
                    return;
            }
        }

    }

}
