package com.crud.app.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crud.app.models.UserModel;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long>{


}
