package com.persevere.commons;

import java.io.Serializable;

/**
 * Created by ${Someone} on 2017/8/24.
 */
public class EasyUITreeNote implements Serializable {

	private Long id;
	private String text;
	private String state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
