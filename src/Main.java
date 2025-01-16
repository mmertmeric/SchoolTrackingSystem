import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\n--- Öğrenci Not Takip Sistemi ---");
            System.out.println("1. Öğrenci Ekle");
            System.out.println("2. Öğrencileri Listele");
            System.out.println("3. Sınıf Not Ortalamasını Gör");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminizi Yapın");

            int choice =scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Öğrenci Adı:");
                    String name = scanner.nextLine();

                    System.out.print("Notları virgülle girin (Virgülle Ayırın) !!!");
                    String[] gradesInput = scanner.nextLine().split(",");
                    double[] grades = new double[gradesInput.length];

                    for (int i = 0; i < gradesInput.length; i++) {
                        grades[i] = Double.parseDouble(gradesInput[i].trim());
                    }

                    students.add(new Student(name, grades));
                    System.out.println("Öğrenci Başarıyla Eklendi !!!");
                    break;

                case 2:
                    if (students.isEmpty()){
                        System.out.println("Henüz Öğrenci Eklenmedi");
                    } else {
                        System.out.println("\n --- Öğrenci Listesi ---");
                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 3:
                    if (students.isEmpty()){
                        System.out.println("Henüz Öğrenci Eklenmedi");
                    } else {
                        double totalAverage=0;
                        for (Student student : students) {
                            totalAverage += student.calculateAverage();
                        }
                        System.out.println("Sınıf Not Ortalamsı:" + (totalAverage / students.size()));
                    }
                    break;

                case 4:
                    System.out.println("Çıkış Yapılıyor");
                    return;

                default:
                    System.out.println("Geçersiz Seçim Tekrar Deneyin !!!");
            }
        }
    }
}