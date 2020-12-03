package pageModels;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.PositionSalaryPage;
import utilities.ParentClass;

public class xx extends ParentClass {

    @Test
    public void positionSalaryTest2() {
        HomePage hp = new HomePage();
        hp.getHomePage();
        hp.login("daulet2030@gmail.com","TechnoStudy123@");

        PositionSalaryPage ps = new PositionSalaryPage();
        ps.getPage();
        String name = "SubjectPosSalary";
        ps.add(name);
        ps.clickToAddPositionSalary(name);
        ps.addPositionSalaryTo("3", "2020-05-05", "10000", "USD");
        ps.getPage();
        ps.delete(name);
        ps.notificationResult(NotificationResults.Error);
        ps.clickToAddPositionSalary(name);
        ps.delete("3");
        ps.getPage();
        ps.delete(name);
    }
}
