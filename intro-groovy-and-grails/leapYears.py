"""
Leap years using list comprehension
author: Billy Conner
twitter: @billyconnerjr
"""
# range of years to examine. Added extra year to compensate for Python range specifications
mylist = list(range (1800, 2017))

#listing every leap year in the range
leapYears = [year for year in mylist if year % 4 == 0 and year % 100 !=0 or year % 400 == 0]
print(leapYears)

#shows how many years ago the last leap years occured from the range.
numOfYearsAgoLastLeapYear = [max(mylist)-year for year in mylist if year % 4 == 0 and year % 100 !=0 or year % 400 == 0]
print(numOfYearsAgoLastLeapYear)
