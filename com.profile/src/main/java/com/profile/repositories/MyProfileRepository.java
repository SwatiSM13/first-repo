package com.profile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.profile.entity.MyProfile;

public interface MyProfileRepository extends JpaRepository<MyProfile,Long> {

	
}
