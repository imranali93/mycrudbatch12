package org.carrental.dao;

public class SqlQueryConstant {

    public final static String GET_ALL_CUSTOMER ="Select * from customer";
    public final static String GET_CUSTOMER_BY_ID ="Select * from customer where id =?";
    public final static String DELETE_CUSTOMER_BY_ID ="Delete from customer where id =? ";
    public final static String UPDATE_CUSTOMER_BY_ID ="Update customer set c_name =? where id = ?";
    public final static String
            INSERT_INTO_CUSTOMER= "Insert into customer " +
            "(c_name,phone_number,cnic,address,ref_phone_number) values (?,?,?,?,?)";

}
