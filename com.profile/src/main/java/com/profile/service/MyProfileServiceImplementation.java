package com.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.profile.entity.MyProfile;
import com.profile.repositories.MyProfileRepository;

@Service
public class MyProfileServiceImplementation implements MyProfileService{

	@Autowired
	MyProfileRepository repo;
	
	@Override
	public void createProfile(MyProfile profile) {
		repo.save(profile);
	}
}
