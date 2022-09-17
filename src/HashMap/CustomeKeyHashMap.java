package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CustomeKeyHashMap {
    public static class Student{
        int rollNo;
        String name;

        public Student(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return rollNo == student.rollNo && Objects.equals(name, student.name);
        }


                @Override
        public int hashCode() {
           final int temp = 14;
           int ans = 1;
           ans = temp * ans + rollNo;
           return ans;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "rollNo=" + rollNo +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String args[]){
        Student s1 = new Student(101,"yogita");
        Student s2 = new Student(102,"yash");
        Student s3 = new Student(101,"yogita");
        Map<Student,String> map = new HashMap<>();
        map.put(s1,s1.getName());
        map.put(s2,s2.getName());
        map.put(s3,"astha");
        System.out.println(s1.getName());
        System.out.println(s2.getName());
        for(Map.Entry<Student,String > entry : map.entrySet()){
            System.out.println(entry.getKey().toString()+ " , " + entry.getValue());
        }
    }
}
