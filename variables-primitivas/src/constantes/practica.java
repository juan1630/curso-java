package constantes;

public class practica {
    public static void main(String[] args) {
        int workDays = 10;

        double average = 7.5;
        int age = 16;

        boolean isAdult = age > 17;
        boolean hasPassingGrage = average > 7;

        workDays=20;
        workDays=30;


        System.out.println("workDays = " + workDays);
        //No se puede asignar ya que es una constante
        final double ANNUAL_INTEREST_RATE = 0.05;

        final  double TAX_RATE = 0.10;
        int grossSalary = 3000;
        double netSalary = grossSalary * (1- TAX_RATE);
        System.out.println("netSalary = " + netSalary);

        if( hasPassingGrage &&  isAdult ){
            System.out.println("El estudiante ha pasado de grado");
        }

        if(isAdult){
            System.out.println("Es adulto..");
        }else {
            System.out.println("No es un adulto");
        }
    }
}
