package com.example.demo6.bean;

import lombok.Data;

@Data
public class KnowledgeFile {
    private Long id;
    private String fileName;
    private String url;

    // 01-云计算
    //02-大数据
    //03-车联网、
    //04-工业互联网
    //05-区块链
    //06-5G
    //07-人工智能
    //08-移动互联网
    //09-传统互联网
    //10-风险评估
    //11-等级保护
    //12-密码应用与安全性评估
    //13-信息技术与应用创新
    //14-其他
    private Integer techType;

    //01-党政
    //02-公安
    //03-军工
    //04-金融证券
    //05-运营商
    //06-电力行业
    //07-制造行业
    //08-教育行业
    //09-医疗行业
    //10-交通行业
    //11-其他
    private Integer industryType;

    //01-法律、法规
    //02-条例、办法、细则
    //03-通知
    //04-标准、规范
    //05-要求、指南、指引
    //06-重要指示、讲话
    //07-报告
    //08-安全峰会
    //09-其他
    private Integer contentType;
}
