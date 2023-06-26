package com.example.UserManagementSystemWithValidations.UserManagamentSystem.bean;

import com.example.UserManagementSystemWithValidations.UserManagamentSystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {
    @Bean
    public List<User> getInitializedList()
    {
        User initUser = new User(0,"Swati Mahajan",LocalDate.of(2001,7,19),"swat@gmail.com","919898989898",LocalDate.of(2023,6,26),LocalTime.of(1,12,30));
        List<User> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}
