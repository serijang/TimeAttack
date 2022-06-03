package main;

import org.w3c.dom.ls.LSOutput;

public class Subnet {
    private int id;
    private String area;
    private String ip;
    private String routeTable;
    private String msg;

    public Subnet(){
    }

    public Subnet ( int id, String ip, String area) {
    }


    public class transfer(String msg) {
        if(msg == "") {
            System.out.println("내용이 없습니다.");
        }else {
            System.out.println(msg);
        }
    }

}
