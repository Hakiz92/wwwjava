package vn.edu.iuh.fit.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.edu.iuh.fit.entities.*;
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {}