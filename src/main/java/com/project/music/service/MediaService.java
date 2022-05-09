package com.project.music.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.project.music.entity.Media;
import com.project.music.repository.MediaRepository;

@Service
public class MediaService {
	
	@Autowired
	private MediaRepository mediaRepository;
	
	public MediaService(MediaRepository mediaRepository) {
		this.mediaRepository = mediaRepository;
	}
	
	public List<Media> getMedia() {
		return mediaRepository.findAll();
	}
	
	public Media saveMedia(Media media) {
		return mediaRepository.save(media);
	}

}
