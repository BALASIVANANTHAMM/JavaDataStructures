package com.java;
import java.util.*;

public class datastructures {
    public static void main(String[] args){
        String[] emp=new String[2];
        emp[0]="Madhav";
        emp[1]="Smithy";

        System.out.println(Arrays.toString(emp));
        System.out.println();
        for (int i= emp.length - 1; i>=0; i--){
            System.out.println(emp[i]);
        }
        for (String e:emp){
            System.out.println(e);
        }
        Arrays.stream(emp).forEach(System.out::println);
        System.out.println();

//        *************
        char[][] game=new char[3][3];

        for (int i = 0; i<3; i++){
            for (int j=0;j<3; j++){
                game[i][j]='0';
            }
        }
        System.out.println(Arrays.deepToString(game));

//        **************
        System.out.println();
        List system=new ArrayList();
        system.add("Mandy");
        system.add(121);
        system.add("amman kovil street,mangadu");
        system.add("Thiruvanamalai");

        for (Object l: system){
            System.out.println(l);
        }
//        System.out.println(system);
        System.out.println();

//        ***************

        Stack<String> chips=new Stack<>();
        chips.push("Nandhan");
        chips.push("Mandhan");
        chips.push("Anthan");

        System.out.println(chips.peek());
        System.out.println(chips);
        System.out.println(chips.pop());
        System.out.println(chips.peek());
        System.out.println();

//        *****************

        Queue<Passport> person = new LinkedList<>();

        person.offer(new Passport(
                123,
                "Ministry of India",
                2018,
                "Identification",
                "Indian",
                "10 years",
                1300
        ));
        person.offer(new Passport(
                127,
                "Ministry of India",
                2016,
                "Identification",
                "Indian",
                "10 years",
                1350
        ));
        person.offer(new Passport(
                124,
                "Ministry of India",
                2018,
                "Identification",
                "Indian",
                "10 years",
                1300
        ));
        person.offer(new Passport(
                125,
                "Ministry of India",
                2018,
                "Identification",
                "Indian",
                "10 years",
                1222
        ));
        person.offer(new Passport(
                129,
                "Ministry of India",
                2013,
                "Identification",
                "Indian",
                "12 years",
                700
        ));
        Iterator i=person.iterator();
        int g =1;
        while (i.hasNext()){
            Passport value= (Passport) i.next();
            System.out.println("Count "+g+" :"+value.passNumber+" ,"
            +value.issuedBy+" ,"
            +value.firstIssued+" ,"
            +value.purpose+" ,"
            +value.eligibility+" ,"
            +value.expiration+" ,"
            +value.cost);
            g++;
        }
        System.out.println();
//        **********************

        LinkedList<Person> list=new LinkedList<>();

        list.add(new Person("Tharun",21));
        list.add(new Person("Siva",22));
        list.add(new Person("Vijay",18));

        ListIterator<Person> pList= list.listIterator();

        while (pList.hasNext()){
            System.out.println(pList.next());
        }
        System.out.println();
        list.forEach(System.out::println);

//        *****************
        System.out.println();
        Set<Ball> set=new HashSet<>();
        set.add(new Ball("Orange"));
        set.add(new Ball("Green"));
        set.add(new Ball("White"));
        set.forEach(System.out::println);

//        ******************
        System.out.println();

        Map<Integer, Person> map=new HashMap<>();
        map.put(1,new Person("Alwin",10));
        map.put(2,new Person("Ananth",19));
        map.put(3,new Person("Arivu",12));
        System.out.println(map);
        System.out.println();
        map.entrySet().forEach(System.out::println);
        System.out.println();
        map.entrySet().forEach(x -> System.out.println(x.getKey() + "-" + x.getValue()));
        System.out.println();
        map.forEach((key,value)->{
            System.out.println(key+"--"+value);
        });
    }
    record Person(String name, int age) {}
    record Ball(String colors){}


}
