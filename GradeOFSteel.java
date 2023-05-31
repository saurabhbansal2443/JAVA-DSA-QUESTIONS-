public class GradeOFSteel {
    public static void main(String[] args) {
        int hardness = 100;
        double carbon = 0.9;
        int tensile= 7000;

        if(hardness>50 && carbon<0.7 && tensile>5600){
            System.out.println("Grade 10");
        }else if (hardness>50 && carbon<0.7){
            System.out.println("Grade 9");
        }else if(carbon<0.7 && tensile>5600){
            System.out.println("Grade 8");
        }else if (hardness>50 && tensile>5600){
            System.out.println("Grade 7");
        }else if (hardness>50 || carbon<0.7 || tensile>5600){
            System.out.println("Grade 6");
        }else{
            System.out.println("Grade 5");
        }
    }
}
