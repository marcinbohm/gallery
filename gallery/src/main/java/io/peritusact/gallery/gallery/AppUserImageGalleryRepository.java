package io.peritusact.gallery.gallery;

import io.peritusact.gallery.appuser.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@Repository
public interface AppUserImageGalleryRepository
        extends JpaRepository<AppUserImageGallery, Long>{

    Optional<AppUserImageGallery> findById(Long Id);

    @Transactional
    @Modifying
    @Query("UPDATE AppUserImageGallery a " +
            "SET a.name = ?1 , a.createdAt = ?2, a.image = ?3, a.appUser = ?4")
    int updateAppUserImageGalleryRepository(String name,
                                            LocalDateTime cratedAt, byte[] image, AppUser appUser);
}
