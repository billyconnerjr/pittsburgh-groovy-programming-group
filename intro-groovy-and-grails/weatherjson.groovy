/**
 * Demonstrates pulling openweather data in Groovy
 *
 * author: Billy Conner 
 * twitter: @billyconnerjr
 */
import groovy.json.JsonSlurper

def js = new JsonSlurper()

String urlString = "http://api.openweathermap.org/data/2.5/forecast/city?id=524901&APPID=1111111111"

URL apiUrl = new URL(urlString)
def data = new JsonSlurper().parse(apiUrl)

println data