package com.edu.nefu.collectionstest;

import java.util.Iterator;
import java.util.LinkedList;

public class StudentTest {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        Student[] stu = new Student[5];
        stu[0] = new Student("刘德华", 85);
        stu[1] = new Student("张学友", 100);
        stu[2] = new Student("刘杰", 65);
        stu[3] = new Student("章子怡", 58);
        stu[4] = new Student("周迅", 76);
        for (Student u : stu) {
            students.add(u);

        }
//        System.out.println("对象个数为：" + students.size());
//        Iterator<Student> it = students.iterator();
//        while (it.hasNext()) {
//            it.next().toStudent();
//        }
//        Iterator<Student> its = students.iterator();
//        int i = -1;
//        while (its.hasNext()) {
//            i++;
//            if (its.next().getName().equals("刘杰")) {
//                break;
//            }
//        }
//        System.out.println("----------------------");
//        students.remove(i);
//        System.out.println("对象个数为：" + students.size());
//        Iterator<Student> itss = students.iterator();
//        while (itss.hasNext()) {
//            itss.next().toStudent();
//        }
//        System.out.println("----------------------");
//        Iterator<Student> itt = students.iterator();
//        int i = -1;
//        int mark = 0;
//        while (itt.hasNext()) {
//            i++;
//            mark = i;
//            if (itt.next().getName().equals("刘德华")) {
//                break;
//            }
//        }
//        i = -1;
//        Iterator<Student> iitt = students.iterator();
//        while (iitt.hasNext()) {
//            if (++i == mark) {
//                iitt.next().setScore(95);
//                break;
//            } else {
//                iitt.next();
//            }
//        }
//        Iterator<Student> iiitt = students.iterator();
//        while (iiitt.hasNext()) {
//            iiitt.next().toStudent();
//        }
//        Iterator<Student> it = students.iterator();
//        int[] arr = new int[10];
//        int i=-1;
//        while (it.hasNext()) {
//            ++i;
//            if (it.next().getScore()<60){
//                arr[i]=1;
//            }
//        }
//        Iterator<Student> itss = students.iterator();
//        i=0;
//        while (itss.hasNext()) {
//            if (arr[i]==1){
//                itss.next().toStudent();
//            }
//            else {
//                itss.next();
//            }
//            i++;
//        }
        System.out.println(students.get(1)); ;
    }
}
