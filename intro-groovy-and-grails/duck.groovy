/**
 * Demonstrates  Duck Typing in an Optionally Typed Language like Groovy
 *
 * author: Billy Conner 
 * twitter: @billyconnerjr
 */
class Duck{
    def quack(quack){
        println"${this.getClass()} says ${quack}"
    }
    def woddle(){
        println"woddles around calmly"
    }
    
}

class Goose{
    def quack(quack){
        println"${this.class} says ${quack}"
    }
    def woddle(){
       println "woddles around quietly"
    }
}

class Swan{
    def quack(quack){
        println "${this.getClass()} says ${quack}"
    }
    def woddle(){
        println "woddles around boldly"
    }
}

class Person{
    def quack(quack){
        println "${this.getClass()} says ${quack}"
    }
    
    def woddle(){
        println "woddles around like a duck"
    }
}



def ducklike = [new Duck(), new Goose(), new Swan(), new Person()]

ducklike.each{
    it.quack('hello')
    it.woddle()
}



