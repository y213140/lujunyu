package com.bm.container.module.personal.bean;

/**
 * Created by nfmomo on 17/5/11.
 */

public class BeforePayBean {

    /**
     * currentPage :
     * data : {"bidOrder":"","bidOrderId":"","buyOrder":"","buyOrderId":"","container":"","containerId":"68921453-443f-44ce-86b0-f0125f0459c2","containerNo":"","count":33,"createTime":"","createUser":"e9eaa785-762a-4df6-be21-6c31015e0f66","createUserInfo":"","deadLineTime":"","finishTime":"","id":"1276fab0-acba-4f28-be9a-ddcd673617c2","orderNo":"FX201705111538000041","orderStatusType":1,"orderStatusTypeName":"待付款","paidUser":"0a846e77-c42a-4bfe-b4e1-fa6484857ad5","paidUserInfo":"","payType":1,"payTypeName":"微信","price":3,"receiveTime":"","remark":"","transactionId":"","updateTime":"","updateUser":""}
     * error :
     * msg : 操作成功
     * pageCount :
     * pageData :
     * pageSize :
     * recordsTotal :
     * status : 1
     */

    private String currentPage;
    private DataBean data;
    private String error;
    private String msg;
    private String pageCount;
    private String pageData;
    private String pageSize;
    private String recordsTotal;
    private String status;

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
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

    public String getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(String recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class DataBean {
        /**
         * bidOrder :
         * bidOrderId :
         * buyOrder :
         * buyOrderId :
         * container :
         * containerId : 68921453-443f-44ce-86b0-f0125f0459c2
         * containerNo :
         * count : 33
         * createTime :
         * createUser : e9eaa785-762a-4df6-be21-6c31015e0f66
         * createUserInfo :
         * deadLineTime :
         * finishTime :
         * id : 1276fab0-acba-4f28-be9a-ddcd673617c2
         * orderNo : FX201705111538000041
         * orderStatusType : 1
         * orderStatusTypeName : 待付款
         * paidUser : 0a846e77-c42a-4bfe-b4e1-fa6484857ad5
         * paidUserInfo :
         * payType : 1
         * payTypeName : 微信
         * price : 3
         * receiveTime :
         * remark :
         * transactionId :
         * updateTime :
         * updateUser :
         */

        private String bidOrder;
        private String bidOrderId;
        private String buyOrder;
        private String buyOrderId;
        private String container;
        private String containerId;
        private String containerNo;
        private String count;
        private String createTime;
        private String createUser;
        private String createUserInfo;
        private String deadLineTime;
        private String finishTime;
        private String id;
        private String orderNo;
        private String orderStatusType;
        private String orderStatusTypeName;
        private String paidUser;
        private String paidUserInfo;
        private String payType;
        private String payTypeName;
        private String price;
        private String receiveTime;
        private String remark;
        private String transactionId;
        private String updateTime;
        private String updateUser;

        public String getBidOrder() {
            return bidOrder;
        }

        public void setBidOrder(String bidOrder) {
            this.bidOrder = bidOrder;
        }

        public String getBidOrderId() {
            return bidOrderId;
        }

        public void setBidOrderId(String bidOrderId) {
            this.bidOrderId = bidOrderId;
        }

        public String getBuyOrder() {
            return buyOrder;
        }

        public void setBuyOrder(String buyOrder) {
            this.buyOrder = buyOrder;
        }

        public String getBuyOrderId() {
            return buyOrderId;
        }

        public void setBuyOrderId(String buyOrderId) {
            this.buyOrderId = buyOrderId;
        }

        public String getContainer() {
            return container;
        }

        public void setContainer(String container) {
            this.container = container;
        }

        public String getContainerId() {
            return containerId;
        }

        public void setContainerId(String containerId) {
            this.containerId = containerId;
        }

        public String getContainerNo() {
            return containerNo;
        }

        public void setContainerNo(String containerNo) {
            this.containerNo = containerNo;
        }

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getCreateUser() {
            return createUser;
        }

        public void setCreateUser(String createUser) {
            this.createUser = createUser;
        }

        public String getCreateUserInfo() {
            return createUserInfo;
        }

        public void setCreateUserInfo(String createUserInfo) {
            this.createUserInfo = createUserInfo;
        }

        public String getDeadLineTime() {
            return deadLineTime;
        }

        public void setDeadLineTime(String deadLineTime) {
            this.deadLineTime = deadLineTime;
        }

        public String getFinishTime() {
            return finishTime;
        }

        public void setFinishTime(String finishTime) {
            this.finishTime = finishTime;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getOrderStatusType() {
            return orderStatusType;
        }

        public void setOrderStatusType(String orderStatusType) {
            this.orderStatusType = orderStatusType;
        }

        public String getOrderStatusTypeName() {
            return orderStatusTypeName;
        }

        public void setOrderStatusTypeName(String orderStatusTypeName) {
            this.orderStatusTypeName = orderStatusTypeName;
        }

        public String getPaidUser() {
            return paidUser;
        }

        public void setPaidUser(String paidUser) {
            this.paidUser = paidUser;
        }

        public String getPaidUserInfo() {
            return paidUserInfo;
        }

        public void setPaidUserInfo(String paidUserInfo) {
            this.paidUserInfo = paidUserInfo;
        }

        public String getPayType() {
            return payType;
        }

        public void setPayType(String payType) {
            this.payType = payType;
        }

        public String getPayTypeName() {
            return payTypeName;
        }

        public void setPayTypeName(String payTypeName) {
            this.payTypeName = payTypeName;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getReceiveTime() {
            return receiveTime;
        }

        public void setReceiveTime(String receiveTime) {
            this.receiveTime = receiveTime;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getTransactionId() {
            return transactionId;
        }

        public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getUpdateUser() {
            return updateUser;
        }

        public void setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
        }
    }
}
