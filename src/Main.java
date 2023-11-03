<<<<<<< HEAD
=======


import java.util.Scanner;

>>>>>>> 706b992 (Practikaoop1)
import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
        Company company = new Company("101","Кыргызстат","2023",
                "Paeksoft","Java-12","java,js,HTM");

        System.out.println(STR."""
                \{company.ComNema}
                \{company.strana}
                \{company.got}
                \{company.ocnovatel}
                \{company.osnovanie}
                \{company.groups}

                """);
    }
}
=======
          School schools = new School();

        System.out.println("название школы");
        schools.setSchool(new Scanner(System.in).nextLine());

        System.out.println("Name derektora");
        schools.setDerektor(new Scanner(System.in).nextLine());

        System.out.println("сколка студентов ");
        schools.setStudent(new Scanner(System.in).nextByte());

        System.out.println("название школы " +schools.getSchool());
        System.out.println("Name derektora " +schools.getDerektor());
        System.out.println("сколка студентов " +schools.getStudent());

       }
    }


//TODO         // Student
//     Scanner scanner = new Scanner(System.in);
//        Scanner scanner1 = new Scanner(System.in);
//               System.out.print("name:");
//         String name = scanner.nextLine();
//               System.out.print("surname: ");
//        String surname = scanner.nextLine();
//               System.out.print("age: ");
//         int age = scanner1.nextByte();
//                System.out.print("sabaktardyn sany: ");
//        int length= scanner1.nextInt();
//        String[] cours = new String[length];
//           for (int i = 0; i < cours.length; i++) {
//            System.out.print(" Enter course");
//            cours[i] = scanner.nextLine();
//        }
//        Student student = new Student(name,surname,age,cours);
//        student.showInfo();


>>>>>>> 706b992 (Practikaoop1)
