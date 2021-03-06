package com.bm.container.module.market.bean;

import java.util.List;

/**
 * Created by nfmomo on 17/4/27.
 */

public class BuyListBean {

    /**
     * currentPage : 1
     * data : [{"billCheque":"","billContent":"","billTelephone":"","billType":"","billTypeName":"","city":1,"cityName":"上海","containerStatus":1,"containerStatusName":"正在进行中","containerType":1,"containerTypeName":"20英尺X8英尺X8英尺6寸（20尺货柜）","count":2,"country":1,"countryName":"中国","createTime":"2017-04-26 15:20:21","createUser":"e9eaa785-762a-4df6-be21-6c31015e0f66","deadLineTime":"2017-04-26 17:20:21","id":"1495aa30-05c0-4769-83ed-39f13d2cd4c1","imageUrl":"","isSpecialPrice":"","isSupportBill":"","isTop":0,"price":"","scanCount":0,"specialPrice":"","specialRemark":"Ft","statusType":5,"statusTypeName":"二手","timeType":2,"timeTypeName":"2小时","tradeType":"","tradeTypeName":"","type":0,"updateTime":"","updateUser":""},{"billCheque":"","billContent":"","billTelephone":"","billType":"","billTypeName":"","city":2,"cityName":"北京","containerStatus":1,"containerStatusName":"正在进行中","containerType":1,"containerTypeName":"20英尺X8英尺X8英尺6寸（20尺货柜）","count":36,"country":1,"countryName":"中国","createTime":"2017-04-26 15:12:22","createUser":"e9eaa785-762a-4df6-be21-6c31015e0f66","deadLineTime":"2017-04-26 16:12:29","id":"d23ffbb0-47e6-4f9a-8210-7a292565d648","imageUrl":"","isSpecialPrice":"","isSupportBill":"","isTop":0,"price":"","scanCount":0,"specialPrice":"","specialRemark":"Ttt","statusType":5,"statusTypeName":"二手","timeType":1,"timeTypeName":"1小时","tradeType":"","tradeTypeName":"","type":0,"updateTime":"","updateUser":""},{"billCheque":"","billContent":"","billTelephone":"","billType":"","billTypeName":"","city":2,"cityName":"北京","containerStatus":1,"containerStatusName":"正在进行中","containerType":2,"containerTypeName":"40英尺X8英尺X8英尺6寸（40尺货柜）","count":2,"country":1,"countryName":"中国","createTime":"2017-04-26 15:04:31","createUser":"e9eaa785-762a-4df6-be21-6c31015e0f66","deadLineTime":"2017-04-26 16:04:38","id":"e4cfa69c-7400-4307-96da-836d23329ade","imageUrl":"","isSpecialPrice":"","isSupportBill":"","isTop":0,"price":"","scanCount":0,"specialPrice":"","specialRemark":"Ty","statusType":4,"statusTypeName":"全新","timeType":1,"timeTypeName":"1小时","tradeType":"","tradeTypeName":"","type":0,"updateTime":"","updateUser":""}]
     * error :
     * msg : 操作成功
     * pageCount : 1
     * pageData :
     * pageSize : 10
     * recordsTotal : 3
     * status : 1
     */

    private String currentPage;
    private String error;
    private String msg;
    private String pageCount;
    private String pageData;
    private String pageSize;
    private int recordsTotal;
    private String status;
    private List<InfoBean> data;

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getPageCount() {
        return pageCount;
    }

    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    public String getPageData() {
        return pageData;
    }

    public void setPageData(String pageData) {
        this.pageData = pageData;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<InfoBean> getData() {
        return data;
    }

    public void setData(List<InfoBean> data) {
        this.data = data;
    }

}
