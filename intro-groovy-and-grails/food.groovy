/**
 * Demonstrates using Groovy to serialze your classes into JSON strings
 *
 * author: Billy Conner 
 * twitter: @billyconnerjr
 */
import groovy.json.JsonOutput

class Food{
    String name
    Integer calories
    Double protein
    Double fat
    
    def fatCalories(){
        fat*9
    }
}

def dessert = new Food(name:'chocolate ice cream', calories:137, protein: 3.0, fat: 7.0)

def json = JsonOutput.toJson(dessert)


println json