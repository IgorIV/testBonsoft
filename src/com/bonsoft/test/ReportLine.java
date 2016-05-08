/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonsoft.test;

import java.util.ArrayList;

/**
 *
 * @author igor
 */
public class ReportLine {
    private String name;
    private final ArrayList<Integer> hours = new ArrayList<>();
    private final ArrayList<Integer> counts = new ArrayList<>();  
    private static Integer minH = 24;
    private static Integer maxH = 0;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void add(Double hour, Double count) {
        hours.add(hour.intValue());
        counts.add(count.intValue());
        maxH = hour.intValue() > maxH ? hour.intValue() : maxH;
        minH = hour.intValue() < minH ? hour.intValue() : minH;
    }
    
    public static Integer getMinH() {
        return minH;
    }
    
    public static Integer getMaxH() {
        return maxH;
    }
    
    public Integer getLen() {
        if (hours.size() == counts.size()) {
            return hours.size();
        } else {
            return -1;
        }
    }
    
    public ArrayList<Integer> getHours() {
        return hours;
    }
    
    public ArrayList<Integer> getCounts() {
        return counts;
    }
}
