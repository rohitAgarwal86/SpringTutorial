package example1;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Questions {

	private int Id;
	private String question;
	private Map<Users, Answers> answers;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Map<Users, Answers> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Users, Answers> answers) {
		this.answers = answers;
	}
	
	public void display()
	{
		System.out.println("Question Id :" + this.Id);
		System.out.println("Question : " + this.question );
		System.out.println("Answers are .......");
		
		Set<Entry<Users, Answers>> set= answers.entrySet();
		Iterator<Entry<Users, Answers>> it =set.iterator();
		while(it.hasNext())
		{
			Entry<Users, Answers> ans =it.next();
			Users user =ans.getKey();
			Answers ans2=ans.getValue();
			
			System.out.println("User Details for the Answer : " + user.toString());
			System.out.println("Anser given by the User :" + ans2.toString());
		}
	}
}
