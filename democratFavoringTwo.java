import java.util.ArrayList;

public class democratFavoringTwo implements IElectoralCollegeStrategy {
	double democraticElectoralVotes;
	double republicanElectoralVotes;
	
	public void StatInformation(ArrayList<State> sts) {
		 democraticElectoralVotes=0;
		 republicanElectoralVotes=0;
		for (State s : sts) {
			double percentage = s.getPopVoteRep() * .02;
			if ((s.getPopVoteDem() + percentage) > (s.getPopVoteRep() - percentage)) {
				democraticElectoralVotes += s.getElectoralCollegeNumber();
			} else {
				republicanElectoralVotes += s.getElectoralCollegeNumber();
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
