package com.guige.parser.model.vo;

import com.guige.parser.entity.CompFundReportSheet;
import com.guige.parser.entity.ReportAccount;
import com.guige.parser.entity.ReportBeEntrusted;
import lombok.Data;

import java.util.List;

/**
 * 页vo
 *
 * @author Song.aw
 * @create 2017-11-10 16:03
 **/
@Data
public class CompFundReportSheetVo extends CompFundReportSheet {
    private List<ReportBeEntrusted> beEntrusteds;
    private List<ReportAccount> reportAccounts;

}
