import mysql.connector

con = mysql.connector.connect(
  host="localhost",
  user="root",
  passwd="rkmr039@mysqL",
  database = "training"
)

cursor = con.cursor()

sql_query =  'SELECT * FROM Students'
try:
    cursor.execute(sql_query)
    for row in cursor:
    	print(row)       	       	
except Exception as e:
    print(e)
