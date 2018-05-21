package com.hackathon.restapi.restservices.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.hackathon.restapi.restservices.entity.UserEntity;
//
////JpaRepositoty<entitybeanname,primarykey)
//public interface UserRepository extends JpaRepository<UserEntity,Integer>{
//	//optional returns null if no match find. it is null safe
//	Optional<List<UserEntity>> findByName(String name);
//	Optional<List<UserEntity>> findAll(String name);
//}