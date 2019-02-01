import pyodbc

con = pyodbc.connect('Driver={SQL Server};'
                      'Server=LAPTOP-PPDS6BPG;'
                      'Database=training;'
                      'Trusted_Connection=yes;')

cursor = con.cursor()


sql_query =  'SELECT * FROM Students'
try:
    cursor.execute(sql_query)
	for row in cursor:
		print(row)	        	       	
	except Exception as e:
	    print(e)
