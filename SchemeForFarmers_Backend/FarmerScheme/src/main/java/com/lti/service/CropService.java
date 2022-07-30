package com.lti.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lti.entity.Crop;

@Component
public interface CropService {
	Crop findById(int cropId);
	public void updateCrop(Crop crop);
}
