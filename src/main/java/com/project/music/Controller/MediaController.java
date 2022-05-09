package com.project.music.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.music.entity.Media;
import com.project.music.links.MediaLinks;
import com.project.music.service.MediaService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/")
public class MediaController {

	@Autowired
	MediaService mediaService;
	
	@GetMapping(path = MediaLinks.LIST_MEDIA)
	public ResponseEntity<?> listMedia() {
		//log.info("MediaController: list media");
		List<Media> resource = mediaService.getMedia();
		return ResponseEntity.ok(resource);
	}
	
	@PostMapping(path = MediaLinks.ADD_MEDIA)
	public ResponseEntity<?> saveMedia(@RequestBody Media media) {
		//log.info("MediaController: list media");
		Media resource = mediaService.saveMedia(media);
		return ResponseEntity.ok(resource);
	}
}
