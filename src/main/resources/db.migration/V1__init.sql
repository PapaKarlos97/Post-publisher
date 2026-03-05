-- CREATE TABLE post_hub_local.v1_iam_service.posts(
--     id BIGSERIAL PRIMARY KEY,
--     title VARCHAR(255) NOT NULL,
--     content TEXT NOT NULL,
--     created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
--     likes INTEGER NOT NULL DEFAULT 0,
--     UNIQUE (title)
-- );

INSERT INTO post_hub_local.v1_iam_service.posts(title,content,created_at,likes) values ('Skates','This is content for first Post',CURRENT_TIMESTAMP,3  ),
                                                         ('Fight','High way to Fight is soul',CURRENT_TIMESTAMP,123  );