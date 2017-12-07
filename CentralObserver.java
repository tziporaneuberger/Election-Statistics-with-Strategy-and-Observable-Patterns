import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Observable;
import java.util.Observer;

public abstract class CentralObserver implements Observer {

	ArrayList<State> states;
	IElectoralCollegeStrategy ElectoralCollegeStrategy;
	IPopularStateStrategy PopularStateStrategy;

	public void update(Observable observable, Object stateObject) {
		if (stateObject instanceof VotingInformation.returnsVotingInfo) {
			VotingInformation.returnsVotingInfo votingStats =  (VotingInformation.returnsVotingInfo) stateObject;
			this.states = votingStats.getStates();
			display();
		}
	}

	public String reportPopular() {
		PopularStateStrategy.StatInformation(states);
		return ("Popular Democrat vote  " + PopularStateStrategy.getPopularVoteDemacratic()
				+ " Popular Republican vote " + PopularStateStrategy.getPopulatVoteRepublican());
	}

	public String reportElectoral() {
		ElectoralCollegeStrategy.StatInformation(states);
		return ("Electoral Vote Democrat vote" + ElectoralCollegeStrategy.getElectoralDemVotes()
				+ "Electoral vote rupublican vote " + ElectoralCollegeStrategy.getElectoralRepVotes());

	}

	public void display() {
		System.out.println("**These reports are observational and are not leagely binding in any way**");
		VotingInformationDisplay();
		reportPopular();
		reportElectoral();
		System.out.println(this.getClass());
		System.out.println("\n" +" The date is now  " + LocalDate.now() + " \n");

	}

	public abstract void VotingInformationDisplay();

}
