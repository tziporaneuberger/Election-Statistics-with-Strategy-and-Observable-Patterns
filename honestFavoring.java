import java.util.ArrayList;

public class honestFavoring implements IElectoralCollegeStrategy {
	double democraticElectoralVotes;
	double republicanElectoralVotes;

	public void StatInformation(ArrayList<State> sts) {
		 democraticElectoralVotes=0;
		 republicanElectoralVotes=0;


		for (State s : sts) {
			if (s.getPopVoteDem() > s.getPopVoteRep()) {
				democraticElectoralVotes += s.getElectoralCollegeNumber();

			} else {
				republicanElectoralVotes += s.getElectoralCollegeNumber();

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
