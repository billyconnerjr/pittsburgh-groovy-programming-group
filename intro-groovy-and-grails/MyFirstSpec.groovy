/**
 * Demonstrates using Grape to pull the spock dependency and perform a simple spock test
 *
 * author: Billy Conner 
 * twitter: @billyconnerjr
 */
@Grapes(
    @Grab(group='org.spockframework', module='spock-core', version='1.0-groovy-2.4')
)

import spock.lang.*

class MyFirstSpec extends Specification {
    def "yes we have no bananas"(){
        given:
        def fruit = ['apple', 'pear', 'bananas', 'orange']
        
        when:
        fruit.remove('bananas')
        
        then:
        fruit.contains('bananas') == false
    }
}