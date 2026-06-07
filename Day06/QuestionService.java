package Day06;
import java.util.Scanner;
public class QuestionService 
{
    Question [] questions = new Question[6]; //   not the actual question but the reference of question
    String [] selection =new String[6]; //array to store user selection
    public QuestionService(){ //constructor  to pass value to the array
        questions[0]= new Question(1,"Where are Java objects stored?","Heap","Stack","Cache","Disk","Heap");
        questions[1]= new Question(2,"What is an instance of a class?","Method", "Variable", "Object", "Package","Object");
        questions[2]= new Question(3,"Overloaded methods must differ in what?","Return type", "Parameters", "Visibility", "Name","Parameters");
        questions[3]= new Question(4,"Where are local variables stored?","Heap", "Stack", "Method Area", "ROM","Stack");
        questions[4]= new Question(5,"Which keyword instantiates an object?","create", "alloc","new", "init","new");
        questions[5]= new Question(6,"What acts as a blueprint in Java?","Method", "Object", "Array", "Class","Class");
    }
    public void displayQuestions() //display 
    { 
      Scanner sc =new Scanner(System.in); //user can select the option
      int i=0;
      System.out.println("Choose the best answer.");
      for(Question q :questions )
      {
        System.out.println("Questions :"+q.getId()); //display question number
        System.out.println(q.getQuestion()); //dispaly question
        System.out.println(q.getOption1()); //display option
        System.out.println(q.getOption2());
        System.out.println(q.getOption3());
        System.out.println(q.getOption4()); 
      
        selection[i]= sc.nextLine();
        i++;
     }
     System.out.println("your answer :");       
      for(String s :selection)
     {
        System.out.println(s); // dispaly the user selection
     }
 
    }
    public void printScore()
    {
        int score =0;
        for(int i=0;i<questions.length;i++){
            Question que= questions[i]; //contains question ,options and correct option
            String actualAnswer= que.getAnswer();
            String userAnswer= selection[i];;
            if(actualAnswer.equals(userAnswer)){
                score++;
            }

        }
       System.out.println("Your Score is: " + score + "/6");
        if (score == 6) {
            System.out.println("Perfect score! Outstanding job!");
        } 
        else if (score >= 4) {
            System.out.println("Well played!");
        } 
        else if (score >= 2) {
            System.out.println("Good effort! Keep studying.");
        } 
        else {
            System.out.println("Don't give up, try again!");
        }

    }
}
