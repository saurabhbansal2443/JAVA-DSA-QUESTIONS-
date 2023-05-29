import java.util.*;
class quiz {
    String Question;
    String option1;
    String option2;
    String option3;
    String option4;
    int ans;
}
public class QuizGame {

     

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        quiz[] ques = new quiz[2];
        ques[0]=new quiz();
        ques[0].Question = "Which of the following gods is also known as ‘Gauri Nandan’?";
        ques[0].option1 = "Agni";
        ques[0].option2 = "Chnadra";
        ques[0].option3 = "Hanuman";
        ques[0].option4 = "Ganesha";
        ques[0].ans = 4;

        ques[1]=new quiz();
        ques[1].Question = "The wife of which of these famous sports persons was once captain of Indian volleyball team?";
        ques[1].option1 = "Milka Singh";
        ques[1].option2 = "Sachin Tendulkar";
        ques[1].option3 = "Usian Bolt";
        ques[1].option4 = "Virat Kohli";
        ques[1].ans = 1;

     

        boolean winner = true;
        int num = 0;
      

        while (num < ques.length && winner == true) {

            quiz q = ques[num];

            System.out.println(q.Question);
            System.out.println("1 " + q.option1);
            System.out.println("2 " + q.option2);
            System.out.println("3 " + q.option3);
            System.out.println("4 " + q.option4);

            System.out.print("Choose the correct option   ");
           
            boolean correctOption = true;
            while(correctOption==true){
               
                int n = sc.nextInt();
            if(n==q.ans){
                System.out.println("Hurray! You choosed the correct option"); 
                System.out.println("\n\n\n"); 
                correctOption=false;
                num++;
                
            }else if(n==1 || n==2 || n==3 || n==4){
                System.out.println(" You have choosen the wrong option & You lost the game ");
                winner = false; 
                correctOption=false;
            }else{
                System.out.println("Invalid Option choosen ");
                System.out.print("Try to choose once again  ");
            }
        }

        }

    }
}
