package org.carrental;

import org.carrental.dao.CustomerDAO;
import org.carrental.domain.Customer;

public class Main {
    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAO();

//        Customer newCus = Customer.builder()
//                .name("Stepway-java")
//                .address("rew2432regt4g4wf4rgf")
//                .phoneNumber("2324242")
//                .cnic("2342434w4325")
//                .referencePhoneNumber("r42t4233243")
//                .build();
//
//        customerDAO.insert(newCus);

//         Customer customer = customerDAO.getById(6L);
//         customer.setName("imu-java");
//         customerDAO.update(customer,6L);
//        System.out.println(customerDAO.getById(6L));
        customerDAO.deleteById(6L);

        customerDAO.getAll().forEach(System.out::println);

    }
}