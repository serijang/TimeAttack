package main;

import java.util.ArrayList;
import java.util.List;

public class RouteTable {
    private String id;
    private String internetGateWay;
    private String natGateWay;
    List<RouteTable> Subnet = new ArrayList<>();

    public RouteTable {
    }

    public class Subnet() {
    }

    public class route() {
    }

    public void setGateWay(String internetGateWay) {
        this.internetGateWay = internetGateWay;
        this.natGateWay = natGateWay;
    }

    public String getInternetGateWay() {
        return this.internetGateWay;
    }
    public String getNatGateWay() {
        return this.natGateWay;
    }
}
