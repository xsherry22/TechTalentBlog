package com.tts.TechTalentBlog2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long>{

	BlogPost findBlogPostById(Long id);
	
	
}
