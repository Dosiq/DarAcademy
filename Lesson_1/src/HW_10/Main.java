package HW_10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1
        for(Colors color: Colors.values()){
            System.out.println(color);
        }


        //2
        for (Weekday weekday: Weekday.values()){
            System.out.println(weekday.isHoliday());
        }


        //3
        Worker Alan = new Worker(121209500949L, "Alan", "Baker", 21, "Java back-end developer", "Middle", 500000);
        Cat John = new Cat("John", "Siamese");
        System.out.println(Alan.walk());
        System.out.println(John.walk());


        //4
        Student st1 = new Student(5);
        Student st2 = new Student(3);
        Student st3 = new Student(1);
        Student st4 = new Student(2);
        Student st5 = new Student(5);

        ArrayList<Student> arrayList = new ArrayList();
        arrayList.add(st1);
        arrayList.add(st2);
        arrayList.add(st3);
        arrayList.add(st4);
        arrayList.add(st5);

        for (Student st: arrayList) {
            System.out.println(st.toString());
        }


        //5
        /*
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        map.put("Putin", 9999);


        while(true){
            System.out.println("------------------------------");
            System.out.println("|   1 - Add contact          |");
            System.out.println("|   2 - Show all contacts    |");
            System.out.println("|   3 - Update contact number|");
            System.out.println("|   4 - Find contact by name |");
            System.out.println("|   5 - Leave                |");
            System.out.println("------------------------------");
            int method = sc.nextInt();
            String name = "";
            Integer number = 0;
            switch(method){

                case 1:
                    System.out.println("Add name: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Add number: ");
                    number = sc.nextInt();
                    map.put(name, number);
                    break;
                case 2:
                    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

                    for (Map.Entry<String, Integer> entry : entrySet) {
                        System.out.println("Name: " + entry.getKey() + ", Number: " + entry.getValue());
                    }
                    break;
                case 3:
                    System.out.println("To update contact enter name: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Enter number: ");
                    number = sc.nextInt();
                    map.put(name, number);
                    break;
                case 4:
                    System.out.println("To find contact enter name: ");
                    sc.nextLine();
                    System.out.println("Number: " + map.get(sc.nextLine()));
                    break;
            }
            if(method == 5) break;
        }

        */


        //6
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Magenta");
        colors.add("Blue");
        colors.add("Black");

        for (String color: colors) {
            System.out.println(color);
        }


        //7
        ArrayList list1 = new ArrayList(Arrays.asList("DarUniversity", "Aidos"));
        ArrayList list2 = new ArrayList(Arrays.asList("DarUniversity", "Aidos"));

        boolean isArraysEqual = false;
        if(list1.size() == list2.size()){
            for (int i = 0; i < list1.size(); i++) {
                if(list1.get(i).equals(list2.get(i))){
                    isArraysEqual = true;
                }else{
                    isArraysEqual = false;
                    break;
                }
            }
        }else{
            isArraysEqual = false;
        }
        System.out.println(isArraysEqual);


        //8
        ArrayList<String> arrayList8 = new ArrayList(Arrays.asList("IITU", "KBTU", "SDU", "AITU"));
        arrayList8.set(2, "KAZGASA");

        System.out.println("---------------------------------");
        //9
        LinkedList linkedList = new LinkedList(Arrays.asList("IITU", "KBTU", "SDU", "AITU"));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());


        //10
        LinkedList list10 = new LinkedList(Arrays.asList(5,10,99,100,50,7,47));

        list10.set(1,100);
        list10.set(2,100);

        //11
        HashSet<Integer> set11First = new HashSet(Arrays.asList(5,10,99,100,50,7,47));
        HashSet<Integer> set11Second = new HashSet(Arrays.asList(5,0,99,5,8,7,9));

        HashSet<Integer> set11Same = new HashSet();

        for (Integer i: set11First) {
            if(set11Second.contains(i)){
                set11Same.add(i);
            }
        }

        //12
        HashSet set12 = new HashSet();
        System.out.println(set12.isEmpty());

        //13
        HashMap<Integer, String> map13 = new HashMap();
        map13.put(1, "IITU");
        map13.put(2, "AITU");
        map13.put(3, "KBTU");
        map13.put(4, "SDU");

        HashMap<Integer, String> map13Copy = new HashMap();
        map13Copy.putAll(map13);

        //14
        HashMap<Integer, String> map14 = new HashMap<>();
        map14.put(1, "IITU");
        map14.put(2, "AITU");
        map14.put(3, "KBTU");
        map14.put(4, "SDU");
        System.out.println(map14.containsValue("SDU"));




    }
}
