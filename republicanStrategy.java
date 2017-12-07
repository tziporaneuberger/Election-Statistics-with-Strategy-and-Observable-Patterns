import java.util.ArrayList;

public class republicanStrategy implements IPopularStateStrategy {
	double republicanTotalVotes;
	double democraticTotalVotes;
	

	public void StatInformation(ArrayList<State> sts) {
		 republicanTotalVotes=0;
		democraticTotalVotes=0;
		
		for (State s : sts) {

			democraticTotalVotes += s.getPopVoteDem() -(s.getPopVoteDem() *.05) ;
			republicanTotalVotes += s.getPopVoteRep();

		}
		//republicanTotalVotes=republicanTotalVotes-(republicanTotalVotes*.05);
	}

	public double getPopularVoteDemacratic() {
		return democraticTotalVotes;
	}

	public double getPopulatVoteRepublican() {
		return republicanTotalVotes;
	}

}