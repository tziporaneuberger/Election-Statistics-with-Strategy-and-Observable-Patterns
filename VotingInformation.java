import java.util.ArrayList;
import java.util.Observable;
/*
 * This observable uses the push method 
 */

public class VotingInformation extends Observable {

	public class returnsVotingInfo {
		ArrayList<State> states;

		public returnsVotingInfo(ArrayList<State> sts) {
			this.states = sts;
		}

		public ArrayList<State> getStates()

		{
			ArrayList<State> copy = new ArrayList<State>();
			for (State p : states) {
				copy.add(p);
			}

			return copy;
		}
	}

	ArrayList<State> states;
	public VotingInformation() {}


	public void statsChanged() {
		setChanged();
		notifyObservers(new returnsVotingInfo(states));
		
	}

	public void setStates(ArrayList<State> sts) {
		this.states = sts;
		statsChanged();
		

	}
}
