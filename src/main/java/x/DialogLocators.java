package x;

import org.openqa.selenium.By;

import static x.ElementTypes.*;


public enum DialogLocators {

    NameDialogForm (By.cssSelector("ms-text-field[formcontrolname='name']>input"), input),
    CodeDialogForm (By.cssSelector("ms-text-field[formcontrolname='code']>input"), input),
    CountryDialogForm (By.cssSelector("ms-text-field[formcontrolname='country']>input"), input),
    FirstNameDialogForm (By.cssSelector("ms-text-field[formcontrolname='firstName']>input"), input),
    MiddleNameDialogForm (By.cssSelector("ms-text-field[formcontrolname='middleName']>input"), input),
    LastNameDialogForm (By.cssSelector("ms-text-field[formcontrolname='lastName']>input"), input),
    ShortNameDialogForm (By.cssSelector("ms-text-field[formcontrolname='shortName']>input"), input),
    CityDialogForm (By.cssSelector("mat-form-field[formgroupname='city'] mat-select"), selectbox),
    SubjectCategoryDialogForm (By.cssSelector("mat-select[formcontrolname='id']"), selectbox),
    StyleDialogForm (By.cssSelector("mat-select[formcontrolname='value']"), selectbox),
    UserTypeDialogForm (By.cssSelector("mat-chip-list input"), multiSelectbox),
    ExpenseAccoutCodePrefixesDialogForm (By.cssSelector("mat-chip-list input"), multiSelectbox),
    ValidFormDialogForm (By.cssSelector("input[name='datePickerControl'] + input"), calander),
    KeyDialogForm (By.cssSelector("ms-text-field[formcontrolname='key']>input"), input),
    ValueIntDialogForm (By.cssSelector("ms-integer-field[formcontrolname='value']>input"), input), // in Salary
    PeriodCountDialogForm (By.cssSelector("ms-integer-field[formcontrolname='periodCount']>input"), input),
    RowSizeCountDialogForm (By.cssSelector("ms-integer-field[formcontrolname='rowSize']>input"), input),
    ColumnSizeCountDialogForm (By.cssSelector("ms-integer-field[formcontrolname='columnSize']>input"), input),
    TypeDialogForm (By.cssSelector("mat-select[formcontrolname='type']"), input),
    OrderNoDialogForm (By.cssSelector("ms-text-field[formcontrolname='orderNo']"), input),
    ValueTextDialogForm (By.cssSelector("ms-text-field[formcontrolname='value'] > input"), input),  // in Cost Centers


    NamePageForm (By.cssSelector("ms-text-field[placeholder$='NAME']>input"), input),
    CodePageForm (By.cssSelector("ms-text-field[placeholder$='CODE']>input"), input),
    CountryPageForm (By.cssSelector("ms-text-field[placeholder$='COUNTRY']>input"), input),
    FirstNamePageForm (By.cssSelector("ms-text-field[placeholder$='FIRST_NAME']>input"), input),
    LastNamePageForm (By.cssSelector("ms-text-field[placeholder$='LAST_NAME']>input"), input),
    ShortNamePageForm (By.cssSelector("ms-text-field[placeholder$='SHORTNAME']>input"), input),
    IntegrationCodePageForm (By.cssSelector("mat-form-field input[data-placeholder='Integration Code']"), input),



    ;

    private By by;
    private ElementTypes type;

    DialogLocators(By by, ElementTypes type){
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
