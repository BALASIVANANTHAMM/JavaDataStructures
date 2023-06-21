package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class App {
    public static void main(String[] args){
        Map<Per,Age> map=new HashMap<>();
        map.put(new Per("Aravinth"),new Age("21"));
        System.out.println(new Per("Aravinth").hashCode());
        System.out.println(map.get(new Per("Aravinth")));
    }
    record Age(String age){}
    static class Per {
        String name;

        public Per(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Per{" +
                    "name='" + name + '\'' +
                    '}';
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Per per = (Per) o;
            return Objects.equals(name, per.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

}
