ELECT DISTINCT V1.author_id AS id
FROM Views V1
JOIN Views V2 ON V1.author_id = V2.viewer_id AND V1.article_id = V2.article_id
ORDER BY id;
