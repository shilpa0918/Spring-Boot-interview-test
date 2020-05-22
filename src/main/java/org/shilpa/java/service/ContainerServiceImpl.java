package org.shilpa.java.service;

import org.shilpa.java.model.Container;
import org.shilpa.java.repository.ContainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContainerServiceImpl implements ContainerService{
	@Autowired
	ContainerRepository containerRepository;
	
	public Container save(Container container) {
		return containerRepository.save(container);
		
	}
}
