# R databases
```R
install.packages("RMySQL")
library("RMySQL")
conn = dbConnect(MySQL(), 
				 user = 'root', 
                 password = 'root', 
                 dbname = 'lakshay_db',
                host = 'localhost')

# List the tables available in this database.
dbListTables(conn)
query = "SELECT * FROM friends WHERE sex = 'Female'"
result = dbSendQuery(conn, query)

# Store the result in a R data frame object. n = 5 is used to fetch first 5 rows.
data.frame = fetch(result)
print(data.frame)
```