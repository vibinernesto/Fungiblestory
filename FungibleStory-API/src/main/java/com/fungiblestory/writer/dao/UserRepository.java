package com.fungiblestory.writer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fungiblestory.writer.model.User;

import java.io.Serializable;

@Repository
public interface UserRepository extends JpaRepository<User, Serializable> {

}
