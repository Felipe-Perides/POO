package pOO;

import java.util.ArrayList;

public class ChoiceQuestionMoreTrue extends Question{
	private ArrayList<String> choices;
	private ArrayList<String> answers;

    /**
     Constructs a choice question with no choices.
     */
    public ChoiceQuestionMoreTrue()
    {
        choices = new ArrayList<String>();
        answers = new ArrayList<String>();
    }

    @Override
    public void setAnswer(String correctAnswer) {
    	super.setAnswer(correctAnswer);
    	answers.add(correctAnswer);
    }
    
    /**
     Adds an answer choice to this question.
     @param choice the choice to add
     @param correct true if this is the correct choice, false otherwise
     */
    public void addChoice(String choice, boolean correct)
    {
        choices.add(choice);
        if (correct)
        {
            // Convert choices.size() to string
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }

    public void display()
    {
        // Display the question text
        super.display();
        // Display the answer choices
        for (int i = 0; i < choices.size(); i++)
        {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }
}
