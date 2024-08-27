package pOO;

import java.util.Scanner;

/**
 This program shows a simple quiz with one question.
 */
public class App_Question
{
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
        Question first = new Question();
        first.setText("Who was the inventor of Java?");
        first.setAnswer("James Gosling");

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);

        presentQuestion(first);
        presentQuestion(second);
        
        TrueFalseQuestion third = new TrueFalseQuestion();
        String text = input.nextLine();
        input.nextLine();
        String answer = input.nextLine();
        third.setText(text);
        third.setAnswer(answer);
        String answerUser = input.nextLine();
        third.checkAnswer(answerUser);
        
        presentQuestion(third);
        
        ChoiceQuestionMoreTrue fourth = new ChoiceQuestionMoreTrue();
        fourth.setText("In which country was the inventor of Java not born in?");
        fourth.addChoice("Australia", true);
        fourth.addChoice("Canada", false);
        fourth.addChoice("Denmark", true);
        fourth.addChoice("United States", true);
        
        presentQuestion(fourth);
        
    }

    /**
     Presents a question to the user and checks the response.
     @param q the question
     */
    public static void presentQuestion(Question q)
    {
        q.display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(q.checkAnswer(response));
    }
}
