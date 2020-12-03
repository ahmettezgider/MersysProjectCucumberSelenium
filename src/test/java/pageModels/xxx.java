package pageModels;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.PositionSalaryPage;
import utilities.ParentClass;

public class xxx extends ParentClass {

    @Test
    public void positionSalaryTest2() {
        HomePage hp = new HomePage();
        hp.getHomePage();
        hp.login("daulet2030@gmail.com","TechnoStudy123@");

        clickOnMenuTo(NavBarObjects.Countries);
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.Cities);
        clickOnMenuTo(NavBarObjects.Countries);
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.Cities);
        clickOnMenuTo(NavBarObjects.Dashboard);
        clickOnMenuTo(NavBarObjects.Countries);
    }
}
