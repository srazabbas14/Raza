public class questions {
	private String statement;
	private String op1;
	private String op2;
	private String op3;
	private String op4;
	private String answer;
	private String score;      // 1 for mcq   2 for true false  3 for numeric
	public questions() {
		this.setStatement("");
		this.setAnswer("");
		this.setOp1("");
		this.setOp2("");
		this.setOp3("");
		this.setOp4("");
		this.setScore("");
	}
	
	public  void SetQuestions(String statement  ,String op1, String op2 , String op3 , String op4 , String answer  , String score) {
		this.setStatement(statement);
		this.setAnswer(answer);
		this.setOp1(op1);
		this.setOp2(op2);
		this.setOp3(op3);
		this.setOp4(op4);
		this.setScore(score);
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getOp1() {
		return op1;
	}

	public void setOp1(String op1) {
		this.op1 = op1;
	}

	public String getOp2() {
		return op2;
	}

	public void setOp2(String op2) {
		this.op2 = op2;
	}

	public String getOp3() {
		return op3;
	}

	public void setOp3(String op3) {
		this.op3 = op3;
	}

	public String getOp4() {
		return op4;
	}

	public void setOp4(String op4) {
		this.op4 = op4;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String type) {
		this.score = type;
	}	
}

