package com.tts.TechTalentBlog2;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TagRepository extends JpaRepository<BlogPost, Long> {
	BlogPost findByPhrase(String phrase);
}
