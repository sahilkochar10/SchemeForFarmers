package com.lti.repository;

import java.util.List;

import com.lti.entity.Crop;

public interface CropRepository {
	Crop findById(int cropId);
	public void updateCrop(Crop crop);
}
