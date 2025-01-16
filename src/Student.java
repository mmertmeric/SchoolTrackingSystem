public class Student {
    private String name;
    private double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public double[] getGrades() {
        return grades;
    }

    public double calculateAverage(){
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return grades.length > 0 ? sum / grades.length : 0;
    }

    @Override
    public String toString() {
        StringBuilder gradesString = new StringBuilder();
        for (double grade : grades) {
            gradesString.append(grade).append(" ");
        }
        return "Ad:"+name+", Notlar: ["+ gradesString.toString().trim() +"], Ortalama:" + calculateAverage();
    }
}
