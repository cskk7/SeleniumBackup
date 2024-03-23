package testngPractice.excel1;

import com.google.common.collect.Table;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;


public class ExcelPrac {
    public static Iterator<Object[]> getTestData(String strWorkbookPath, String strWorksheetName) {
        List<Object[]> data = new ArrayList<Object[]>();
        int inRowCounter = 0;
        try {
            FileInputStream file = new FileInputStream(new File(strWorkbookPath));
            //Get the workbook instance for the xlsx file.
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            //Get the first sheet from the workbook
            HSSFSheet sheet = workbook.getSheet(strWorksheetName);
            //Get an iterator to all the rows in the current sheet
            Iterator<Row> rowIterator = sheet.rowIterator();
            Row firstRow = rowIterator.next();
            Map<String, String> columnNamesMap = getColumnNames(firstRow);
            while (rowIterator.hasNext()) {
                Iterator<Cell> cellIterator = rowIterator.next().cellIterator();
                Map<String, String> rowMap = new LinkedHashMap<>();

                for (Map.Entry entry : columnNamesMap.entrySet()) {
                    String strColumnName = entry.getKey().toString();
                    String strValue = cellIterator.next().toString();
                    rowMap.put(strColumnName, strValue);
                }
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data.iterator();
    }

    private static Map<String, String> getColumnNames(Row row) {
        Map<String, String> columnNamesMap = new LinkedHashMap();
        Iterator<Cell> cells = row.cellIterator();
        while (cells.hasNext()) {
            String strColumnName = cells.next().toString();
            columnNamesMap.put(strColumnName, strColumnName);
        }
        return columnNamesMap;
    }
}