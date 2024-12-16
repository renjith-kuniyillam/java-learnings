package com.advancedjpa.demo.repositories;

import com.advancedjpa.demo.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface VideoRepository extends JpaRepository<Video, Integer> {
}
