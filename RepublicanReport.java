import java.util.Observable;
import java.util.Observer;

public class RepublicanReport extends CentralObserver implements Observer {

	public RepublicanReport(Observable observable) {

		ElectoralCollegeStrategy = new republicanFavoringOne();
		PopularStateStrategy = new republicanStrategy();

		observable.addObserver(this);
	}

	public void VotingInformationDisplay() {
		{
			System.out.println(reportPopular());
			System.out.println(reportElectoral());
		}
	}
}
