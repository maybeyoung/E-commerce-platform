package com.mmall.common;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * @Author: wsj
 * @Description:
 * @Create in 下午 10:52 2018/4/1 0001
 * @Modified by:
 */
public class Const {

    public static final String  CURRENT_USER ="currentUser";

    public interface Role{
           int ROLE_CUSTOMER = 0;//普通用户
           int ROLE_ADMIN = 1;//管理员
    }

    public interface ProductListOrderBy{
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_desc","price_asc");
    }

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public enum ProductStatusEnum {
        ON_SALE(1, "在线");
        private String value;
        private int code;

        ProductStatusEnum(int code, String value) {
            this.code = code;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public int getCode() {
            return code;
        }
    }
}
