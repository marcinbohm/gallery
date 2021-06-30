package io.peritusact.gallery.gallery;

import io.peritusact.gallery.appuser.AppUser;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class AppUserImageGallery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Lob
    @Column(length = Integer.MAX_VALUE, nullable = true)
    private byte[] image;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @OneToOne
    @Column(
            nullable = false
    )
    private AppUser appUser;

    public AppUserImageGallery(String name, byte[] image, LocalDateTime createdAt, AppUser appUser) {
        this.name = name;
        this.image = image;
        this.createdAt = createdAt;
        this.appUser = appUser;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public byte[] getImage() {
        return image;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public AppUser getAppUser() { return appUser; }

}
