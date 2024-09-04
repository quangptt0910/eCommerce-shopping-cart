package com.qttp.demo_shops.repository;

import com.qttp.demo_shops.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}