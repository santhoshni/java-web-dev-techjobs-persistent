## Part 1: Test it with SQL
id(int),name(varchar),employer id(int)

## Part 2: Test it with SQL
SELECT * FROM employer WHERE location="stlouis"

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT s.name, s.description, j.id FROM techjobs.skill s LEFT JOIN techjobs.job j ON s.name = j.name WHERE j.id IS NOT NULL;