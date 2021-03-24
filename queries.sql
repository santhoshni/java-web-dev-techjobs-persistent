## Part 1: Test it with SQL
id(int),name(varchar),employer id(int)

## Part 2: Test it with SQL
SELECT * FROM employer WHERE location="stlouis"

## Part 3: Test it with SQL
DROP TABLE job;

## Part 4: Test it with SQL
SELECT s.name, s.description, s.id FROM techjobs.skill s right JOIN techjobs.job_skills j ON s.id = j.skills_id WHERE j.jobs_id IS NOT NULL;
