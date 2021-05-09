package com.leonardo.Rest.repository;


import com.leonardo.Rest.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityRepository extends JpaRepository<City, Long> {
    @Query(value = "select ((select lat_lon from cidade where id = ?1) <@> (select lat_lon from cidade where id=?2)) as distance", nativeQuery = true)
    Double distanceByPoints(Long city1, Long city2);

}
