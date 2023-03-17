import java.net.MalformedURLException;
import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalTime;

public final class Main {
	public static void main(String[] args) {
		FrameworkClass applicationOne = new ApplicationCaseOne();
		applicationOne.templateMethod();

		FrameworkClass applicationTwo = new ApplicationCaseTwo();
		applicationTwo.templateMethod();
	}

}
