package com.myblog.myblog2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoginImp {



    @Autowired
    private LoginImp loginImp;
    public static void main(String[] args) {

        String city="kolar";

        List<Login> details= Arrays.asList(
                new Login("mike","chennai"),
                new Login("sam","kolar")
        );
        List<LoginDto> dto=details.stream().map(n->mapToDto(n)).collect(Collectors.toList());
        System.out.println(dto);

    }
   static LoginDto mapToDto(Login login){
        LoginDto dto=new LoginDto();
        dto.setName(login.getName());
        dto.setCity(login.getCity());
        return dto;

    }
}
