package by.koolbasov.videoperimetrproject.repository;

import by.koolbasov.videoperimetrproject.entity.ArchiveInfo;
import by.koolbasov.videoperimetrproject.table.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArchiveInfoRepository extends JpaRepository<ArchiveInfo, Long> {

List<ArchiveInfo> findAllByStatus(Status status);
    @Modifying
    @Query("UPDATE ArchiveInfo u SET u.status = :newStatus WHERE u.id = :id")
    void upDateStatus(@Param("id") Long id, @Param("newStatus") Status status);
}
