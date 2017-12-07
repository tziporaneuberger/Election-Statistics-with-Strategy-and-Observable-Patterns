import java.util.ArrayList;


public class honestStrategy implements IPopularStateStrategy {
	double democraticTotalVotes ;
	double republicanTotalVotes ;

	public void StatInformation(ArrayList<State> sts) {
		democraticTotalVotes = 0;
		 republicanTotalVotes = 0;


		for (State s : sts) {
			democraticTotalVotes += s.getPopVoteDem();
			republicanTotalVotes += s.getPopVoteRep();
		}

	}

	public double getPopularVoteDemacratic() {
		return democraticTotalVotes;
	}

	public double getPopulatVoteRepublican() {
		return republicanTotalVotes;
	}

}
