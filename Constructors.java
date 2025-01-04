// default constructors and parameterized constructors

class StudentConstructor {
  String name;
  int roll;
  int age;
  float percentage;

  StudentConstructor() {
    System.out.println("Default constructor called !..");
  }

  StudentConstructor(String name, int roll, int age, float percentage) {
    this.name = name;
    this.roll = roll;
    this.age = age;
    this.percentage = percentage;
    System.out.println("Parametized contructor called !..");
  }

  void showStudentDetails() {
    System.out.printf("Name : %s, Roll : %d, Age : %d, Percetage: %f\n", name, roll, age, percentage);
  }
}

public class Constructors {
  public static void main(String args[]) {
    StudentConstructor studentOne = new StudentConstructor();
    studentOne.showStudentDetails();

    StudentConstructor studentTwo = new StudentConstructor("Bala Satish malladi", 27, 20, (float) 90.5);
    studentTwo.showStudentDetails();
  }
}