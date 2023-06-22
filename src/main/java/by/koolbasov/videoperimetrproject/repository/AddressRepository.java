package by.koolbasov.videoperimetrproject.repository;

import by.koolbasov.videoperimetrproject.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface AddressRepository extends JpaRepository<Address, Long> {
    @Query("select distinct address.city from Address address")
    Set<String> findAllCity();
    List<Address> findAddressesByCity(String city);
}
