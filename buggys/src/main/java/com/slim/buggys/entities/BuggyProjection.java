package com.slim.buggys.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomBug", types = { Buggy.class })
public interface BuggyProjection {
	public String getNomBuggy();
}
