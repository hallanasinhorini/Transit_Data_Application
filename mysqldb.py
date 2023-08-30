import mysql.connector

def insertMBTARecord(mbtaList):
    mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    password="myluke",
    database="MBTAdb"
    )

    mycursor = mydb.cursor()
    #complete the following line to add all the fields from the table
    sql = "insert into mbta_buses ( router_number, id, bearing, current_status, current_stop_sequence, direction_id, label, longitude, latitude, occupancy_status, speed, updated_at ) values ( %s, %s, %s,  %s, %s, %s,%s, %s, %s, %s, %s, %s)"
    for mbtaDict in mbtaList:
        #complete the following line to add all the fields from the table
        val = (mbtaDict['router_number'],mbtaDict['id'], mbtaDict['bearing'], mbtaDict['current_status'],
               mbtaDict['current_stop_sequence'], mbtaDict['direction'], mbtaDict['label'],
               mbtaDict['longitude'], mbtaDict['latitude'],mbtaDict['occupancy_status'],
               mbtaDict['speed'],mbtaDict['updated_at']
               )
        mycursor.execute(sql, val)

    mydb.commit()