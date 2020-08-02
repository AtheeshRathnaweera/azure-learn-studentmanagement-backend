-- added initial users
# INSERT INTO student (idstudent,name,email,phone,address,date_created,last_updated)
#   SELECT '1','atheesh','rathnaweeraatheesh72@gmail.com','0717223371','maharagama',NOW(),NOW()
# WHERE NOT EXISTS (SELECT idstudent FROM student WHERE idstudent = '1');
-- added initial users

# DROP TABLE IF EXISTS todotable;
# CREATE TABLE todotable (id SERIAL PRIMARY KEY, description VARCHAR(255), details VARCHAR(4096), done BOOLEAN);