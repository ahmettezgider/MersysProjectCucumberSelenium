package x;

import org.openqa.selenium.By;
import static x.ElementTypes.*;


public enum FormLocators {
    name (By.cssSelector("ms-text-field[formcontrolname='name']>input"), ElementTypes.input),
    firstName (By.cssSelector("ms-text-field[formcontrolname='firstName']>input"), ElementTypes.input),
    middleName (By.cssSelector("ms-text-field[formcontrolname='middleName']>input"), ElementTypes.input),
    lastName (By.cssSelector("ms-text-field[formcontrolname='lastName']>input"), ElementTypes.input),
    shortName (By.cssSelector("ms-text-field[formcontrolname='shortName']>input"), ElementTypes.input),
    code (By.cssSelector("ms-text-field[formcontrolname='code']>input"), ElementTypes.input),
    country (By.cssSelector("ms-text-field[formcontrolname='country']>input"), ElementTypes.input),

    city (By.cssSelector("mat-form-field[formgroupname='city'] mat-select"), ElementTypes.selectbox),
    priority (By.cssSelector("ms-text-field[formcontrolname='priority']>input"), ElementTypes.input),
    description (By.cssSelector("ms-text-field[formcontrolname='description']>input"), ElementTypes.input),
    personalId (By.cssSelector("ms-text-field[formcontrolname='personalId']>input"), ElementTypes.input),
    studentId (By.cssSelector("input[formcontrolname='studentId']"), ElementTypes.input),
    gender (By.cssSelector("mat-select[formcontrolname='gender']"), ElementTypes.selectbox),
    gradeLevel (By.cssSelector("mat-form-field[formgroupname='currentGradeLevel'] mat-select"), ElementTypes.selectbox),
    schoolDepartment (By.cssSelector("mat-form-field[formgroupname='department'] mat-select"), ElementTypes.selectbox),
    section (By.cssSelector("mat-select[formcontrolname='section']"), ElementTypes.selectbox),
    mobilePhone (By.cssSelector("ms-masked-text-field[formcontrolname='phone']>input"), ElementTypes.input),
    mobilePhone_inTab (By.cssSelector("mat-dialog-content input[formcontrolname='phone']"), ElementTypes.input),
    email (By.cssSelector("input[formcontrolname='email']"), ElementTypes.input),
    citizenship (By.cssSelector("mat-form-field[formgroupname='citizenship'] mat-select"), ElementTypes.selectbox),
    nationality (By.cssSelector("mat-form-field[formgroupname='nationality'] mat-select"), ElementTypes.selectbox),
    previousSchoolName (By.cssSelector("input[formcontrolname='previousSchoolName']"), ElementTypes.input),

    // Tab elements
    firstName_inTab (By.cssSelector("mat-dialog-content input[formcontrolname='firstName']"), ElementTypes.input),
    lastName_inTab (By.cssSelector("mat-dialog-content input[formcontrolname='lastName']"), ElementTypes.input),
    country_inTab (By.cssSelector("mat-form-field[formgroupname='country'] mat-select"), ElementTypes.selectbox),
    document_inTab (By.cssSelector("mat-select[formcontrolname='type']"), ElementTypes.selectbox),
    documentNumber_inTab (By.cssSelector("input[formcontrolname='documentNumber']"), ElementTypes.input),
    representative_inTab (By.cssSelector("mat-select[formcontrolname='type']"), ElementTypes.selectbox),

    integrationCode (By.cssSelector("ms-text-field[formcontrolname='budgetAccountIntegrationCode']>input"), ElementTypes.input),
    active (By.cssSelector("mat-slide-toggle[formcontrolname='active'] input"), ElementTypes.input),
    subject (By.cssSelector("ms-text-field[formcontrolname='subject']>input"), ElementTypes.input),

    NAME (By.cssSelector("ms-text-field[placeholder$='NAME']>input"), ElementTypes.input),
    CODE (By.cssSelector("ms-text-field[placeholder$='CODE']>input"), ElementTypes.input),
    COUNTRY (By.cssSelector("ms-text-field[placeholder$='COUNTRY']>input"), ElementTypes.input),
    PRIORITY (By.cssSelector("ms-text-field[placeholder$='PRIORITY']>input"), ElementTypes.input),
    DESCRIPTION (By.cssSelector("ms-text-field[placeholder$='DESCRIPTION']>input"), ElementTypes.input),
    FIRSTNAME (By.cssSelector("ms-text-field[placeholder$='FIRST_NAME']>input"), ElementTypes.input),
    LASTNAME (By.cssSelector("ms-text-field[placeholder$='LAST_NAME']>input"), ElementTypes.input),
    SHORTNAME (By.cssSelector("ms-text-field[placeholder$='SHORTNAME']>input"), ElementTypes.input),
    PERSONAL_ID (By.cssSelector("ms-text-field[placeholder$='PERSONAL_ID']>input"), ElementTypes.input),
    INTEGRATION_CODE (By.cssSelector("ms-text-field[@placeholder$='INTEGRATION_CODE']>input"), ElementTypes.input),




    ;

    private By by;
    private ElementTypes type;

    FormLocators(By by, ElementTypes type){
        this.by = by;
        this.type = type;
    }

    public By by(){
        return by;
    }

    public ElementTypes type(){
        return type;
    }
}
