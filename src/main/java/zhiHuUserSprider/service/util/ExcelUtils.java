package zhiHuUserSprider.service.util;

/**
 * Created by shuoyue on 16/3/4.
 */

import org.apache.poi.hssf.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class ExcelUtils {

    private HSSFWorkbook wb = null;

    private HSSFSheet sheet = null;

    public static void downloadReport(Object[][] result, String title) {
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet();
        ExcelUtils instance = new ExcelUtils(wb, sheet);
        instance.export(result, title);
    }

    /**
     * 构造器
     *
     * @param wb
     * @param sheet
     */
    public ExcelUtils(HSSFWorkbook wb, HSSFSheet sheet) {
        super();
        this.wb = wb;
        this.sheet = sheet;
    }

    /**
     * getter
     *
     * @return
     */
    public HSSFSheet getSheet() {
        return sheet;
    }

    /**
     * setter
     *
     * @param sheet
     */
    public void setSheet(HSSFSheet sheet) {
        this.sheet = sheet;
    }

    /**
     * getter
     *
     * @return
     */
    public HSSFWorkbook getWb() {
        return wb;
    }

    /**
     * setter
     *
     * @param wb
     */
    public void setWb(HSSFWorkbook wb) {
        this.wb = wb;
    }

    /**
     * 创建内容单元格
     *
     * @param row   HSSFRow
     * @param col   short型的列索引
     * @param val   列值
     */
    public void createCell(HSSFRow row, int col, String val, HSSFCellStyle cellstyle) {
        HSSFCell cell = row.createCell(col);
        cell.setCellType(HSSFCell.ENCODING_UTF_16);
        cell.setCellValue(new HSSFRichTextString(val));
        cell.setCellStyle(cellstyle);
    }

    /**
     * 对外提供的导出接口
     *
     * @param object
     * @param fileName
     */
    public void export(Object[][] object, String fileName) {
        HSSFCellStyle cellstyle = wb.createCellStyle();
        // 单元格字体
        HSSFFont font = wb.createFont();
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        font.setFontName("宋体");
        cellstyle.setFont(font);
        cellstyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        cellstyle.setWrapText(true);// 指定单元格自动换行

        for (int i = 0; i < object.length; i++) {
            HSSFRow row = sheet.createRow(i);
            //row.setHeight((short) 600);// 指定行高
            for (int j = 0; j < object[i].length; j++) {
                String val = String.valueOf(object[i][j]);
                createCell(row, j, val, cellstyle);
            }
        }

        outputExcel(fileName);
    }

    /**
     * 输入EXCEL文件
     *
     * @param fileName 文件名
     */
    public void outputExcel(String fileName) {
        try {
//            //重置response
//            response.reset();
//            // 设置response的Header
//            response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
//            // application/x-msdownload
//            // application/octet-stream
//            response.setContentType("application/vnd.ms-excel");
            FileOutputStream out = new FileOutputStream(new File("/Users/renfei/牛的数据.xls"));
//            OutputStream out = response.getOutputStream();
            wb.write(out);
            out.flush();
            out.close();
        } catch (IOException e) {
//            LOGGER.error(Throwables.getStackTraceAsString(e));
        }
    }
}

