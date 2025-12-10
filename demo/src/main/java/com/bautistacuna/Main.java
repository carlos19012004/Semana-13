package com.bautistacuna;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Paco",21,"paco@gmail.com","Lolas");
        Gson gson = new Gson();

        String json = gson.toJson(p);
        System.out.println(json);
    }
}