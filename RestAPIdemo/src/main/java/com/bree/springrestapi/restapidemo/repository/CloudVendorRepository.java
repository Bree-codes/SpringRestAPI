package com.bree.springrestapi.restapidemo.repository;

import com.bree.springrestapi.restapidemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {
}
