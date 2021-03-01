package com.company;

public class Teacher extends  Person{
    private  String lop;
    private float luongMotGio;
    private float soGioDayTrongThang;

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getLuongMotGio() {
        return luongMotGio;
    }

    public void setLuongMotGio(float luongMotGio) {
        this.luongMotGio = luongMotGio;
    }

    public float getSoGioDayTrongThang() {
        return soGioDayTrongThang;
    }

    public void setSoGioDayTrongThang(float soGioDayTrongThang) {
        this.soGioDayTrongThang = soGioDayTrongThang;
    }

    @Override
    public void inputInfo(String Ten, String GioiTinh, String NgaySinh, String DiaChi) {
        super.inputInfo(Ten, GioiTinh, NgaySinh, DiaChi);
    }

    public void inputInfo(String lop, float luongMotGio, float soGioDayTrongThang) {
        this.lop = lop;
        this.luongMotGio = luongMotGio;
        this.soGioDayTrongThang = soGioDayTrongThang;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Lop : " + lop);
        System.out.println("Luong mot gio : " + luongMotGio);
        System.out.println("So gio day trong thang : " + soGioDayTrongThang);

    }

    public float TinhLuong() {
        float n = 0;
        if ((lop.substring(lop.length() - 1)).toLowerCase().equals("i") == true
                || (lop.substring(lop.length() - 1)).toLowerCase().equals("k") == true
                || (lop.substring(lop.length() - 1)).toLowerCase().equals("g") == true
                || (lop.substring(lop.length() - 1)).toLowerCase().equals("h") == true) {
            n = luongMotGio * soGioDayTrongThang;
            return n;
        }
        if ((lop.substring(lop.length() - 1)).toLowerCase().equals("l") == true
                || (lop.substring(lop.length() - 1)).toLowerCase().equals("m") == true) {
            n = luongMotGio * soGioDayTrongThang + 200000;
            return n;
        }
        return n;
    }
}
