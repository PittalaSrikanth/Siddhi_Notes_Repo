import os
import requests
import json
import xlrd


#print current working directory
print(print(os.getcwd()))

# opening the excel file
workbook = xlrd.open_workbook("./API_Test_Data.xlsx")

#selecting the sheet
sheet = workbook.sheet_by_name("Sheet1")

#printing sheet name
print(sheet.name)

#prinnting no.of rows in the sheet
print(sheet.nrows)

#prinnting no.of coloums in the sheet
print(sheet.ncols)


#prinnting cell type and cell value
print(sheet.cell(1,1))

#prinnting  cell value
print(sheet.cell_value(1,1))

#printing 1st coloum values
for i in range(sheet.nrows):
    print(sheet.cell_value(i, 0))
    #or
print(sheet.col_values(0))

#printing 2nd coloum values
for i in range(sheet.nrows):
    print(sheet.cell_value(i, 1))
    #or
print(sheet.col_values(1))

#printing 1st row values
for i in range(sheet.ncols):
    print(sheet.cell_value(0, i))
    #or
print(sheet.row_values(0))

#printing 2nd row values
for i in range(sheet.ncols):
    print(sheet.cell_value(1, i))
    #or
print(sheet.row_values(1))

# print number of sheets
print(workbook.nsheets)

# print sheet names
print(workbook.sheet_names())

# print row slice
print( sheet.row_slice(rowx=0,
                                start_colx=0,
                                end_colx=2))
# print row values without type
print( sheet.row_values(rowx=0,
                                start_colx=0,
                                end_colx=2))
# print coloum slice
print( sheet.col_slice(colx=0,
                                start_rowx=0,
                                end_rowx=2))

# print coloum slice without type
print( sheet.col_values(colx=0,
                                start_rowx=0,
                                end_rowx=2))

#print all cells
for cur_row in range(0, sheet.nrows):
    for cur_col in range(0, sheet.ncols):
        cell = sheet.cell(cur_row, cur_col)
        print(cell.value, cell.ctype)

#print all headers
header = sheet.row_values(0, start_colx=0, end_colx=None)
print(header)


def excelTestData(wbname):
    workbook = xlrd.open_workbook(wbname)
    sheet = workbook.sheet_by_name("Sheet1")
    alrows=[]
    for r in range(sheet.nrows):
        all_rows = sheet.row_values(r)
        alrows.append(all_rows)
    return alrows

BaseUrl = "https://reqres.in"
all_apis = excelTestData("./API_Test_Data.xlsx")
for i in range(len(all_apis)):
    print((all_apis)[i][0])
    print((all_apis)[i][1])
    print((all_apis)[i][2])
    print((all_apis)[i][3])
    if ((all_apis)[i][0])=="Get":
        resp = requests.get(BaseUrl + (all_apis)[i][1], params=((all_apis)[i][2]))
        print(resp.status_code)
        print((int((all_apis)[i][3])))
        assert (int((all_apis)[i][3])) == resp.status_code
    elif ((all_apis)[i][0]) == "Post":
            resp = requests.get(BaseUrl + (all_apis)[i][1], params=((all_apis)[i][2]))
            print(resp.status_code)
            print((int((all_apis)[i][3])))
            assert (int((all_apis)[i][3])) == resp.status_code
    elif ((all_apis)[i][0]) == "Delete":
            resp = requests.delete(BaseUrl + (all_apis)[i][1], params=((all_apis)[i][2]))
            print(resp.status_code)
            print((int((all_apis)[i][3])))
            assert (int((all_apis)[i][3])) == resp.status_code
    elif ((all_apis)[i][0]) == "Put":
            resp = requests.delete(BaseUrl + (all_apis)[i][1], params=((all_apis)[i][2]))
            print(resp.status_code)
            print((int((all_apis)[i][3])))
            assert (int((all_apis)[i][3])) == resp.status_code


