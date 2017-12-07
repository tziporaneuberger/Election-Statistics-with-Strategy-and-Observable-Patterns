import java.util.ArrayList;

public interface IElectoralCollegeStrategy {
	public void StatInformation(ArrayList<State> sts);
	public double getElectoralRepVotes();
	public double getElectoralDemVotes();
}
