//package com.logrex.service.impl;
//
//import com.logrex.dto.LoginDTO;
//import com.logrex.dto.ResisterDTO;
//import com.logrex.entity.Roles;
//import com.logrex.entity.User;
//import com.logrex.exceptions.TodoApiException;
//import com.logrex.repository.RoleRepository;
//import com.logrex.repository.UserRepo;
//import com.logrex.service.AuthService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Service
//public class AuthServiceImpl implements AuthService {
//
//    @Autowired
//    private  UserRepo userRepo;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    private  RoleRepository repository;
//
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Override
//    public String resister(ResisterDTO resisterDTO) {
//
//        if (userRepo.existsByUserName(resisterDTO.getUsername())){
//
//            throw new TodoApiException(HttpStatus.BAD_REQUEST,"User already exists!");
//        }
//
//        if (userRepo.existsByEmail(resisterDTO.getEmail())){
//
//            throw new TodoApiException(HttpStatus.BAD_REQUEST,"Email already exists!");
//        }
//
//        User user= new User();
//        user.setName(resisterDTO.getName());
//        user.setUserName(resisterDTO.getUsername());
//        user.setEmail(resisterDTO.getEmail());
//        user.setPassword(passwordEncoder.encode(resisterDTO.getPassword()));
//
//        Set<Roles> roles= new HashSet<>();
//        Roles roles1=repository.findByName("ROLE_USER");
//        roles.add(roles1);
//        user.setRoles(roles);
//       userRepo.save(user);
//
//        return "User resistared sucessfully!";
//    }
//
//    @Override
//    public String longin(LoginDTO loginDTO) {
//
//       Authentication authentication= authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//
//                loginDTO.getUserNameOrEmail(),
//                loginDTO.getPassword()
//        ));
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//
//        return "User logged-in sucessfully....!";
//    }
//}
