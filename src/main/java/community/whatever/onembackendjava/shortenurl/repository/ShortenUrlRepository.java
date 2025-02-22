package community.whatever.onembackendjava.shortenurl.repository;

import community.whatever.onembackendjava.shortenurl.entity.ShortenUrl;
import java.util.Optional;

public interface ShortenUrlRepository {

    void save(ShortenUrl shortenUrl);
    Optional<ShortenUrl> findByShortenUrlKey(String shortenUrlKey);

}
