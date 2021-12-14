package ss10_DSA_danhsach.bai_tap;

public class TestMyList {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Long");
        Student b = new Student(2, "Tuan");
        Student c = new Student(3, "Khoa");
        Student d = new Student(4, "Trong");
        Student e = new Student(5, "Ngoc");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);

//        System.out.println(studentMyList.size());
//        System.out.println(studentMyList.get(2).getName());
//        System.out.println(studentMyList.index0f(c));
//        System.out.println(studentMyList.contains(b));
        newMyList = studentMyList.clone();
        Student student = newMyList.remove(1);
        System.out.println(student.getName());
//        newMyList.remove(1);
//        for (int i = 0; i < newMyList.size(); i++) {
//            System.out.println(newMyList.get(i).getName());
//        }
    }
}
