
public class State {


	stateName name;
	double popVoteDem;
	double popVoteRep;
	int electoralCollegeNumber;
   
    

	public State( stateName name,double popVoteDem,double popVoteRep,  int electoralCollegeNumber) {
		this.name=name;
		this.popVoteDem = popVoteDem;
		this.popVoteRep = popVoteRep;
		this.electoralCollegeNumber = electoralCollegeNumber;
	

	}

	
	public double getPopVoteDem() {
		return popVoteDem;
	}	

	public void setStatePopVoteDem(double popVoteDem) {
		this.popVoteDem = popVoteDem;
	}

	public stateName getStateName() {
		return name;
	}	

	public void setStateName(stateName name) {
		this.name = name;
	}
	public double getPopVoteRep() {
		return popVoteRep;
	}	

	public void setPopVoteRep(double popVoteRep) {
		this.popVoteRep = popVoteRep;
	}
	public int getElectoralCollegeNumber() {
		return electoralCollegeNumber;
	}
	public void setElectoralCollegeNumber(int electoralCollegeNumber) {
		this.electoralCollegeNumber = electoralCollegeNumber;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("State ");
		builder.append(name );
		builder.append(popVoteDem);
		builder.append(", popVoteRep=");
		builder.append(popVoteRep);
		if(popVoteDem >popVoteRep) {
			builder.append(electoralCollegeNumber + "towards the Democrats");
		}
		else {
			builder.append(electoralCollegeNumber + "towards the Republicans");
		}
		return builder.toString();
	}
		
	
}
