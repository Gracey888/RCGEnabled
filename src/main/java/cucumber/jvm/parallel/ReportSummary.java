package cucumber.jvm.parallel;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReportSummary {
	public static void generateReportSummary(int passed, int failed, String env) {
		String FILENAME = "target/cucumber-report/ReportSummary_"+env+".txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
			double totalTestCase = passed+failed;
			double passedPercent = (passed/totalTestCase)*100;
			double failedPercent = (failed/totalTestCase)*100;
			bw.write("Report Summary "+env+" ---");
			bw.newLine();
			bw.write("Total Test Cases Executed: "+totalTestCase);
			bw.newLine();
			bw.write("Total Passed: "+passed);
			bw.newLine();
			bw.write("Total Failed: "+failed);
			bw.newLine();
			bw.write("Passed Percentage: "+passedPercent+"%");
			bw.newLine();
			bw.write("Failed Percentage: "+failedPercent+"%");
			bw.newLine();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}