//package com.logrex.security;
//
//import com.logrex.entity.Roles;
//import com.logrex.entity.User;
//import com.logrex.exceptions.NotFoundExceptions;
//import com.logrex.repository.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@Service
//public class CustomUserDetailService implements UserDetailsService {
//
//    @Autowired
//    UserRepo userRepo;
//    @Override
//    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
//
//    User user=userRepo.findByUserNameOrEmail(usernameOrEmail,usernameOrEmail).orElseThrow(()->
//            new UsernameNotFoundException("User not exist email or user name"));
//
//        Set<GrantedAuthority> authorities = user.getRoles().stream()
//                .map((role) -> new SimpleGrantedAuthority(role.getName()))
//                .collect(Collectors.toSet());
//
//        return new org.springframework.security.core.userdetails.User(
//                usernameOrEmail,
//                user.getPassword(),
//                authorities
//        );
//    }
//}
