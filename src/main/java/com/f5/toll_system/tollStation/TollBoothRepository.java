package com.f5.toll_system.tollStation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TollBoothRepository extends JpaRepository<TollStation, Long> {
}
