package com.tts.TechTalentBlog2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//model
@Entity
public class BlogPost {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String title;
	private String author;
	private String blogEntry;
	private String phrase;
	
	public BlogPost(String phrase) {
		this.phrase = phrase;
	}

	public BlogPost() {}
	
	public BlogPost(String title, String author, String blogEntry) {
		this.title = title;
		this.author = author;
		this.blogEntry = blogEntry;
	}
	
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBlogEntry() {
		return blogEntry;
	}
	public void setBlogEntry(String blogEntry) {
		this.blogEntry = blogEntry;
	}

	public String getPhrase() {
		return phrase;
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}
	
	@Override
	public String toString() {
		return "BlogPost [title=" + title + ", author=" + author + ", blogEntry=" + blogEntry + "]";
	}
	
	
	
}
