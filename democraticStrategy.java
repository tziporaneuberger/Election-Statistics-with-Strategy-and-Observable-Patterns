import java.util.ArrayList;

public class democraticStrategy implements IPopularStateStrategy {
	double republicanTotalVotes;
	double democraticTotalVotes;

	public void StatInformation(ArrayList<State> sts) {
		 republicanTotalVotes=0;
		 democraticTotalVotes=0;
		double greatestValue = 0;

		for (State s : sts) {
			// loop through and find state with greatest popular vote
			if (s.getPopVoteRep() > greatestValue) {
				greatestValue = s.getPopVoteRep();

			}
		}

		for (State s : sts) {
			if (s.getPopVoteRep() < greatestValue) {
				republicanTotalVotes += s.getPopVoteRep();
				democraticTotalVotes += s.getPopVoteDem();
			}

		}
	}

	public double getPopularVoteDemacratic() {
		return democraticTotalVotes;
	}

	public double getPopulatVoteRepublican() {
		return republicanTotalVotes;
	}

}
