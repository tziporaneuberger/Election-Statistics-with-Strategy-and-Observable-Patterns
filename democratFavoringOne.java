import java.util.ArrayList;

public class democratFavoringOne implements IElectoralCollegeStrategy {
	double democraticElectoralVotes;
	double republicanElectoralVotes;

	public void StatInformation(ArrayList<State> sts) {
		 democraticElectoralVotes=0;
		 republicanElectoralVotes=0;
		int highestElectoralVote = 0;
		for (State s : sts) {
			if (s.getElectoralCollegeNumber() > highestElectoralVote) {
				highestElectoralVote = s.getElectoralCollegeNumber();
			}
		}

		for (State s : sts) {
			if (s.getPopVoteRep() > s.getPopVoteDem() && s.getElectoralCollegeNumber() != highestElectoralVote) {
				this.republicanElectoralVotes += s.getElectoralCollegeNumber();
			} else {
				this.democraticElectoralVotes += s.getElectoralCollegeNumber();
			}
		}
	}

	public double getElectoralDemVotes() {
		return democraticElectoralVotes;
	}

	public double getElectoralRepVotes() {
		return republicanElectoralVotes;
	}

}
