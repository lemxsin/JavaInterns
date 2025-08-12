package homework;

public class SchoolPaint {
    private int countOfCans = 120;
    private int whiteCan = 2;
    private int brownCan = 4;

    private int calculateClass(){
        return countOfCans / (whiteCan + brownCan);
    }

    private int calculateWhiteCans(){
        return calculateClass() * whiteCan;
    }

    private int calculateBrownCans(){
        return calculateClass() * brownCan;
    }

    public void printInfo(){
        System.out.printf("В школе, где %d классов, "
                + "нужно %d банок белой краски и %d банок коричневой краски.", 
                calculateClass(), calculateWhiteCans(), calculateBrownCans());
    }
}
