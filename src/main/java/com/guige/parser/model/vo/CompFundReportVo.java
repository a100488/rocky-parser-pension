package com.guige.parser.model.vo;

import com.guige.parser.entity.CompFundReport;
import lombok.Data;

import java.util.List;

/**
 * @author Song.aw
 * @create 2017-11-09 18:53
 **/
@Data
public class CompFundReportVo extends CompFundReport{

    private List<CompFundReportSheetVo> compFundReportSheets;
}
