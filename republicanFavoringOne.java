import java.util.ArrayList;

public class republicanFavoringOne implements IElectoralCollegeStrategy {
	double democraticElectoralVotes;
	double republicanElectoralVotes;
	public void StatInformation(ArrayList<State> sts) {
		 democraticElectoralVotes=0;
		 republicanElectoralVotes=0;
		for(State s: sts) {
			if((s.getPopVoteDem()> s.getPopVoteRep())&&(s.getStateName().compareTo(stateName.GEORGIA)!=0)){
					democraticElectoralVotes+=s.getElectoralCollegeNumber();
			}
			else if(((s.getPopVoteRep()> s.getPopVoteDem())||(s.getStateName().compareTo(stateName.GEORGIA)==0))){
				republicanElectoralVotes+=s.getElectoralCollegeNumber();
			}
		}
	}
	
	public double getElectoralRepVotes() {
		return republicanElectoralVotes;	
		
	}

	public double getElectoralDemVotes() {
		return democraticElectoralVotes;
	}
	
	
}