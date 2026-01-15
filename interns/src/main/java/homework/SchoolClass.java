package homework;

public class SchoolClass extends Calculatable{
    int stundets;
    String nameTeacher;
    String surnameTeacher;

    SchoolClass(int stundets, String name, String surname){
        this.stundets = stundets;
        nameTeacher = name;
        surnameTeacher = surname;
        try {
            if (stundets <= 0){
                throw new Exception("Количество учеников не может быть меньше или равно 0");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public int getStudentCount(){
        return stundets;
    }
}


abstract class Calculatable {
    protected static int result = 0;
    protected final int COUNT_PAPER = 480;
    
    public void sum(){
        result += getStudentCount();
    }

    public void displayResult(){
       System.out.printf("На каждого ученика рассчитано "+ COUNT_PAPER / result +" листов бумаги.");
    }

    public abstract int getStudentCount();
}

