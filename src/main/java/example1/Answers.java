package example1;

import java.util.Date;

public class Answers {

	private int Id;
	private String answer;
	private Date postedDate;
	
	public Answers()
	{
		
	}
	
	
	public Answers( int Id, String answer, Date postedDate)
	{
		this.Id=Id;
		this.answer=answer;
		this.postedDate=postedDate;
	}
	
	
	
	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public Date getPostedDate() {
		return postedDate;
	}


	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}


	@Override
	public String toString()
	{
		return("Id :" + this.Id + "Answer " +this.answer + ":Posted Date :" + this.postedDate);
	}
}
