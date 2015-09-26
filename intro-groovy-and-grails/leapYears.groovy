/**
 * Demonstrates how to mimic Python list comprehension in Groovy using the collect() method
 *
 * author: Billy Conner 
 * twitter: @billyconnerjr
 */

//range of years to examine
def years = 1800..2016

// using the findAll to conditionally filter the years
def leapYears = years.findAll{ it%4 == 0 && it%100 !=0 || it % 400==0 }
println leapYears

//combining this with the collect() method allows you to mimic Python's list comprehension behavior
def numOfYearsAgoLastLeapYear = years.findAll{ it%4 == 0 && it%100 !=0 || it % 400==0 }.collect{ years.max()-it}.sort()
println numOfYearsAgoLastLeapYear


