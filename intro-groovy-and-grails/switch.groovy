/**
 * Demonstrates the switch statement in Groovy managing different types.
 *
 * author: Billy Conner 
 * twitter: @billyconnerjr
 */
class Person{
    String fname
    int age
}

Person bob = new Person(fname:'Bob', age:30)

[1, 'apple', 3.5, 'swimming', bob].each{ item ->
    println checkType(item)
}

def checkType(val) {
    def result
    switch (val) {
        case Integer:
            result = "5 + ${val} = ${val + 5}"
            break
        case BigDecimal:
            result = "2.5 + ${val} = ${val + 2.5}"
            break
        case ['banana', 'apple', 'pear']:
            result = "I'm here"
            break
        case Person:
            result = "${val.getFname()} is ${val.age} years old"
            break
		case ['rockclimbing', 'swimming', 'cycling']:
			result = "I like to go ${val}."
			break
        default:
            result = 'Who knows'
            break
    }    
    result
}
