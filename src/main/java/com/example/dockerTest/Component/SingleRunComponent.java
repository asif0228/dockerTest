package com.example.dockerTest.Component;

import com.example.dockerTest.Entity.UserEntity;
import com.example.dockerTest.Enum.StatusEnum;
import com.example.dockerTest.Enum.UserRoleEnum;
import com.example.dockerTest.Repo.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SingleRunComponent implements CommandLineRunner {

    private final UserRepo userRepo;

    public SingleRunComponent(UserRepo _userRepo) {
        this.userRepo = _userRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        this.addOneAdminInDbIfNotExist();
    }

    public boolean addOneAdminInDbIfNotExist(){
        try {
            Optional<UserEntity> userEntity = userRepo.findById(1);
            if (userEntity.isPresent()) return true;
            UserEntity user = new UserEntity(
                    "admin",
                    "admin",
                    "Admin@1234", // Password is Admin@1234
                    UserRoleEnum.Admin,
                    StatusEnum.Active,
                    1
            );
            userRepo.save(user);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}