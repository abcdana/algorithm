SELECT
    count(id) as fish_count,
    max(ifnull(length, 10)) as max_length,
    fish_type
FROM FISH_INFO
GROUP BY FISH_TYPE
HAVING AVG(CASE WHEN LENGTH < 10 THEN 10 ELSE LENGTH END) >= 33
ORDER BY FISH_TYPE ASC;