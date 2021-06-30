package io.peritusact.gallery.gallery;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserImageGalleryService {

    private AppUserImageGalleryRepository appUserImageGalleryRepository;

    public void saveImage(AppUserImageGallery appUserImageGallery) {
        appUserImageGalleryRepository.save(appUserImageGallery);
    }

    public List<AppUserImageGallery> getAllActiveImages() {
        return appUserImageGalleryRepository.findAll();
    }

    public Optional<AppUserImageGallery> getImageById(Long id) {
        return appUserImageGalleryRepository.findById(id);
    }
}
