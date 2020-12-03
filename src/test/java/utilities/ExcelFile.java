package utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelFile {

    String path = null;
    String fileName = null;
    private FileInputStream inputStream = null;
    private FileOutputStream outputStream = null;
    private Workbook workbook= null;
    private Sheet sheet = null;


    public ExcelFile(String path, String fileName){
        this.path = path;
        this.fileName = fileName;
    }

    public void write(String sheetName, String...args){

        String file= path + "/"+ fileName;

        try {
            workbook= WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet=workbook.getSheet(sheetName);

        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);

        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            outputStream=new FileOutputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
