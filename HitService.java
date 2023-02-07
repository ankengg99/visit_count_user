package com.example.Hit.service;

import com.example.Hit.module.Hit;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class HitService {

    private static HashMap<String,Integer> map = new HashMap<>();

    public Hit addUser(String name){
       map.put(name,map.getOrDefault(name,0)+1);
       Hit obj=new Hit(name,map.get(name));
        return obj;
    }
}
