import java.util.ArrayList;

public class republicanFavoringTwo implements IElectoralCollegeStrategy {
	double democraticElectoralVotes;
	double republicanElectoralVotes;

	public void StatInformation(ArrayList<State> sts) {
		 democraticElectoralVotes=0;
		 republicanElectoralVotes=0;

		ArrayList<State> demLead = new ArrayList<State>();
		for (State s : sts) {
			if (s.getPopVoteDem() > s.getPopVoteRep()) {
				demLead.add(s);
			}
		}
		double least =demLead.get(0).getPopVoteDem();
		for (State s : demLead) {
			if (s.getPopVoteDem() < least) {
				least = s.getPopVoteDem();
			}
		}
		for (State s : sts) {
			if (s.getPopVoteDem() == least) {
				double split = s.getElectoralCollegeNumber() / 2;
				if (s.getElectoralCollegeNumber() % 2 != 0) {

					republicanElectoralVotes += (split + 1);
				} else {

					republicanElectoralVotes += split;
				}
				democraticElectoralVotes += split;
			} else if (s.getPopVoteDem() > s.getPopVoteRep()) {
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
