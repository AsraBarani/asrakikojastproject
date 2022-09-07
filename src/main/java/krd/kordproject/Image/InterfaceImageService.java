package krd.kordproject.Image;

import java.util.List;

public interface InterfaceImageService {

    Image saveImageForUser(Image image, long userId);

    Image saveImageForPlace(Image image, long placeId);

    void delete(Long id);

    Image getById(Long id);

    List<Image> getAll();

    Image getByUserID(Long userId);

    List<Image> getAllByPlaceId(Long placeId);

}
